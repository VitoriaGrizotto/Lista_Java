import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        int opcao, refeicao;
        double valor_viagem;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o destino das suas férias: \n[1] Maceió \n[2] Porto de Galinhas");
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1 -> {
                System.out.println("Com almoço/janta incluso? \n[1] Sim \n[2] Não");
                refeicao = scanner.nextInt();
                scanner.nextLine();

                if (refeicao == 1) {
                    valor_viagem = 3000 + 3000;
                    System.out.printf("O valor final da sua viagem é de: R$ %.2f", valor_viagem);

                } else {
                    valor_viagem = 3000 + 2550;
                    System.out.printf("O valor final da sua viagem é de: R$ %.2f", valor_viagem);
                }
            }
            case 2 -> {
                System.out.println("Com almoço/janta incluso? \n[1] Sim \n[2] Não");
                refeicao = scanner.nextInt();
                scanner.nextLine();

                if (refeicao == 1) {
                    valor_viagem = 3000 + 1800;
                    System.out.printf("O valor final da sua viagem é de: R$ %.2f", valor_viagem);

                } else {
                    valor_viagem = 3000 + 1350;
                    System.out.printf("O valor final da sua viagem é de: R$ %.2f", valor_viagem);
                }
            }


        }

    }
}