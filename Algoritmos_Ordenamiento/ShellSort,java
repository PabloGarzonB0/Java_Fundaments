package Ordenamiento;

public class ShellSort {

	static int[] ShellSort(int vector[]) {
		int tamano =vector.length;
		for(int increment = tamano/2; 
					increment >0; 
					increment =(increment==2 ?1: (int) Math.round(increment/2.2))) {
			for(int i = increment; i< vector.length;i++) {
				for(int j = i; j>= increment && vector[j - increment]> vector[j]; j -= increment) {
					int temp = vector[j];
					vector[j] = vector[j-increment];
					vector[j - increment] = temp;
				}}}

		return vector;
	}
	
	public static void main(String[] args) {
		int vector[] = {4,6,2,6,3,10,11,5,2};
		vector = ShellSort(vector);
		System.out.println("Organizacion por Shell Sort");
		for(int value: vector) {
			System.out.print(" "+ value);
		}
	}
	}
