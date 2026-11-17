import java.util.Scanner;

public class trabalho {
    private static final Scanner sc = new Scanner(System.in);
    private static int proximoIdAni = 1;
    private static int proximoIdVet = 1;

    public static void main(String[] args) {
        int perfil = LoginUsuario();

        switch (perfil) {
            case 1:
                menuRecepcionista();
                break;
            case 2:
                menuVeterinario();
                break;
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
        }
    }

    static int LoginUsuario() {
        int opcao;

        do {
            System.out.println("=== Acesso ao Sistema VidaPet ===");
            System.out.println("1 - Recepcionista");
            System.out.println("2 - Veterinário");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            if (opcao != 1 && opcao != 2) {
                System.out.println("Opção inválida. Escolha 1 ou 2.\n");
            }
        } while (opcao != 1 && opcao != 2);
        return opcao;
    }

    static void menuRecepcionista() {
        int opcao;

        do {
            System.out.println("\n=== Menu da Recepcionista ===");
            System.out.println("1 - Gerenciar cadastros");
            System.out.println("2 - Gerenciar consultas");
            System.out.println("3 - Consultar agenda");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    menuCadastros();
                    break;
                case 2:
                    System.out.println("Você escolheu gerenciar consultas.");
                    break;
                case 3:
                    System.out.println("Você escolheu consultar a agenda.");
                    break;
                case 0:
                    System.out.println("Voltando ao menu de acesso.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    static void menuVeterinario() {
        int opcao;
        do{
            System.out.println("\n=== Menu do Veterinário ===");
            System.out.println("1 - Consultar agenda");
            System.out.println("2 - Realizar consultas");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu consultar a agenda.");
                    break;
                case 2:
                    System.out.println("Você escolheu realizar consultas.");
                    break;
                case 0:
                    System.out.println("Voltando ao menu de acesso.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    static void menuCadastros() {
        int opcao;

        do {
            System.out.println("\n=== Gerenciar Cadastros ===");
            System.out.println("1 - Cadastrar animal");
            System.out.println("2 - Cadastrar veterinário");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarAnimal();
                    break;
                case 2:
                    cadastrarVeterinario();
                    break;
                case 0:
                    System.out.println("Voltando ao menu da recepcionista.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    static void cadastrarAnimal() {
    sc.nextLine();

    System.out.println("\n=== Cadastro de Animal ===");

    System.out.print("Nome do animal: ");
    String nome = sc.nextLine();

    System.out.print("Espécie (cão ou gato): ");
    String especie = sc.nextLine();

    System.out.print("Idade em anos completos: ");
    int idade = sc.nextInt();
    sc.nextLine();

    System.out.print("Nome do tutor: ");
    String tutor = sc.nextLine();

    System.out.print("Telefone do tutor: ");
    String tel = sc.nextLine();

    int id = proximoIdAni++;

    System.out.println("\nAnimal cadastrado!");
    System.out.println("ID: " + id);
    System.out.println("Nome: " + nome);
    System.out.println("Espécie: " + especie);
    System.out.println("Idade: " + idade);
    System.out.println("Tutor: " + tutor);
    System.out.println("Telefone: " + tel);
}

static void cadastrarVeterinario() {
    sc.nextLine();

    System.out.println("\n=== Cadastro de Veterinário ===");

    System.out.print("Nome do veterinário: ");
    String nome = sc.nextLine();

    System.out.print("CRMV: ");
    String crmv = sc.nextLine();

    int id = proximoIdVet++;

    System.out.println("\nVeterinário cadastrado!");
    System.out.println("ID: " + id);
    System.out.println("Nome: " + nome);
    System.out.println("CRMV: " + crmv);
}
}