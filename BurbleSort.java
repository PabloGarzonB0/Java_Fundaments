package algoritmos_ordenamiento;

public class BurbleSort{

  static int[] Burble_method(int vector1[]){
    for(int i=1; i<vector1.length; i++){
      int temp;
      for(int j = 0; i<vector1.length-1;j++){
        if(vector1[j]>vector1[j+1]){
          temp = vector1[j];
          vector1[j] = vector1[1 + j];
          vector1[1+j] = temp;
        }
      }
    }
    return vector1;
  }

  static int[] Burble_method_optimized(int vector2[]){
    int temp;
    for(int i = 0; i<vector2.length-1 ; i++){
      for(int j = 0 ; j< vector2.length-i-1; j++){
        if(vector2[j] > vector2[j + 1]){
          temp = vector2[j];
          vector2[j] = vector2[j+1];
          vector2[j+1] = temp;
        }
      }
    }
    return vector2;
  }
  
  // METODO PRINCIPAL DE PRUEBA
  public static void main(String[] args){
    int vector1[] = {11, 5, 6, 3, 8, 2, 10, 7, 8, 32};
    int vector2[] = vector1;

    // First organize method
    int vector1_sort[] = Burble_method(vector1);
    for(int auxiliar_var: vector1){   System.out.print(" " + auxiliar_var); }
    System.out.println(" "+ auxiliar_var);
    
    // Second organize method
    int vector2_sort[] = Burble_method_optimized(vector2);
    for(int auxiliar_var : vector2_sort){
      System.out.print(" " + auxiliar_var);
    }
  }
}
