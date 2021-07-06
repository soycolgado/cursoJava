package org.aguzman.ejemplo;

import org.aguzman.pooherencia.Alumno;
import org.aguzman.pooherencia.AlumnoInternacional;
import org.aguzman.pooherencia.Persona;
import org.aguzman.pooherencia.Profesor;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo datos en comun de persona");
        System.out.println("nombre: " + persona.getNombre() + ", apellido: " + persona.getApellido() + ", edad: " + persona.getEdad() + ", mail: "+persona.getEmail());
         if(persona instanceof Alumno){
             System.out.println("Imprimiendo datos del tipo Alumno");
             System.out.println("Institucion: " + ((Alumno)persona).getInstitucion());
             System.out.println("Nota Matematica: " + ((Alumno)persona).getNotaMatematica());
             System.out.println("Nota Historia: " + ((Alumno)persona).getNotaHistoria());
             System.out.println("Nota Castellano: " + ((Alumno)persona).getNotaCastellano());

             if(persona instanceof AlumnoInternacional)
             {
                 System.out.println("Imprimiendo datos del tipo AlumnoInternacional");
                 System.out.println(((AlumnoInternacional) persona).getNotaIdiomas());
                 System.out.println("Pais: " + ((AlumnoInternacional)persona).getPais());
             }
             System.out.println("================== Sobre escritura promedio ====================");
             System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
         }
         if(persona instanceof Profesor){
             System.out.println("Imprimiendo datos del tipo Profesor");
             System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
         }
        System.out.println("================== SobreEscritura =======================");
        System.out.println(persona.saludar());

        System.out.println("==============================================");
    }
}
