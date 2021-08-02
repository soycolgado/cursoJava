package org.nestorbardel.hilos.ejemplos;

import org.nestorbardel.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {

    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreThread("Nestor Bardel");
        hilo.start();
        Thread hilo2 = new NombreThread("Canela Fegan");
        hilo2.start();
        Thread hilo3 = new NombreThread("Flavio");
        hilo3.start();
        System.out.println(hilo.getState());

    }
}
