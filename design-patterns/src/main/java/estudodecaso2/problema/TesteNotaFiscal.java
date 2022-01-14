package estudodecaso2.problema;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TesteNotaFiscal {

    private static final String EMPRESA = "XPTO";
    private static final String CNPJ = "11.111.111/1111-01";
    private static final Double PERCENTUAL_IMPOSTO = 0.05;


    public static void main(String[] args) {

        List<Item> itens = Arrays.asList(new Item("Item 1", BigDecimal.valueOf(100)), new Item("Item 2", BigDecimal.valueOf(600)));

        LocalDateTime dataAtual = LocalDateTime.now();

        BigDecimal valorBruto = calcularValorBruto(itens);

        BigDecimal imposto = calcularImposto(valorBruto, PERCENTUAL_IMPOSTO);

        String observacoes = adicionarObservacoes("OLHA O TRABALHO NECESSÁRIO PARA CRIAR UMA NOTA FISCAL");

        NotaFiscal notaFiscal = new NotaFiscal(EMPRESA, CNPJ, dataAtual, valorBruto, imposto, itens, observacoes);

        System.out.println("Imprimindo nota fiscal: "+ notaFiscal);
    }

    private static String adicionarObservacoes(String observacao) {
        return observacao;
    }

    private static BigDecimal calcularImposto(BigDecimal valorBruto, Double percentualImposto) {
        return valorBruto.multiply(BigDecimal.valueOf(percentualImposto));
    }

    private static BigDecimal calcularValorBruto(List<Item> itens) {
        return itens.stream()
                .map(Item::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
