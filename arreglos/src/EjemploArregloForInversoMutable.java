import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArregloForInversoMutable {

    public static void arregloInverso(String[] arreglo)
    {
        int total2 = arreglo.length;
        int total = arreglo.length;

        for(int i = 0; i < total; i++)
        {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total -1 - i] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {



        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy", "Samsung Galaxy","Disco Duro SSD Samsung Externo","Asus Notebook", "Macbook Air",  "Chromecast 4ta Generacion", "Bicicleta Oxford"};
        int total = productos.length;

        Arrays.sort(productos);
        System.out.println("=============== For =============");

        arregloInverso(productos);

//        Collections.reverse(Arrays.asList(productos));

        for(int i = 0; i < total; i++)
        {
            System.out.println("para indice " + i + " : " + productos[i]);
        }


    }
}
