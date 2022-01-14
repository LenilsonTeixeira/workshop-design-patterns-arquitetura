package estudodecaso4.solucao;

import java.math.BigDecimal;

public class IKCV extends TemplateDeImpostoCondicional {

    @Override
    public BigDecimal minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValorTotal().multiply(BigDecimal.valueOf(0.03));
    }

    @Override
    public BigDecimal maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValorTotal().multiply(BigDecimal.valueOf(0.10));
    }

    @Override
    public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValorTotal().doubleValue() > 500 && temItemMaiorQue100Reais(orcamento);
    }

    private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
        return orcamento.getItens()
                .stream()
                .anyMatch(item -> item.getValor().doubleValue() > 100);
    }
}
