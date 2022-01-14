package estudodecaso4.solucao;

import java.math.BigDecimal;

public class ICMS implements Imposto {

    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValorTotal().multiply(new BigDecimal("0.1"));
    }
}
