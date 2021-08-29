
package org.nestorbardel.patrones.decorator;

        import org.nestorbardel.patrones.decorator.decorador.MayusculaDecorador;
        import org.nestorbardel.patrones.decorator.decorador.ReversaDecorador;
        import org.nestorbardel.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable text = new Texto("Hola que tal Nestor!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(text);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayado = new SubrayadoDecorador(reversa);

        System.out.println(subrayado.darFormato());
    }
}