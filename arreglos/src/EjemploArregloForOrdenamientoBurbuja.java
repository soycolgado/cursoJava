import java.util.Arrays;

public class EjemploArregloForOrdenamientoBurbuja {

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

    public static void sortburbuja(Object[] arreglo)
    {
        int total = arreglo.length;

        int contador = 0;

        for(int i = 0; i < total - 1; i++)
        {
            for(int j = 0; j < total - 1 - i; j++)
            {
                if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0)
                {
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {



        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy", "Samsung Galaxy","Disco Duro SSD Samsung Externo","Asus Notebook", "Macbook Air",  "Chromecast 4ta Generacion", "Bicicleta Oxford"};
        int total = productos.length;

        sortburbuja(productos);

//        Arrays.sort(productos);

//        System.out.println("=============== For =============");

//        arregloInverso(productos);
//        Collections.reverse(Arrays.asList(productos));

        for(int i = 0; i < total; i++)
        {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        int[] numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;


    }
}
