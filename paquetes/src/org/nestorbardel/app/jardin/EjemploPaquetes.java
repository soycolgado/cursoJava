package org.nestorbardel.app.jardin;
import org.nestorbardel.app.hogar.*;
import static org.nestorbardel.app.hogar.Persona.*;
import static org.nestorbardel.app.hogar.ColorPelo.*;

public class EjemploPaquetes {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Nestor");
        p.setApellido("Bardel");
        p.setColorPelo(CAFE);
        System.out.println(p.getApellido());
        Perro perro = new Perro();

        perro.nombre = "Toby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);
        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;

    }
}
