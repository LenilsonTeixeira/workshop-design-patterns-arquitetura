package estudodecaso4.solucao;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal realizarCalculo(Orcamento orcamento, Imposto imposto) {
        return imposto.calcularImposto(orcamento);
    }
}
