package Java_Oracle.Interfaces.Ejemplo2I.Modelo;

public class ProyectoCatalogo {
    public static void main(String[] args){
        IProducto[] productos = new Producto[6]; //Array de productos que implementan la interfaz Iproductos

        productos[0] = new IPhone(19000, "Apple", "3G","Negro");
        productos[1] = new IPhone(39000, "Xiami", "4G", "Blanco");

        productos[2] = new TvLcd(27500, "Sony", 40);

        productos[3] = new Libro(17400, "Eric Gamma", "Elementos reusables POO", "Sin finiti");
        productos[4] = new Libro(14300,"Martha Foler","EL paradigma de la actualizacion","La oveja rusa");

        productos[5] = new Comics(2450, "Kurli branzon", "Charli y los churros","La casita azul","Chicarito");

        for (IProducto producto : productos){
            System.out.println();
            System.out.print("Tipo de: " + producto.getClass().getName());
            System.out.print(" - ");
            System.out.print("Precio: " + producto.getPrecio());
            System.out.print(" - ");
            System.out.print("Precio final: " + producto.getPrecioVenta());

            // Para los Electronicos ===========
            if(producto instanceof Electronico){
                System.out.println();
                System.out.print(" - ");
                System.out.print("Fabricante: " + ((Electronico) producto).getFabricante());
                // Para los dispositivos IPhone ============
                if (producto instanceof IPhone){
                    System.out.println();
                    System.out.print(" - ");
                    System.out.print("Modelo: " + ((IPhone)producto).getModelo());
                    System.out.print(" - ");
                    System.out.print("Color: " + ((IPhone)producto).getColor());
                }

                // Para los LCD ========================
                if (producto instanceof TvLcd){
                    System.out.println();
                    System.out.print(" - ");
                    System.out.print("Pulgadas: " + ((TvLcd)producto).getPulgada());
                }
            }
            // Para los libros =========================
            if(producto instanceof ILibro){
                System.out.println();
                System.out.print(" - ");
                System.out.print("Titulo: " + ((ILibro) producto).getTitulo());
                System.out.print(" - ");
                System.out.print("Autor: " + ((ILibro) producto).getAutor());

                if(producto instanceof Comics){
                    System.out.println();
                    System.out.print(" - ");
                    System.out.print("Personaje: " + ((Comics)producto).getPersonaje());
                }
            }
        }
    }
}
