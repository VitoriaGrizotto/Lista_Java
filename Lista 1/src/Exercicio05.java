import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horas, minutos, segundos, totalSegundos;

        System.out.print("Digite a quantidade de horas: ");
        horas = scanner.nextInt();

        System.out.print("Digite a quantidade de minutos: ");
        minutos = scanner.nextInt();

        System.out.print("Digite a quantidade de segundos: ");
        segundos = scanner.nextInt();

        totalSegundos = (horas * 3600) + (minutos * 60) + segundos;

        System.out.println("\nO horário informado em segundos é: " + totalSegundos + " segundos.");
    }
}
