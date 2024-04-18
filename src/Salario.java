import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o salário atual do funcionário:");
        double salarioAtual = teclado.nextDouble();
        double salarioAntigo = salarioAtual;

        double reajuste = 0;
        double novoSalario;
        double inflacao = 0.038;
        double aumento = 0;
        double salarioFinal = 0;

        if (salarioAtual <= 280.0) {
            reajuste = salarioAtual * 0.20;
            aumento = 0.20;
        } else if (salarioAtual <= 700){
            reajuste = salarioAtual * 0.15;
            aumento = 0.15;
        } else if (salarioAtual <= 1500) {
            reajuste = salarioAtual * 0.10;
            aumento = 0.10;
        } else if (salarioAtual > 1500) {
            reajuste = salarioAtual * 0.05;
            aumento = 0.05;
        }

        novoSalario = salarioAtual + reajuste;


        System.out.println("Salário antes do reajuste: " + salarioAntigo + " R$");
        System.out.println("Percentual do aumento aplicado: " + aumento*100 + "%");
        System.out.println("Aplicado aumento de: " + reajuste + " R$");
        System.out.println("Novo salário após o aumento: " + novoSalario + " R$");
        salarioFinal = novoSalario - (novoSalario * inflacao);
        System.out.println("Salário final após inflação de "+ inflacao*100 +"%: "+salarioFinal+" R$");
    }
}