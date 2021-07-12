package org.nestorbardel.poointerfaces.repositorio;

import org.nestorbardel.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    public List<Cliente> listar();
    public Cliente porId(Integer id);
    public void crear(Cliente cliente);
    public void editar(Cliente cliente);
    public void eliminar(Integer id);
}
