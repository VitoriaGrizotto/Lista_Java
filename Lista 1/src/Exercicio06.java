import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota, nota2, peso1, peso2, soma;

        System.out.println("Qual foi sua primeira nota?: ");
        nota = scanner.nextDouble();

        System.out.println("Qual foi sua segunda nota?: ");
        nota2 = scanner.nextDouble();

        peso1 = nota * 0.4;
        peso2 = nota2 * 0.6;

        soma = peso1 + peso2;

        System.out.println("A sua média ponderada é de: " + soma);

    }
}
