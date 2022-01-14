package estudodecaso2.solucao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private LocalDateTime dataEmissao;
    private BigDecimal valorBruto;
    private BigDecimal impostos;
    private List<Item> itens;
    private String observacoes;
}
