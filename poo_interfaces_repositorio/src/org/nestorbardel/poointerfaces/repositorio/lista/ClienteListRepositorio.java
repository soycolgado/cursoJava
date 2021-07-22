package org.nestorbardel.poointerfaces.repositorio.lista;

import org.nestorbardel.poointerfaces.modelo.Cliente;
import org.nestorbardel.poointerfaces.repositorio.AbstractaListRepositorio;
import org.nestorbardel.poointerfaces.repositorio.Direccion;
import org.nestorbardel.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

//    @Override
//    public Cliente porId(Integer id) {
//        Cliente resultado = null;
//
//        for(Cliente cli: this.dataSource){
//            if(cli.getId() != null && cli.getId().equals(id)){
//                resultado = cli;
//                break;
//            }
//        }
//        return resultado;
//    }

    @Override
    public void editar(Cliente cliente) throws LecturaAccesoDatoException {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<Cliente>(this.dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if(dir == Direccion.ASC){
                  resultado = this.ordenar(campo, a, b);
            }else if(dir == Direccion.DESC){
                  resultado = this.ordenar(campo, b, a);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    private int ordenar(String campo, Cliente a, Cliente b){
        int resultado = 0;
        switch (campo){
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                    resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
                    resultado = a.getApellido().compareTo((b.getApellido()));
        }
        return resultado;
    }

}
