package org.nestorbardel.pooclasesabstractas.form.validador;

public class NoNuloValidador extends Validador{

    protected String mensaje = "el campo %s no puede ser nulo";
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor!= null;
    }
}
