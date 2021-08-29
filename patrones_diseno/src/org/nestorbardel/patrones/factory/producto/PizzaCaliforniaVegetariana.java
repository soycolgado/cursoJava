package org.nestorbardel.patrones.factory.producto;

import org.nestorbardel.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        this.nombre = "Pizza California Vegetariana";
        this.masa = "Masa delgada Light";
        this.salsa = "Salsa BBQ light";
        this.ingredientes.add("Queso Mozzarella");
        this.ingredientes.add("Aceitunas");
        this.ingredientes.add("Espinacas");
        this.ingredientes.add("Cebolla");
        this.ingredientes.add("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min a 180°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");
    }
}
