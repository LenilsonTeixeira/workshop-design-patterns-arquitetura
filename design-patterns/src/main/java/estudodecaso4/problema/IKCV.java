package estudodecaso4.problema;

import java.math.BigDecimal;

public class IKCV implements Imposto {

    @Override
    public BigDecimal calcularImposto(Orcamento orcamento) {
        if(orcamento.getValorTotal().doubleValue() > 500 && temItemMaiorQue100Reais(orcamento)) {
            return orcamento.getValorTotal().multiply(BigDecimal.valueOf(0.10));
        } else {
            return orcamento.getValorTotal().multiply(BigDecimal.valueOf(0.03));
        }
    }

    private boolean temItemMaiorQue100Reais(Orcamento orcamento) {
        return orcamento.getItens()
                .stream()
                .anyMatch(item -> item.getValor().doubleValue() > 100);
    }
}
