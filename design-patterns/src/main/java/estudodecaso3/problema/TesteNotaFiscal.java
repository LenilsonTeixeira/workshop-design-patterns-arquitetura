package estudodecaso3.problema;

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
                .comObservacoes("Gerei um problema de acoplamento no método construir da classe NotaFiscalBuilder");

        System.out.println("Nota fiscal: "+ notaFiscal.construir());
    }

}
