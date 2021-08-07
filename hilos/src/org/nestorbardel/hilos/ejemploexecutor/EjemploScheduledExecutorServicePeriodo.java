package org.nestorbardel.hilos.ejemploexecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploScheduledExecutorServicePeriodo {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        System.out.println("Alguna tarea en el main");

//        CountDownLatch lock = new CountDownLatch(5);
        AtomicInteger contador = new AtomicInteger(5);

        Future<?> future = executor.scheduleAtFixedRate(()->{
            System.out.println("Hola mundo tarea...");
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                //lock.countDown();
                contador.getAndDecrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 1000,2000, TimeUnit.MILLISECONDS);

       // lock.await();
//        future.cancel(true);
        while(contador.get()>=0){
            if(contador.get() == 0){
                future.cancel(true);
                contador.getAndDecrement();
            }
        }
//        TimeUnit.SECONDS.sleep(10);
        System.out.println("Alguna otra tarea");

        executor.shutdown();
    }
}
