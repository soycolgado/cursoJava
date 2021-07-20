package org.nestorbardel.poointerfaces;

import org.nestorbardel.poointerfaces.modelo.Cliente;
import org.nestorbardel.poointerfaces.repositorio.*;
import org.nestorbardel.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();

        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Bea", "Gonzales"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Andres", "Guzman"));

        List<Cliente> clientes = repo.listar();

        clientes.forEach(System.out::println);

        System.out.println("============= paginable ==============");

        List<Cliente> paginable = repo.listar(1,3);

        paginable.forEach(System.out::println);

        System.out.println("============ ordenable ================");

        List<Cliente> clientesOrdenASC = repo.listar("nombre", Direccion.ASC);

        clientesOrdenASC.forEach(System.out::println);

        System.out.println("============== editar =============");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);

        Cliente bea = repo.porId(2);
        System.out.println(bea);

        System.out.println("============== borrar =============");

        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
    }
}
