package org.nestorbardel.patrones.decorator.decorador;

import org.nestorbardel.patrones.decorator.Formateable;

public class SubrayadoDecorador extends TextoDecorador{

    public SubrayadoDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = this.texto.darFormato().length();
        StringBuilder sb = new StringBuilder(this.texto.darFormato());
        sb.append("\n");
        for(int i = 0; i < largo; i++){
            sb.append("_");
        }

        return sb.toString();
    }
}
