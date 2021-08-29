package org.nestorbardel.patrones.decorator.decorador;

import org.nestorbardel.patrones.decorator.Formateable;

public class ReversaDecorador extends TextoDecorador{

    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(this.texto.darFormato());
        return sb.reverse().toString();
    }
}
