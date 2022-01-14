package estudodecaso3.solucao;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Enviando nota fiscal via email");
    }
}
