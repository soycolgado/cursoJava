package org.nestorbardel.poointerfaces.repositorio;

import org.nestorbardel.poointerfaces.modelo.Cliente;
import org.nestorbardel.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.nestorbardel.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.nestorbardel.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {
    public List<T> listar();
    public T porId(Integer id) throws AccesoDatoException;
    public void crear(T cliente) throws AccesoDatoException;
    public void editar(T cliente) throws AccesoDatoException;
    public void eliminar(Integer id) throws AccesoDatoException;
}
