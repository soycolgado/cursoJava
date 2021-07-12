package org.nestorbardel.pooclasesabstractas.form;

import org.nestorbardel.pooclasesabstractas.form.elementos.*;
import org.nestorbardel.pooclasesabstractas.form.elementos.select.Opcion;
import org.nestorbardel.pooclasesabstractas.form.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6,12));

        InputForm email = new InputForm("email" , "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());


        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1", "Java");

        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2", "Python"))
        .addOpcion(new Opcion("3", "Javascript"))
        .addOpcion(new Opcion("4", "TypeScript").setSelected())
        .addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludo = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value='"+this.valor+"'>";
            }
        };

        saludo.setValor("Hola que tal este campo esta deshabilitado");

        username.setValor("john.doe");
        password.setValor("a1b2c");
        email.setValor("john.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("mas de 10 años de experiencia");
//        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(
                username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludo
        );
//
//        for(ElementoForm e: elementos){
//            System.out.println(e.dibujarHtml());
//            System.out.println("<br>");
//        }
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach(System.out::println);
            }
        });

    }
}
