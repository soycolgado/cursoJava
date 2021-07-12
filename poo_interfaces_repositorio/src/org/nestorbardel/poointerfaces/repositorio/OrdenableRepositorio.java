package org.nestorbardel.poointerfaces.repositorio;

import org.nestorbardel.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio {
    public List<Cliente> listar(String campo, Direccion dir);
}
