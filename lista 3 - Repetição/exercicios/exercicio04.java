import java.util.Scanner;

public class exercicio04 {
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
 
        System.out.print("Digite o número que devera finalizar: ");
        int numero = scanner.nextInt();
 
        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();
 
        for (int i = 0; i <= numero; i += incremento) {
            System.out.print(i + " ");
        }
    }
}

