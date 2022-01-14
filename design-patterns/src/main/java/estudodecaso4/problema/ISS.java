package estudodecaso4.problema;

import java.math.BigDecimal;

public class ISS implements Imposto {

    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValorTotal().multiply(new BigDecimal("0.06"));
    }
}
