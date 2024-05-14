import java.util.Scanner;

public class Empregado {
    private String nome;
    private int idade;
    private double salario;

    public static void main(String[] args){
        Scanner dadosScanner = new Scanner(System.in);
        Empregado empregado = new Empregado();

        System.out.println("Digite seu nome: ");
        empregado.nome = dadosScanner.nextLine();

        System.out.println("Digite sua idade: ");
        empregado.idade = dadosScanner.nextInt();

        System.out.println("Digite seu salario: ");
        empregado.salario =dadosScanner.nextDouble();

        promover();
    }

    public static void promover(<Class> empregado){
        
    }

    public static void aumentarSalario(String[]args){
        
    }

    public static void demitir(String[]args){
        
    }

    public static void felizAniversario(String[]args){
        
    }
}