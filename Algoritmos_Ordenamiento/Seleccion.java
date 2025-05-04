package Ordenamiento;

public class Seleccion {

	static int[] seleccion(int vector[]) {
		int limite = vector.length;
		int temp,aux;
		for(int k =0; k<limite; k++) {
			temp = k;
			for(int f = k+1; f<limite;f++) {
				if(vector[f]<vector[temp]) temp=f;
			}
			if(temp != k) {
				aux = vector[temp];
				vector[temp] = vector[k];
				vector[k] = aux;
			}
		}
		return vector;
	}
	
	public static void main(String[] args) {
		int vector[] = {3,7,10,2,4,6,8,15,2};
		// Organizacion de vector con funcion externa
		vector = seleccion(vector);
		//Mostrar valores del vector
		System.out.println("Ordenamiento por seleccion: ");
		for(int value: vector) {
			System.out.print(" "+value);
		}	
	}
	}
