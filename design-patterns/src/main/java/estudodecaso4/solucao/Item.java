package estudodecaso4.solucao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private String descricao;
    private BigDecimal valor;
}
