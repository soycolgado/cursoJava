import java.util.Arrays;

public class EjemploArregloFor {
    public static void main(String[] args) {

        String[] productos = new String[7];

        int total = productos.length;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);
        System.out.println("=============== For =============");

        for(int i = 0; i < total; i++)
        {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("=============== Foreach =============");

        for(String prod: productos)
        {
            System.out.println("prod = " + prod);
        }


        System.out.println("=============== While =============");

        int cont = 0;

        while (cont < total)
        {
            System.out.println("para indice " + cont + " : " + productos[cont]);
            cont++;
        }

        int[] numeros = new int[10];

        int totalNum = numeros.length;
        for(int k = 0; k < totalNum; k++)
        {
            numeros[k] = k * 3;
        }

        for(int k = 0; k < totalNum; k++){
            System.out.println("numeros = " + numeros[k]);
        }
    }
}
