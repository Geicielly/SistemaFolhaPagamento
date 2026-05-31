import java.util.Scanner;
import java.util.ArrayList;

public class Main {
private static final Scanner entrada = new Scanner(System.in);
private static final ArrayList<FuncionarioPadrao> funcionarios = new ArrayList<>();


public static void main(String[] args) {
    int opcao=0;

    do{
        exibirMenu();
        if    (!entrada.hasNextInt()) {
                System.out.println("Digite apenas números de 0 a 4.");
                entrada.nextLine();
                continue;}
                opcao = entrada.nextInt();
                entrada.nextLine();
        switch (opcao) {
        
            case 1: 
            cadastrarFuncionarioPadrao(); 
            break;

            case 2:
            cadastrarFuncionarioComissionado();
            break;

            case 3:
            cadastroFuncionarioProducao();
            break;

            case 4:
            gerarFolhaPagamento();
            break;

            case 0:
            System.out.println("Encerrando Operações. Fim do programa.");
            break;

            default:System.out.println("Opção inexistente");
            break;
        }
    }   while (opcao != 0); 

        
       entrada.close();

    }

        private static void exibirMenu() {
        System.out.println("Escolha uma Opção");
        System.out.println("\n====== FOLHA DE PAGAMENTO =====\n");
        System.out.println("1 - Cadastrar funcionário padrão.");
        System.out.println("2 - Cadastrar funcionário comissionado.");
        System.out.println("3 - Cadastrar funcionário da produção.");
        System.out.println("4 - Gerar folha de pagamento.");
        System.out.println("0 - Sair do Programa.");
        
    
        }

private static void cadastrarFuncionarioPadrao(){
    System.out.println("\nCadastro de funcinário padrao");
    System.out.println("digite o nome:");
    String nomeCompleto = entrada.nextLine().trim();
    System.out.println("digite a matrícula");
    int matricula = entrada.nextInt();
    funcionarios.add(new FuncionarioPadrao(matricula,nomeCompleto));
    System.out.println("Funcionário cadastrado com sucesso!");
}
private static void cadastrarFuncionarioComissionado(){
    System.out.println("\nCadastro de funcinário comissionado");
    System.out.println("digite o nome:");
    String nomeCompleto = entrada.nextLine().trim();
    System.out.println("digite a matrícula");
    int matricula = entrada.nextInt();
    System.out.println("Digite o valor das vendas");
    double valorVendas = entrada.nextDouble();
    System.out.println("Digite o percentual da comissão");
    double percentualComissao = entrada.nextDouble();
    funcionarios.add(new FuncionarioComissionado(matricula, nomeCompleto, valorVendas, percentualComissao));
    System.out.println("Funcionário cadastrado com sucesso!");
}
private static void cadastroFuncionarioProducao(){
    System.out.println("\n Cadastro de funcinário de produção");
    System.out.println("digite o nome:");
    String nomeCompleto = entrada.nextLine().trim();
    System.out.println("digite a matrícula");
    int matricula = entrada.nextInt();
    System.out.println("Digite a quantidade de peças");
    int quantidadePecas = entrada.nextInt();
    System.out.println("Digite o valor de cada peça");
    double valorPeca = entrada.nextDouble();
    funcionarios.add(new FuncionarioProducao(matricula, nomeCompleto, quantidadePecas, valorPeca));
    System.out.println("Funcionário cadastrado com sucesso!");
}

private static void gerarFolhaPagamento(){
    System.out.println("\n==== Folha de Pagamento ====\n");
    
    if (funcionarios.isEmpty()) {
        System.out.println("Nenhum funcionário cadastrado.");
        return;
    }
    
    for (int i = 0; i < funcionarios.size(); i++) {
        System.out.println(funcionarios.get(i));
    }
}
}
