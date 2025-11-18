import java.util.Scanner;

public class Main {

    public static void exibirMenu() {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 11) {
            System.out.println("\n===== MENU DO SISTEMA DE INVESTIMENTOS =====");
            System.out.println("1 - Cadastrar Investidor");
            System.out.println("2 - Cadastrar Investimento");
            System.out.println("3 - Criar Carteira");
            System.out.println("4 - Inserir Investimento na Carteira");
            System.out.println("5 - Listar Investimentos da Carteira");
            System.out.println("6 - Consultar Investimento");
            System.out.println("7 - Consultar Rentabilidade Total");
            System.out.println("8 - Excluir Investimento");
            System.out.println("9 - Simular Cenário Futuro");
            System.out.println("10 - Excluir Carteira");
            System.out.println("11 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            
            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("-> Cadastrar Investidor...");
                    break;
                case 2:
                    System.out.println("-> Cadastrar Investimento...");
                    break;
                case 3:
                    System.out.println("-> Criar Carteira...");
                    break;
                case 4:
                    System.out.println("-> Inserir Investimento na Carteira...");
                    break;
                case 5:
                    System.out.println("-> Listar Investimentos da Carteira...");
                    break;
                case 6:
                    System.out.println("-> Consultar Investimento...");
                    break;
                case 7:
                    System.out.println("-> Consultar Rentabilidade Total...");
                    break;
                case 8:
                    System.out.println("-> Excluir Investimento...");
                    break;
                case 9:
                    System.out.println("-> Simular Cenário Futuro...");
                    break;
                case 10:
                    System.out.println("-> Excluir Carteira...");
                    break;
                case 11:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        exibirMenu();
    }
}
