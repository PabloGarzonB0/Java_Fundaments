package Ordenamiento;

public class Insercion {

  // Implementacion de clase estática 
	 static  int[] ordenamiento_insertacion(int vector[]) {
		int temp;
		for(int i =1; i < vector.length; i++) {
			temp = vector[i];
			// Inicializacion de variable j
			int j = i -1;
			while ((vector[j] > temp) && (j >= 0)) {
				vector[j+1] = vector[j];
				j--;
			}
			vector[j+1] = temp;
		}
		for(int value : vector) {
			System.out.println(" " + value);
		}
		return vector;
	}
	
	public static void main(String[] args) {
		int vector[] = {3,7,5,11,9,5,23,8};
		int vector2[]=  new int[vector.length];
		
		vector2 = ordenamiento_insertacion(vector);
		for(int number: vector2) {
			System.out.println(number);
		};
	}
}
