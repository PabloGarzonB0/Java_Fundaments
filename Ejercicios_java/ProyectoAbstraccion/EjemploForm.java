package Java_Oracle.claseAbstracta;

import Java_Oracle.claseAbstracta.form.elementos.*;
import Java_Oracle.claseAbstracta.select.Opcion;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args){
        ElementoForm element = new ElementoForm() {
            // Implementacion de una clase anonima
            // No es reutilizable, solo se puede utilizar aqui
            @Override
            public String dibujarHTML() {
                return "";
            }};
        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");
        
        TextareaForm experiencia = new TextareaForm("exp", 5, 9);
        SelectForm lenguaje = new SelectForm("lenguaje");

        // Lista de elementos
        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpciones(java)
                .addOpciones(new Opcion("2", "Python"))
                .addOpciones(new Opcion("3", "JavaScript"))
                .addOpciones(new Opcion("4", "Typescript"))
                .addOpciones(new Opcion("5", "PHP"));


        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("john.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("... mas de 10 anios de experiencia ...");
        java.setSelected(true);

        // Elementos de la lista elementos
        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                edad,
                experiencia,
                lenguaje);

        for(ElementoForm e : elementos){
            System.out.println(e.dibujarHTML());
            System.out.println("<br>");
        }
        System.out.println("-------------------------------------------");
        elementos.forEach(e -> {
            System.out.println(e.dibujarHTML());
            System.out.println("<br>");
        });
    }
}
