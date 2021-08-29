package org.nestorbardel.patrones.factory.producto;

import org.nestorbardel.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

    public PizzaCaliforniaPepperoni() {
        super();
        this.nombre = "Pizza California Pepperoni";
        this.masa = "Masa a la piedra gruesa";
        this.ingredientes.add("Pepperoni");
        this.ingredientes.add("Extra queso mozzarella");
        this.ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 50 min a 55°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectangulos");
    }
}
