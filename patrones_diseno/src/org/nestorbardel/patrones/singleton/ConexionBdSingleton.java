package org.nestorbardel.patrones.singleton;

public class ConexionBdSingleton {

    private static ConexionBdSingleton instancia;

    private ConexionBdSingleton(){
        System.out.println("Conectandose a algun motor de base de datos");
    }

    public static ConexionBdSingleton getInstancia(){
        if(ConexionBdSingleton.instancia == null){
            ConexionBdSingleton.instancia = new ConexionBdSingleton();
        }

        return ConexionBdSingleton.instancia;
    }
}
