package estudodecaso2.solucao;

import java.math.BigDecimal;

public class TesteNotaFiscal {

    private static final String EMPRESA = "XPTO";
    private static final String CNPJ = "11.111.111/1111-01";

    public static void main(String[] args) {
        NotaFiscalBuilder notaFiscal = new NotaFiscalBuilder()
                .paraEmpresa(EMPRESA)
                .comCnpj(CNPJ)
                .comItem(new Item("Item 1", BigDecimal.valueOf(100)))
                .comItem(new Item("Item 2", BigDecimal.valueOf(500)))
                .comItem(new Item("Item 3", BigDecimal.valueOf(200)))
                .comObservacoes("Criando uma nota fiscal de forma elegante");

        System.out.println("Imprimindo nota fiscal: "+ notaFiscal.construir());
    }

    /**
     * Tinhamos um objeto que era dificil e complicado de ser criado, para resolver escondemos toda a complexidade num objeto cuja responsabilidade
     * é de somente realizar a criação da nota fiscal.
     * */
}
