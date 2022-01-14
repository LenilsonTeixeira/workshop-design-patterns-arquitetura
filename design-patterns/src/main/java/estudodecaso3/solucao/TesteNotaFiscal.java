package estudodecaso3.solucao;

import java.math.BigDecimal;

public class TesteNotaFiscal {

    private static final String EMPRESA = "XPTO";
    private static final String CNPJ = "11.111.111/1111-01";

    public static void main(String[] args) {
        NotaFiscal notaFiscal = new NotaFiscalBuilder()
                .paraEmpresa(EMPRESA)
                .comCnpj(CNPJ)
                .comItem(new Item("Item 1", BigDecimal.valueOf(100)))
                .comItem(new Item("Item 2", BigDecimal.valueOf(500)))
                .comItem(new Item("Item 3", BigDecimal.valueOf(200)))
                .comObservacoes("Resolvendo problema de acoplamento no método construir da classe NotaFiscalBuilder")
                .adicionaAcao(new EnviadorDeEmail())
                .adicionaAcao(new EnviadorDeSms())
                .adicionaAcao(new Impressora())
                .construir();

        System.out.println("Nota fiscal: "+ notaFiscal);
    }

    /**
     * Padrão: Observer com o Builder
     * Conclusão: Perceba o código se tornou mais extensível e sem o forte acoplamento que foi gerado anteriormente, além disso, com essa implementação
     * conseguimos adicionar novos comportamentos de forma fácil.
     * */

}
