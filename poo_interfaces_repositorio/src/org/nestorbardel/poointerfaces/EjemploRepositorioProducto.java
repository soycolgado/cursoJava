package org.nestorbardel.poointerfaces;

import org.nestorbardel.poointerfaces.modelo.Cliente;
import org.nestorbardel.poointerfaces.modelo.Producto;
import org.nestorbardel.poointerfaces.repositorio.Direccion;
import org.nestorbardel.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import org.nestorbardel.poointerfaces.repositorio.lista.ClienteListRepositorio;
import org.nestorbardel.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();

        repo.crear(new Producto("mesa", 50.52));
        repo.crear(new Producto("silla", 18));
        repo.crear(new Producto("lampara", 15.5));
        repo.crear(new Producto("notebook", 400.89));

        List<Producto> productos = repo.listar();

        productos.forEach(System.out::println);

        System.out.println("============= paginable ==============");

        List<Producto> paginable = repo.listar(1,3);

        paginable.forEach(System.out::println);

        System.out.println("============ ordenable ================");

        List<Producto> productosOrdenASC = repo.listar("descripcion", Direccion.ASC);

        productosOrdenASC.forEach(System.out::println);

        System.out.println("============== editar =============");
        Producto lamparaActualizar = new Producto("Lampara escritorio", 23);
        lamparaActualizar.setId(3);
        repo.editar(lamparaActualizar);

        Producto lampara = repo.porId(3);
        System.out.println(lampara);

        System.out.println("============== borrar =============");

        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
    }
}
