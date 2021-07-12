package org.nestorbardel.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<String>();
    }

    public Curriculo addExperiencia(String exp){
        this.experiencias.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(this.persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\nProfesion: ").append(this.carrera)
                .append("\nExperiencias: \n");

        for(String exp: this.experiencias){
            sb.append("- ").append(exp).append("\n");
        }


        return sb.toString();
    }
}
