package org.nestorbardel.pooexcepciones.ejemplo;

public class DivisionPorZeroException extends Exception{
    public DivisionPorZeroException(String mensaje){
        super(mensaje);
    }
}
