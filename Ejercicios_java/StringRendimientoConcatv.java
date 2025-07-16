package Java_Oracle;

public class StringRendimientoConcatvs {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a); //Este string es mutable, puede ser modificable
        long inicio = System.currentTimeMillis();


        // Rendimiento en la ejecucion iterada de concatenaciones
        for(int i = 0; i < 500; i++){
            //c = c.concat(a).concat(b).concat("\n");  //500 => 1ms
            //c += a + b + "\n";  //500 => 9ms
            sb.append(a)
                    .append(b)
                    .append("\n");
            //string buider // 500 => 0ms
        }
        long finalidad = System.currentTimeMillis();
        System.out.println(finalidad - inicio);
        //System.out.println("sb = " + sb.toString());




    }
}
