package estudodecaso3.solucao;

public class Impressora implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Realizando impressão da nota fiscal");
    }
}
