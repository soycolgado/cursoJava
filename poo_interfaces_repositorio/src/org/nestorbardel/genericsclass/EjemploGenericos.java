package org.nestorbardel.genericsclass;

public class EjemploGenericos {


    public static <T> void imprimirCamion(Camion<T> camion){
        for(T a: camion){
            if(a instanceof Animal){
                System.out.println(((Animal)a).getNombre() + " tipo" + ((Animal)a).getTipo());
            }
            else if(a instanceof Automovil){
                System.out.println(((Automovil)a).getMarca());
            }
            else if(a instanceof Maquinaria){
                System.out.println(((Maquinaria)a).getTipo());
            }
        }
    }

    public static void main(String[] args) {

        Camion<Animal> transportCaballos = new Camion<>(5);
        transportCaballos.add(new Animal("Peregrino", "Caballo"));
        transportCaballos.add(new Animal("Grillo", "Caballo"));
        transportCaballos.add(new Animal("Tunquen", "Caballo"));
        transportCaballos.add(new Animal("Topocalma", "Caballo"));
        transportCaballos.add(new Animal("Longotoma", "Caballo"));

        imprimirCamion(transportCaballos);

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Guia Horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        imprimirCamion(transMaquinas);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubishi"));
        transAuto.add(new Automovil("Chevrolette"));

        imprimirCamion(transAuto);
    }
}
