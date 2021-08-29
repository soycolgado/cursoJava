package org.nestorbardel.patrones.factory.producto;

import org.nestorbardel.patrones.factory.PizzaProducto;

public class PizzaNewYorkPepperoni extends PizzaProducto {

    public PizzaNewYorkPepperoni() {
        super();
        this.nombre = "Pizza Pepperoni New York";
        this.masa = "Masa delgada a la piedra";
        this.salsa = "Salsa de tomate";
        this.ingredientes.add("Queso mozzarella");
        this.ingredientes.add("Extra Pepperoni");
        this.ingredientes.add("Aceituna");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40min a 90°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos");
    }
}
