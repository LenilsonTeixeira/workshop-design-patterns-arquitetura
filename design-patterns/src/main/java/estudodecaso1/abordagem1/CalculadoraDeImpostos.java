package estudodecaso1.abordagem1;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public void realizarCalculo(Orcamento orcamento, String imposto) {
        if(imposto.equals("ICMS")) {
            BigDecimal icms = new ICMS().calculaICMS(orcamento);
            System.out.println(icms);
        } else if(imposto.equals("ISS")) {
            BigDecimal icms = new ISS().calculaISS(orcamento);
            System.out.println(icms);
        }
    }

    /**
     * O que foi feito: Isolamento do calculo de impostos em classes especificas (ICMS e ISS)
     * Resultado: Por mais que eu tenha isolado o calculo, ainda não resolvi o problema, pois conforme o aumento no número de
     *      impostos, maior será a lógica aplicada no método realizarCalculo;
     * **/
}
