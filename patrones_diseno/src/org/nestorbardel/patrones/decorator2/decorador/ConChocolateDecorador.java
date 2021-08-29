package org.nestorbardel.patrones.decorator2.decorador;

import org.nestorbardel.patrones.decorator2.Configurable;

public class ConChocolateDecorador extends CafeDecorador{


    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return this.cafe.getPrecioBase() + 5f;
    }

    @Override
    public String getIngredientes() {
        return this.cafe.getIngredientes() + ", Chocolate";
    }
}
