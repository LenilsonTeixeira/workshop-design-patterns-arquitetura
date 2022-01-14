package estudodecaso3.problema;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NotaFiscalBuilder {

    private static final Double PERCENTUAL_IMPOSTO = 0.05;

    private String razaoSocial;
    private String cnpj;
    private List<Item> itens = new ArrayList<>();
    private BigDecimal valorBruto;
    private BigDecimal imposto;
    private LocalDateTime dataAtual;
    private String observacoes;

    public NotaFiscalBuilder() {
        registrarDataAtual();
    }

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(Item item) {
        itens.add(item);
        this.valorBruto = calcularValorBruto(itens);
        this.imposto = calcularImposto(valorBruto, PERCENTUAL_IMPOSTO);
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    /**Gerando um problema de acoplamento e dando motivos para que essa classe sofra alterações cuja responsabilidade
     * antes era somente de criar notas fiscais**/
    public NotaFiscal construir() {

        NotaFiscal notaFiscal =  new NotaFiscal(razaoSocial, cnpj, dataAtual, valorBruto, imposto, itens, observacoes);

        /**Como eliminar este acoplamento ?**/
        enviaPorEmail(notaFiscal);

        enviaPorSMS(notaFiscal);

        imprimir(notaFiscal);
        /************************************/
        return notaFiscal;
    }

    private NotaFiscalBuilder registrarDataAtual() {
        this.dataAtual = LocalDateTime.now();
        return this;
    }

    private BigDecimal calcularValorBruto(List<Item> itens) {
        return itens.stream()
                .map(Item::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calcularImposto(BigDecimal valorBruto, Double percentualImposto) {
        return valorBruto.multiply(BigDecimal.valueOf(percentualImposto));
    }

    private void imprimir(NotaFiscal notaFiscal) {
        System.out.println("Realizando impressão da nota fiscal");
    }

    private void enviaPorSMS(NotaFiscal notaFiscal) {
        System.out.println("Enviando nota fiscal via SMS");
    }

    private void enviaPorEmail(NotaFiscal notaFiscal) {
        System.out.println("Enviando nota fiscal via email");
    }
}
