package org.nestorbardel.patrones.factory;

import org.nestorbardel.patrones.factory.producto.PizzaNewYorkItaliana;
import org.nestorbardel.patrones.factory.producto.PizzaNewYorkPepperoni;
import org.nestorbardel.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    public PizzaProducto crearPizza(String tipo) {

       return switch (tipo) {
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzaNewYorkItaliana();
            default -> null;
        };

    }
}
