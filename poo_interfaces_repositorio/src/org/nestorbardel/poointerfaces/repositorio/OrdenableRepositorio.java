package org.nestorbardel.poointerfaces.repositorio;

import org.nestorbardel.poointerfaces.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {
    public List<T> listar(String campo, Direccion dir);
}
