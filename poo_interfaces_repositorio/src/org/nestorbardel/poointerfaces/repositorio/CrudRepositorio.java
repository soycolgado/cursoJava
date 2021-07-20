package org.nestorbardel.poointerfaces.repositorio;

import org.nestorbardel.poointerfaces.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio<T> {
    public List<T> listar();
    public T porId(Integer id);
    public void crear(T cliente);
    public void editar(T cliente);
    public void eliminar(Integer id);
}
