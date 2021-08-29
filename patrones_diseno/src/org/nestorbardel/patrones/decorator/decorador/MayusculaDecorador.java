package org.nestorbardel.patrones.decorator.decorador;

import org.nestorbardel.patrones.decorator.Formateable;

import java.util.Locale;

public class MayusculaDecorador extends TextoDecorador{

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return this.texto.darFormato().toUpperCase();
    }
}
