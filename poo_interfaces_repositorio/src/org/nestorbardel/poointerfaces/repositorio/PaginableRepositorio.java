package org.nestorbardel.poointerfaces.repositorio;

import org.nestorbardel.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    public List<T> listar(int desde, int hasta);
}
