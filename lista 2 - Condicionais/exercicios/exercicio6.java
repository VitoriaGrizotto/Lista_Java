import java.util.Random;
import java.util.Scanner;


public class exercicio6 {
    public static void main(String[] args) {
        Random random = new Random();

        int numero_sorte = random.nextInt(100);

        int chute;
        int tentativas = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("O computador gerou um número aleatório, tente acertar! \nVocê tem 3 tentativas. \nDigite um número: ");

        while (tentativas < 3){

            chute = scanner.nextInt();
            scanner.nextLine();

            if (chute == numero_sorte){
                System.out.printf("Você acertou!!! O número era %d",numero_sorte);
                break;
            }
            else if (tentativas == 2){
                System.out.println("Suas tentativas acabaram");
                break;
            }
            else{
                System.out.println("Você errou, tente novamente: ");
                tentativas ++;
            }
        }

    }
}