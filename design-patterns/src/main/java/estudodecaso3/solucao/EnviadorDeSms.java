package estudodecaso3.solucao;

public class EnviadorDeSms implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Enviando nota fiscal via SMS");
    }
}
