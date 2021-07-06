package org.aguzman.ejemplo;

import org.aguzman.pooherencia.Alumno;
import org.aguzman.pooherencia.AlumnoInternacional;
import org.aguzman.pooherencia.Persona;
import org.aguzman.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("======================== CREANDO LA INSTANCIA DE LA CLASE ALUMNO =======================");
        Alumno alumno = new Alumno("Andres", "Guzman", 13, "Institucion Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("nestor@gmail.com");

        System.out.println("======================== CREANDO LA INSTANCIA DE LA CLASE ALUMNO INTERNACIONAL =======================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("flavio@gmail.com");

        System.out.println("======================== CREANDO LA INSTANCIA DE LA CLASE PROFESOR =======================");
        Profesor profesor = new Profesor("Luci", "Perez", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("canela@gmail.com");

        System.out.println("======================== -------- ===========================");
        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido() + " " + alumno.getInstitucion());

        System.out.println(alumnoInt.getNombre() +
                " " + alumnoInt.getApellido()+
                " " + alumnoInt.getInstitucion() +
                " " + alumnoInt.getPais()
        );

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println(persona);
    }
}
