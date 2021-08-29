package org.nestorbardel.patrones.decorator.decorador;

import org.nestorbardel.patrones.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {

    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
