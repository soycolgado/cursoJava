package org.nestorbardel.app.jardin;
import org.nestorbardel.app.hogar.Persona;

public class Perro {

    protected String nombre;
    protected String raza;

    String jugar(Persona persona)
    {
        return persona.lanzarPelota();
    }



}
