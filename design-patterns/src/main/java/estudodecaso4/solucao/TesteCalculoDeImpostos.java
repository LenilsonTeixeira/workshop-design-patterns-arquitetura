package estudodecaso4.solucao;

import java.math.BigDecimal;

public class TesteCalculoDeImpostos {

    public static void main(String[] args) {
        ICMS icms = new ICMS();
        ISS iss = new ISS();
        IKCV ikcv = new IKCV();
        ICPP icpp = new ICPP();

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItens(new Item("Item 1", new BigDecimal("10")));
        orcamento.adicionarItens(new Item("Item 2", new BigDecimal("50")));
        orcamento.adicionarItens(new Item("Item 3", new BigDecimal("600")));
        System.out.println("Valor total: "+ orcamento.getValorTotal());

        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println("O resultado do calculo do ICMS é: "+ calculadoraDeImpostos.realizarCalculo(orcamento, icms));
        System.out.println("O resultado do calculo do ISS é: "+ calculadoraDeImpostos.realizarCalculo(orcamento, iss));
        System.out.println("O resultado do calculo do IKCV é: "+ calculadoraDeImpostos.realizarCalculo(orcamento, ikcv));
        System.out.println("O resultado do calculo do ICPP é: "+ calculadoraDeImpostos.realizarCalculo(orcamento, icpp));
    }

}
