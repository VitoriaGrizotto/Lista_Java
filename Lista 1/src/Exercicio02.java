import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, soma, sub, multi, divisao, potencia, resto;


        System.out.println("Digite o primeiro número inteiro: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        num2 = scanner.nextInt();

        soma = num1 + num2;
        sub = num1 - num2;
        multi = num1 * num2;
        divisao = num1/num2;
        potencia = Math.pow(num1, num2);
        resto = num1 % num2;

        System.out.println("Soma: " + soma);
        System.out.println("\n Subtração: " + sub);
        System.out.println("\n Multiplicação: " + multi);
        System.out.println("\n Divisão: " + divisao);
        System.out.println("\n Potencia: " + potencia);
        System.out.println("\n Resto da divisão: " + resto);

    }
}
