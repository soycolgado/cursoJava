package org.nestorbardel.generics;

import org.nestorbardel.poointerfaces.modelo.Cliente;
import org.nestorbardel.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(new Cliente("Nestor", "Bardel"));

        Cliente nestor = clientes.get(0);

        Cliente[] clientesArreglo = {
                new Cliente("Nestor", "Bardel"),
                new Cliente("Canela", "Fegan")
        };

        Integer[] enteros = {1,2,3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enteros);

        List<ClientePremium> clientesPremium = fromArrayToList(
                new ClientePremium[]{new ClientePremium("Paco", "Fernandez")}
        );

//        clientesLista.forEach(System.out::println);
//        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Andres", "Pepe", "Luci", "Bea", "John"}, enteros);
        nombres.forEach(System.out::println);

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPremium);

        System.out.println("maximo de 1, 9, 4 es: " + maximo(1, 9, 4));
        System.out.println("maximo de 3.9, 11.6 y 7.78 es: " + maximo(3.9,11.6,7.78));
        System.out.println("maximo de zanahoria, arandanos, manzana es: " + maximo("zanahoria", "arandanos", "manzana"));

    }

    public static <T extends Number> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }


    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[]c){
        return Arrays.asList(c);
    }

    public static <T> List<T> fromArrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] g){
        for(G elemento: g){
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0)
        {
            max = b;
        }

        if(c.compareTo(max) > 0){
            max = c;
        }

        return max;
    }
}
