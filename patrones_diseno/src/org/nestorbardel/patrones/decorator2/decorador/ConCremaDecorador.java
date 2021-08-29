package org.nestorbardel.patrones.decorator2.decorador;

import org.nestorbardel.patrones.decorator2.Configurable;

public class ConCremaDecorador extends CafeDecorador {


    public ConCremaDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return this.cafe.getPrecioBase() + 2.5f;
    }

    @Override
    public String getIngredientes() {
        return this.cafe.getIngredientes() + ", Crema";
    }
}
