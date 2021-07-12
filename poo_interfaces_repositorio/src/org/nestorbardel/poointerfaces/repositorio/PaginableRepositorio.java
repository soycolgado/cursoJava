package org.nestorbardel.poointerfaces.repositorio;

import org.nestorbardel.poointerfaces.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    public List<Cliente> listar(int desde, int hasta);
}
