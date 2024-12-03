import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade50 = 0, altura160 = 0, pesoAbaixo80 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a altura da pessoa: ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o peso da pessoa: ");
            double peso = scanner.nextDouble();

            if (idade > 50) idade50++;
            if (altura > 1.60) altura160++;
            if (peso < 80) pesoAbaixo80++;
        }

        System.out.println("\nPessoas com idade acima de 50 anos: " + idade50);
        System.out.println("Pessoas com altura acima de 1.60m: " + altura160);
        System.out.println("Pessoas com peso abaixo de 80kg: " + pesoAbaixo80);
    }
}
