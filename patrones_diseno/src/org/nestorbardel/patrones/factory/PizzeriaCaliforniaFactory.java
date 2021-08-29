package org.nestorbardel.patrones.factory;

import org.nestorbardel.patrones.factory.producto.PizzaCaliforniaPepperoni;
import org.nestorbardel.patrones.factory.producto.PizzaCaliforniaQueso;
import org.nestorbardel.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    public PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo){
            case "queso":
                producto = new PizzaCaliforniaQueso();
                break;
            case "pepperoni":
                producto = new PizzaCaliforniaPepperoni();
                break;
            case "vegetariana":
                producto = new PizzaCaliforniaVegetariana();
                break;
        }
        return producto;
    }
}
