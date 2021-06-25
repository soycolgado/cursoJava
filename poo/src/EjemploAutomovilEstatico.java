
public class EjemploAutomovilEstatico {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO,  new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL),
                new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA),
                new Estanque(50));
        nissan2.setTipo(TipoAutomovil.PICKUP);
        nissan2.setColor(Color.AMARILLO);
        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente().getColor());
        System.out.println("Kilometros por litros estaticos = " + Automovil.calcularConsumoEstatico(300,60));
        System.out.println("Velocidad maxima en carretera = " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima en ciudad = " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo subaru = " + tipoSubaru.getNombre());
        System.out.println("Tipo subaru descripcion = " + tipoSubaru.getDescripcion());

    }
}
