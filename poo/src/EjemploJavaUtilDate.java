import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String fechaStr = df.format(fecha);

        long j = 0;
        
        for(int i = 0; i < 1000000000; i++)
        {
            j += i;
        }

        Date fecha2 = new Date();

        long tiempoFinal = fecha2.getTime() - fecha.getTime();

        System.out.println("tiempoFinal = " + tiempoFinal);

        System.out.println("j = " + j);
        
        System.out.println("fechaStr = " + fechaStr);
        
    }
}
