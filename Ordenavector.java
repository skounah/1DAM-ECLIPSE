package org.institutoserpis.ed;

// algoritmo interesante: algoritmo quick Sort


public class ordenarVector {

	public static void main(String[] args) {
		
		int [] v = new int[] { 45, 33, 6 ,15, 7};
			

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
}

