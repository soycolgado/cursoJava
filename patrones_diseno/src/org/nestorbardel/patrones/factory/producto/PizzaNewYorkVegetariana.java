package org.nestorbardel.patrones.factory.producto;

import org.nestorbardel.patrones.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        this.nombre = "Pizza vegetariana New York";
        this.masa = "Masa integral vegana";
        this.salsa = "Salsa de tomate";
        this.ingredientes.add("Queso vegano");
        this.ingredientes.add("Tomate");
        this.ingredientes.add("Aceitunas");
        this.ingredientes.add("Espinacas");
        this.ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
