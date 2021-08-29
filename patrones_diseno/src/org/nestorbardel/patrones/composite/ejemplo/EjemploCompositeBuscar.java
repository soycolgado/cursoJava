package org.nestorbardel.patrones.composite.ejemplo;

import org.nestorbardel.patrones.composite.Archivo;
import org.nestorbardel.patrones.composite.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {

        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));

        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stram-map.docx"));

        java.addComponente(stream);

        doc.addComponente(java);

        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpeg"));

//        System.out.println(doc.mostrar(0));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("Encontrado patron-composite.docx: " + encontrado);

        encontrado = doc.buscar("Api Strea");
        System.out.println("Encontrado Api Stream: " + encontrado);

        encontrado = doc.buscar("cv.docx");
        System.out.println("Encontrado cv.docx: " + encontrado);

    }

}
