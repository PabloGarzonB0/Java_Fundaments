package Java_Oracle.GenericsExercises;

public class MainCompras {
    public static void main(String[] args){
        // Creacion de elementos genericos en lista
        BolsaSupermercado<Fruta> BolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> BolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> BolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> BolsaNoPerecible = new BolsaSupermercado<>();

        // Agregacion de elementos a cada lista
        BolsaFrutas.addProducto(new Fruta("Sandia", 1200,1.5,"Verde a rayas"));
        BolsaFrutas.addProducto(new Fruta("Limones", 1500,2.3,"Verde claro"));
        BolsaFrutas.addProducto(new Fruta("Uvas", 800,0.7,"moradas oscuras"));
        BolsaFrutas.addProducto(new Fruta("Durazno", 1900,1.6,"naranja con rojo"));
        BolsaFrutas.addProducto(new Fruta("Manzana", 1300,1.3,"rojo"));

        BolsaLimpieza.addProducto(new Limpieza("Desinfectante Lavanda",1390,"Lyson",0.9));
        BolsaLimpieza.addProducto(new Limpieza("Gel con Lavandinca",2290,"Lysoform",0.45));
        BolsaLimpieza.addProducto(new Limpieza("Cloro",1540,"distosil",0.95));
        BolsaLimpieza.addProducto(new Limpieza("Quix",1830,"Lavaloza",1.2));
        BolsaLimpieza.addProducto(new Limpieza("Antibacterial",1640,"Cif",0.75));

        BolsaLacteos.addProducto(new Lacteo("Mantequilla con Sal soprole", 1300,2,250));
        BolsaLacteos.addProducto(new Lacteo("Yoghurt Griego", 1040,20,800));
        BolsaLacteos.addProducto(new Lacteo("Leche Blanca Descremada", 750,15,1500));
        BolsaLacteos.addProducto(new Lacteo("Crema de Leche caja", 950,4,900));
        BolsaLacteos.addProducto(new Lacteo("Lecha de chocolate descremada", 1200,30,1300));

        BolsaNoPerecible.addProducto(new NoPerecible("Porotos Hallado Bolsa", 2540,20,870));
        BolsaNoPerecible.addProducto(new NoPerecible("Arroz Grano Largo", 1340,500,1070));
        BolsaNoPerecible.addProducto(new NoPerecible("Porotos Negros", 1840,230,800));
        BolsaNoPerecible.addProducto(new NoPerecible("Atun de rio", 904,10,2000));

        System.out.println("------------------- FRUTAS ------------------------");
        for(Fruta fruta : BolsaFrutas.getProductos()){
            System.out.println("------- " + fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso (gr): " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor());
        }

        System.out.println("----------------- LIMPIEZA -----------------------");
        for(Limpieza prod: BolsaLimpieza.getProductos()){
            System.out.println("--------" + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Componentes: " + prod.getComponentes());
            System.out.println("Litros: " + prod.getLitros());
        }

        System.out.println("--------------- LACTEOS ------------------------");
        for (Lacteo prod : BolsaLacteos.getProductos()){
            System.out.println("----------------- " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Cantidad (gr/cc): " + prod.getCantidad());
            System.out.println("Proteinas (gr): " + prod.getProteinas());
        }

        System.out.println("---------------- NoPerecible -------------------");
        for(NoPerecible prod: BolsaNoPerecible.getProductos()){
            System.out.println("---------------" + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Calorias (kCal): " + prod.getCalorias());
            System.out.println("Contenido neto (gr): " + prod.getContenido());
        }
    }
}
