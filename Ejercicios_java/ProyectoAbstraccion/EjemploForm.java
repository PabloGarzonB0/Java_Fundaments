package Java_Oracle.claseAbstracta;

import Java_Oracle.claseAbstracta.form.elementos.*;
import Java_Oracle.claseAbstracta.select.Opcion;
import Java_Oracle.claseAbstracta.validador.*;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args){

        // Creacion de elementos que llaman a la clase abstracta  ElementoForm
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());
        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12)); // Definir los valores entre un minimo y un maximo

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);
        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        // Lista de elementos
        Opcion java = new Opcion("1", "Java");
        Opcion Typescript = new Opcion("4", "Typescript");
        lenguaje.addOpciones(java)
                .addOpciones(new Opcion("2", "Python"))
                .addOpciones(new Opcion("3", "JavaScript"))
                .addOpciones(Typescript.setSelected())
                .addOpciones(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("Saludo") {
            @Override
            public String dibujarHTML() {
                return "<input disabled name='"+this.nombre+"' value=\"" + this.valor+ "\">";
            }
        }; // Elemento anonimo

        saludar.setValor("Hola que tal este campo se encuentra desabilitado");
        username.setValor("JohnCina");
        password.setValor("a3asdgw23");
        email.setValor("john.123gmail.comcom");
        edad.setValor("28");
        experiencia.setValor("... mas de 10 anios de experiencia ...");
        //java.setSelected(true);
        //Typescript.setSelected(trule);
        // Elementos de la lista elementos
        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                edad,
                experiencia,
                lenguaje,
                saludar);

        for(ElementoForm e : elementos){
            System.out.println(e.dibujarHTML());
            System.out.println("<br>");
        }
        System.out.println("-------------------------------------------");
        elementos.forEach(e -> {
            System.out.println(e.dibujarHTML());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach(System.out::println);
            }
        });
    }
}
