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
                System.out.println("Escolha opções de 0 a 4.");
                entrada.nextLine();
        }
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
        System.out.println("\nEscolha uma Opção\n");
        System.out.println("\n====== FOLHA DE PAGAMENTO =====\n");
        System.out.println("1 - Cadastrar funcionário padrão.");
        System.out.println("2 - Cadastrar funcionário comissionado.");
        System.out.println("3 - Cadastrar funcionário da produção.");
        System.out.println("4 - Gerar folha de pagamento.");
        System.out.println("0 - Sair do Programa.");
        
    
        }

private static void cadastrarFuncionarioPadrao(){
    System.out.println("\nCadastro de Funcinário Padrão\n");

    System.out.println("Digite o nome:");
    String nomeCompleto = entrada.nextLine().trim();

    //Verificação de espaço vazio ou contém números no nome
    while (nomeCompleto.isEmpty() || nomeCompleto.matches(".*\\d.*")) {

        if (nomeCompleto.isEmpty()) {
            System.out.println("\nO campo nome não pode ficar vazio.\n");
        } else {
            System.out.println("\nO nome não pode conter números.\n");
        }
        System.out.println("Digite o nome:");
        nomeCompleto = entrada.nextLine().trim();
    }

    System.out.println("\nDigite a matrícula:");
    int matricula = entrada.nextInt();

        //Verificação se o número de matrícula é negativo
        while (matricula < 0) {
     System.out.println("\nDigite um valor maior ou igual a 0.\n");
     System.out.println("Digita novamente a Matricula:");
            matricula = entrada.nextInt();
        }

    funcionarios.add(new FuncionarioPadrao(matricula,nomeCompleto));
    System.out.println("\nFuncionário cadastrado com sucesso!");
}

private static void cadastrarFuncionarioComissionado(){
    System.out.println("\nCadastro de Funcinário Comissionado\n");

    System.out.println("Digite o nome:");
    String nomeCompleto = entrada.nextLine().trim();

    //Verificação de espaço vazio ou contém números no nome
    while (nomeCompleto.isEmpty() || nomeCompleto.matches(".*\\d.*")) {

        if (nomeCompleto.isEmpty()) {
            System.out.println("\nO campo nome não pode ficar vazio.\n");
        } else {
            System.out.println("\nO nome não pode conter números.\n");
        }
        System.out.println("Digite o nome:");
        nomeCompleto = entrada.nextLine().trim();
    }

    System.out.println("\nDigite a matrícula");
    int matricula = entrada.nextInt();

    //Verificação se o número de matrícula é negativo
        while (matricula < 0) {
     System.out.println("\nDigite um valor maior ou igual a 0.\n");
     System.out.println("\nDigita novamente a Matricula:");
            matricula = entrada.nextInt();
        }

    System.out.println("\nDigite o valor das vendas:");
    double valorVendas = entrada.nextDouble();

    //Verificação se o valor de vendas é negativo

        while (valorVendas < 0) {
    System.out.println("\nDigite um valor maior ou igual a 0.\n");
    System.out.println("Digita novamente o valor das vendas:");
        
         valorVendas = entrada.nextDouble();
    }

    System.out.println("\nDigite o percentual da comissão");
    double percentualComissao = entrada.nextDouble();

    //Verificação se o valor de Comissão é negativo
        while (percentualComissao < 0) {
    System.out.println("\nDigite um valor maior ou igual a 0.\n");
    System.out.println("Digita novamente o percentual da comissão: ");

         percentualComissao = entrada.nextDouble();
    }

    funcionarios.add(new FuncionarioComissionado(matricula, nomeCompleto, valorVendas, percentualComissao));
    System.out.println("\nFuncionário cadastrado com sucesso!");
}
private static void cadastroFuncionarioProducao(){
    System.out.println("\n Cadastro de funcinário de produção\n");

    System.out.println("Digite o nome:");
    String nomeCompleto = entrada.nextLine().trim();
    
   //Verificação de espaço vazio ou contém números no nome
    while (nomeCompleto.isEmpty() || nomeCompleto.matches(".*\\d.*")) {

        if (nomeCompleto.isEmpty()) {
            System.out.println("\nO campo nome não pode ficar vazio.\n");
        } else {
            System.out.println("\nO nome não pode conter números.\n");
        }
        System.out.println("Digite o nome:");
        nomeCompleto = entrada.nextLine().trim();
    }

    System.out.println("\nDigite a matrícula");
    int matricula = entrada.nextInt();

     //Verificação se o número de matrícula é negativo
        while (matricula < 0) {
     System.out.println("\nDigite um valor maior ou igual a 0.\n");
     System.out.println("\nDigita novamente a Matricula:");
            matricula = entrada.nextInt();
        }

    System.out.println("\nDigite a quantidade de peças:");
    int quantidadePecas = entrada.nextInt();

     //Verificação se o número de peças é negativo
        while (quantidadePecas < 0) {
     System.out.println("\nDigite um valor maior ou igual a 0.\n");
     System.out.println("\nDigite novamente a quantidade de peças: \n");

         quantidadePecas = entrada.nextInt();
    
}

    System.out.println("\nDigite o valor de cada peça:");
    double valorPeca = entrada.nextDouble();

     //Verifica se é negativo
    while (valorPeca < 0) {
    System.out.println("\nDigite um valor maior ou igual a 0.\n");
    System.out.println("Digite novamente o valor de cada peça:\n");

    valorPeca = entrada.nextDouble();
}

    funcionarios.add(new FuncionarioProducao(matricula, nomeCompleto, quantidadePecas, valorPeca));
    System.out.println("\nFuncionário cadastrado com sucesso!");
}

private static void gerarFolhaPagamento(){
    System.out.println("\n==== Folha de Pagamento ====\n");
    
    if (funcionarios.isEmpty()) {
        System.out.println("Nenhum funcionário cadastrado.");
        return;
    }
    
    for (int i = 0; i < funcionarios.size(); i++) {
        System.out.println("------------------------------------------------------");
        System.out.println("Funcionário " + (i + 1));
        System.out.println("------------------------------------------------------");
        System.out.println(funcionarios.get(i));
        System.out.println();
    }
}
}
