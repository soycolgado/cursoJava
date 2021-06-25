package org.aguzman.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 10;
    private static int ultimoFolio;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item){
        if(this.indiceItems < MAX_ITEMS){
            this.items[this.indiceItems++] = item;
        }
    }

    public float calcularTotal(){
        float total = 0.0f;
        for(int i = 0; i < this.indiceItems; i++){
            total +=  this.items[i].calcularImporte();
        }

        return total;
    }

    public String generarDetalle(){
        StringBuilder sb = new StringBuilder("Factura N°: ");
        sb.append(this.folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\tNIF: ")
                .append(this.cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n")
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emision: ").append(df.format(this.fecha)).append("\n")
            .append("#\tNombre\t$\tCant.\tTotal\n");

        for(int i = 0; i < this.indiceItems; i++){
            sb.append( this.items[i].toString())
                    .append("\n");
        }

        sb.append("\nGran total: ")
                .append(this.calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString() {
        return this.generarDetalle();
    }
}
