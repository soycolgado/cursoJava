package org.nestorbardel.patrones.factory.ejemplo;

import org.nestorbardel.patrones.factory.PizzaProducto;
import org.nestorbardel.patrones.factory.PizzeriaCaliforniaFactory;
import org.nestorbardel.patrones.factory.PizzeriaNewYorkFactory;
import org.nestorbardel.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Andres ordena una " + pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Bruce ordena una " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena una " + pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena una " + pizza.getNombre());

        pizza = california.ordenarPizza("pepperoni");
        System.out.println("John ordena una " + pizza.getNombre());

        System.out.println("pizza = " + pizza);

    }
}
