package estudodecaso1.solucao;

import java.math.BigDecimal;

public class TesteCalculoDeImpostos {

    /**
     * Padrão de projeto: Strategy
     * */

    public static void main(String[] args) {
        ICMS icms = new ICMS();
        ISS iss = new ISS();
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(500));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println("O resultado do calculo de ICMS é: "+ calculadoraDeImpostos.realizarCalculo(orcamento, icms));
        System.out.println("O resultado do calculo do ISS é: "+ calculadoraDeImpostos.realizarCalculo(orcamento, iss));
    }
}
