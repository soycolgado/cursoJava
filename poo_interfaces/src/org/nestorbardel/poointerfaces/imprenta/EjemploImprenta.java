package org.nestorbardel.poointerfaces.imprenta;

import org.nestorbardel.poointerfaces.imprenta.modelo.*;
import static org.nestorbardel.poointerfaces.imprenta.modelo.Genero.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("John", "Doe"), "Ingeniero de sistemas", "Resumen laboral ...");
        cv.addExperiencia("Java")
        .addExperiencia("Oracle DBA")
        .addExperiencia("Spring Framework")
        .addExperiencia("Desarrollador FullStack")
        .addExperiencia("Angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseño: Elem Reusables POO",
                PROGRAMACION);

        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe informe = new Informe(new Persona("Martin", "Fowler"),
                new Persona("James","Gosling"),
                "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        System.out.println(Imprimible.TEXT_DEFECTO);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
