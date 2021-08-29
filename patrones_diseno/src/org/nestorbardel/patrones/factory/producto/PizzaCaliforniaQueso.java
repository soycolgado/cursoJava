package org.nestorbardel.patrones.factory.producto;

import org.nestorbardel.patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {
    public PizzaCaliforniaQueso() {
        super();
        this.nombre = "Pizza California Queso";
        this.masa = "Masa a la piedra delgada";
        this.salsa = "Salsa de tomate rucula";
        this.ingredientes.add("Extra queso Mozzarella");
        this.ingredientes.add("Cebolla");
        this.ingredientes.add("Queso Azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 35min a 100°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triangulos");
    }
}
