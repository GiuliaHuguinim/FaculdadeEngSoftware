import java.util.Scanner;

public class Empregado {
    private String nome;
    private int idade;
    private double salario;
    
        public Empregado(String nome, int idade, double salario) {
            this.nome = nome;
            this.idade = idade;
            this.salario = salario;
        }
    
        // Métodos getters e setters
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public int getIdade() {
            return idade;
        }
    
        public void setIdade(int idade) {
            this.idade = idade;
        }
    
        public double getSalario() {
            return salario;
        }
    
        public void setSalario(double salario) {
            this.salario = salario;
        }

public String toString() {
    return "Empregado{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            ", salario=" + salario +
            '}';
}
public void promover() {
    if (this.idade > 18) {
        aumentarSalario(25);
    }
}

public void aumentarSalario(double percentual) {
    this.salario += this.salario * (percentual / 100);
}

public void demitir(int motivo) {
    switch (motivo) {
        case 1:
            System.out.println("Demitido por justa causa. Deve cumprir aviso prévio.");
            break;

        case 2:
            double multa = this.salario * 0.40;
            System.out.println("Demitido por decisão do empregador. Multa de 40%: " + multa);
            break;

        case 3:
            if (this.salario >= 1000 && this.salario < 2000) {
                this.salario = 1500;
            } else if (this.salario >= 2000 && this.salario < 3000) {
                this.salario = 2500;
            } else if (this.salario >= 3000 && this.salario < 4000) {
                this.salario = 3500;
            } else if (this.salario >= 4000) {
                this.salario = 4000;
            }
            System.out.println("Aposentado com salário de: " + this.salario);
            break;

        default:
            System.out.println("Motivo inválido.");
    }
}

public void fazerAniversario() {
    this.idade += 1;
}
