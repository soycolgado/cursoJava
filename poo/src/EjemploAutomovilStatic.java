
import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        System.out.println("Velocidad maxima carretera + " +Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad + " + Automovil.VELOCIDAD_MAX_CIUDAD);
        Date fecha = new Date();

        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil.setColorPatente(Automovil.COLOR_AZUL);
        Automovil auto = new Automovil();


        System.out.println(subaru.detalle());
        System.out.println("----------------------------------------");
        System.out.println(mazda.detalle());
        System.out.println("------------------------------------");
        System.out.println(nissan.detalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300,60));

    }
}
