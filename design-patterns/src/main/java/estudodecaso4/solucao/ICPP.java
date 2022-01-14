package estudodecaso4.solucao;

import java.math.BigDecimal;

public class ICPP extends TemplateDeImpostoCondicional {

    @Override
    public BigDecimal minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValorTotal().multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public BigDecimal maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValorTotal().multiply(BigDecimal.valueOf(0.07));
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValorTotal().doubleValue() > 500;
    }
}
