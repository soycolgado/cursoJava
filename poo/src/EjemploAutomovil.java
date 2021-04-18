import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("Subaru", "Impreza");
        Date fecha = new Date();
//        subaru.setFabricante("Subaru");
//        subaru.setModelo("Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, 3.0);
//        mazda.setFabricante("Mazda");
//        mazda.setModelo("BT-50");
//        mazda.setCilindrada(3.0);
//        mazda.setColor("Rojo");

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS, 3.5, 50);

        Automovil auto = new Automovil();

//        System.out.println("Son iguales???" + (nissan == nissan2));
//        System.out.println("Son iguales???" + (nissan.equals(nissan2)));
//        System.out.println("Son iguales???" + (auto.equals(fecha)));
        System.out.println(nissan);


        System.out.println(subaru.detalle());
        System.out.println("----------------------------------------");
        System.out.println(mazda.detalle());
//        System.out.println("------------------------------------");
//        System.out.println(nissan.detalle());
//        System.out.println(subaru.acelerar(3000));
//        System.out.println(subaru.frenar());
//        System.out.println(subaru.acelerarFrenar(3000));
//        System.out.println(subaru.calcularConsumo(300, 0.60F));
//        System.out.println(subaru.calcularConsumo(300, 60));
//        System.out.println(nissan.calcularConsumo(300, 60));

    }
}
