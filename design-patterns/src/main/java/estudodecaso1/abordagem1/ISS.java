package estudodecaso1.abordagem1;

import java.math.BigDecimal;

public class ISS {

    public BigDecimal calculaISS(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
