package org.institutoserpis.ed;
	

	public class Vector {
		
		public static void main (String[] args) {
			
			int [] v = new int[] { 45, 33, 6 ,15, 7};	
			int [] w = new int[] { 33, 34, 40};
			
//			System.out.println("v.length= "+ v.length);	// la longitud
//			System.out.println("[0]= " +v[0]);
//			System.out.println("[4]= " +v[4]);
//			System.out.println("mostrar todos: ");
//					
//			show(v);
//			show(w);
			
//			int menor = min(v);
//			System.out.println("menor: "+menor);
			
			int index = indexOf(v, 100);
			System.out.println("index= "+index);
			
		}
				
		public static void show(int[] vector) {
			for (int index=0; index < vector.length; index++) {
				int x = index;
				System.out.println("x= " +x + " valor= " +vector[index]);
			}
		}
		
		
		public static int min(int[]v) {	// devuelve el valor más pequeño
			int minValue = v[0];
			for (int index=1; index < v.length; index++) {
				if (v[index] < minValue) {
					minValue = v[index];
				}
			}
			return minValue;
		}
				
		public static int indexOf(int[] v, int value) {	// devuelve la posicion del valor indicado
//			int index = 0;
//			while (index < v.length && v[index] != value)
//				index++;
//			if (index == v.length)
//				return -1;
//			
//			return index;

//			return 0; // puesto para comprobar el test
			
			for (int index = 0; index < v.length; index++)
				if(v[index] == value)
					return index;
			return -1;
		}
		
		public static void SelectionSort(int[] v) {	// 
			
			for (int indexItem = 0; indexItem < v.length - 1; indexItem++){
				int indexMin = indexItem;
				for (int index = indexMin+1; index < v.length; index++)
					if (v[index] < v[indexMin])
						indexMin = index;
				int aux = v[indexItem];
				v[indexItem] = v[indexMin];
				v[indexMin] = aux;
			}

		}
		
		// algoritmo de busqueda
		public static int binaryIndexOf (int[]v, int value){
			
			int left = 0,   right = v.length -1;
			
			while (left <= right){
				int center = (left + right) /2;
				if (v[center] == value)
					return center;
				if (value > v[center])
					left = center+1;
				else
					right = center -1;
			}
			return -1;
		}
		
			
	}
		
	

	
