import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num, resultado, resultado2;

        System.out.println("Informe um número para descobrir o antecessor e o sucessor: ");
        num = scanner.nextDouble();

        resultado = num + 1;
        resultado2 = num - 1;

        System.out.println("O número informado foi: " + num);
        System.out.println("\nO seu antecessor é: " + resultado2);
        System.out.println("\n E seu sucessor é: " + resultado);
    }
}
