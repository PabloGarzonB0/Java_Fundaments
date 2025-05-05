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
    
  }
  
  
  public static void main(String[] args){
    int vector1[] = {11, 5, 6, 3, 8, 2, 10, 7, 8, 32};
    int vector2[] = vector1;

    // First orginize method
    vector1_sort = Burble_method(vector1);
    for(int auxiliar_var: vector1){   System.out.print(" " + auxiliar_var); }
    System.out.println();
  }
}
