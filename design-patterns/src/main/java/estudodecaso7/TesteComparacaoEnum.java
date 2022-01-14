package estudodecaso7;

public class TesteComparacaoEnum {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

//        if(funcionario.getProfissao().equals(Profissao.ANALISTA)) {
//            System.out.println("É um analista");
//        } else if (funcionario.getProfissao().equals(Profissao.VENDEDOR)){
//            System.out.println("É um vendedor");
//        } else {
//            System.out.println("Não é analista e nem vendedor");
//        }

        if(Profissao.ANALISTA.equals(funcionario.getProfissao())) {
            System.out.println("É um analista");
        } else if (Profissao.VENDEDOR.equals(funcionario.getProfissao())){
            System.out.println("É um vendedor");
        } else {
            System.out.println("Não é analista e nem vendedor");
        }
    }
}
