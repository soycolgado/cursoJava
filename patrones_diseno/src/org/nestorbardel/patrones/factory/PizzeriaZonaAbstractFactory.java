package org.nestorbardel.patrones.factory;

abstract public class PizzeriaZonaAbstractFactory {

    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizza = this.crearPizza(tipo);
        System.out.println("---- Fabricando la pizza " + pizza.getNombre() + "-----");
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    public abstract PizzaProducto crearPizza(String tipo);

}
