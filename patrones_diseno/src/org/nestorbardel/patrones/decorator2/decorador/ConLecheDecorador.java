package org.nestorbardel.patrones.decorator2.decorador;

import org.nestorbardel.patrones.decorator2.Configurable;

public class ConLecheDecorador extends CafeDecorador{

    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return this.cafe.getPrecioBase() + 3.7f;
    }

    @Override
    public String getIngredientes() {
        return this.cafe.getIngredientes() + ", Leche";
    }
}
