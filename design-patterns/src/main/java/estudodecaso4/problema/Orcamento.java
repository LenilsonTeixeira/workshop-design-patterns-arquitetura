package estudodecaso4.problema;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Orcamento {

    private BigDecimal valorTotal;
    private List<Item> itens = new ArrayList<>();

    public void adicionarItens(Item item) {
        itens.add(item);
    }

    public BigDecimal getValorTotal() {
        return this.getItens().stream().map(Item::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
