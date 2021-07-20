package org.nestorbardel.poointerfaces.repositorio;

import org.nestorbardel.poointerfaces.modelo.BaseEntity;
import org.nestorbardel.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T>{

    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return this.dataSource;
    }

    @Override
    public T porId(Integer id) {
        T resultado = null;

        for(T cli: this.dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

//    @Override
//    public void editar(Cliente cliente) {
//        Cliente c = this.porId(cliente.getId());
//        c.setNombre(cliente.getNombre());
//        c.setApellido(cliente.getApellido());
//    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

//    @Override
//    public List<Cliente> listar(String campo, Direccion dir) {
//        List<Cliente> listaOrdenada = new ArrayList<Cliente>(this.dataSource);
//        listaOrdenada.sort((a, b) -> {
//            int resultado = 0;
//            if(dir == Direccion.ASC){
//                  resultado = this.ordenar(campo, a, b);
//            }else if(dir == Direccion.DESC){
//                  resultado = this.ordenar(campo, b, a);
//            }
//            return resultado;
//        });
//        return listaOrdenada;
//    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }
//
//    private int ordenar(String campo, Cliente a, Cliente b){
//        int resultado = 0;
//        switch (campo){
//            case "id" ->
//                    resultado = a.getId().compareTo(b.getId());
//            case "nombre" ->
//                    resultado = a.getNombre().compareTo(b.getNombre());
//            case "apellido" ->
//                    resultado = a.getApellido().compareTo((b.getApellido()));
//        }
//        return resultado;
//    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
