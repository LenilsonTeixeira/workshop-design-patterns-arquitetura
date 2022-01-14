package estudodecaso1.problema;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public void realizarCalculo(Orcamento orcamento, String imposto) {
        if(imposto.equals("ICMS")) {
            BigDecimal icms = orcamento.getValor().multiply(new BigDecimal("0.1"));
            System.out.println(icms);
        } else if(imposto.equals("ISS")) {
            BigDecimal icms = orcamento.getValor().multiply(new BigDecimal("0.06"));
            System.out.println(icms);
        }
    }
}
