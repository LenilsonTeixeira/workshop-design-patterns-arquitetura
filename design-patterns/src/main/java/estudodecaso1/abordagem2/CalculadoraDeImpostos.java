package estudodecaso1.abordagem2;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public void realizarCalculoICMS(Orcamento orcamento) {
        BigDecimal icms = new ICMS().calculaICMS(orcamento);
        System.out.println(icms);
    }

    public void realizarCalculoISS(Orcamento orcamento) {
        BigDecimal icms = new ISS().calculaISS(orcamento);
        System.out.println(icms);
    }

    /**
     * O que foi feito: Isolamento do calculo de impostos em classes especificas (ICMS e ISS) e criação de métodos distintos para fazer o calculo de impostos
     * Resultado: Por mais que eu tenha isolado o calculo e criado um método para cada calculo de imposto na classe CalculadoraDeImpostos, ainda não resolvi
     * o problema, pois o que eu fiz foi somente mover o problema de lugar.
     * **/
}
