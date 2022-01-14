package estudodecaso4.problema;

import java.math.BigDecimal;

public class ICPP implements Imposto {

    @Override
    public BigDecimal calcularImposto(Orcamento orcamento) {
        if (orcamento.getValorTotal().doubleValue() > 500) {
            return orcamento.getValorTotal().multiply(BigDecimal.valueOf(0.07));
        } else {
            return orcamento.getValorTotal().multiply(BigDecimal.valueOf(0.05));
        }
    }
}
