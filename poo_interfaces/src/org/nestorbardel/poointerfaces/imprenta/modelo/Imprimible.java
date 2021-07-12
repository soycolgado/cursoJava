package org.nestorbardel.poointerfaces.imprenta.modelo;

public interface Imprimible {

    public final static String TEXT_DEFECTO = "Imprimiendo un valor por defecto";

    default String imprimir(){
        return TEXT_DEFECTO;
    }

}
