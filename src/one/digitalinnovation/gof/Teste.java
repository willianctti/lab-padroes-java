package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.Robo;

public class Teste {

    public static void main(String[] args) {
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);


    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();
    robo.setComportamento(normal);
    robo.mover();
    robo.mover();
    }
}
