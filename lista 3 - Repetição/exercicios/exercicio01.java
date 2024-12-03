import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0, impares = 0, negativo = 0, positivos = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Digite 10 números:");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) pares++;
            else impares++;

            if (numeros[i] < 0) negativo++;
            else if (numeros[i] > 0) positivos++;

        }
        while (true){
            System.out.println("\nEscolha uma opção: ");
            System.out.println("a. Quantos números pares? ");
            System.out.println("b. Quantos números ímpares? ");
            System.out.println("c. Quantos negativos? ");
            System.out.println("d. Quantos positivos? ");
            System.out.println("e. Sair do programa ");

            String escolha = scanner.next();

            switch (escolha){
                case "a":
                    System.out.println("Números pares: " + pares);
                    break;

                case "b":
                    System.out.println("Números impares: " + impares);
                    break;

                case "c":
                    System.out.println("Números negativos: " + negativo);
                    break;

                case "d":
                    System.out.println("Números positivos: " + positivos);
                    break;

                case "e":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");

            }

        }
    }

}
