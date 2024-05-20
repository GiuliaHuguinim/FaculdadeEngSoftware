import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Empregado> empregados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Criar novo empregado");
            System.out.println("2. Promover empregado");
            System.out.println("3. Aumentar salário do empregado");
            System.out.println("4. Demitir empregado");
            System.out.println("5. Fazer aniversário do empregado");
            System.out.println("6. Mostrar detalhes dos empregados");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Salário: ");
                    double salario = scanner.nextDouble();
                    empregados.add(new Empregado(nome, idade, salario));
                    break;
                case 2:
                    System.out.print("Índice do empregado: ");
                    int indicePromover = scanner.nextInt();
                    empregados.get(indicePromover).promover();
                    break;
                case 3:
                    System.out.print("Índice do empregado: ");
                    int indiceAumentar = scanner.nextInt();
                    System.out.print("Percentual de aumento: ");
                    double percentual = scanner.nextDouble();
                    empregados.get(indiceAumentar).aumentarSalario(percentual);
                    break;
                case 4:
                    System.out.print("Índice do empregado: ");
                    int indiceDemitir = scanner.nextInt();
                    System.out.print("Motivo (1: Justa causa, 2: Decisão do empregador, 3: Aposentadoria): ");
                    int motivo = scanner.nextInt();
                    empregados.get(indiceDemitir).demitir(motivo);
                    break;
                case 5:
                    System.out.print("Índice do empregado: ");
                    int indiceAniversario = scanner.nextInt();
                    empregados.get(indiceAniversario).fazerAniversario();
                    break;
                case 6:
                    for (int i = 0; i < empregados.size(); i++) {
                        System.out.println("Índice " + i + ": " + empregados.get(i));
                    }
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
