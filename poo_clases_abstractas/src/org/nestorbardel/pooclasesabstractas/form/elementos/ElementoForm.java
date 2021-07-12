package org.nestorbardel.pooclasesabstractas.form.elementos;

import org.nestorbardel.pooclasesabstractas.form.validador.LargoValidador;
import org.nestorbardel.pooclasesabstractas.form.validador.Validador;
import org.nestorbardel.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores = new ArrayList<Validador>();
        this.errores = new ArrayList<String>();
    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }


    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido(){
        for(Validador v: this.validadores){
            if(!v.esValido(this.valor)){
                if(v instanceof MensajeFormateable){
                    this.errores.add(((MensajeFormateable) v).getMensajeFormateado(this.nombre));
                }else{
                    this.errores.add(String.format(v.getMensaje(), this.nombre));
                }
            }
        }

        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();
}
