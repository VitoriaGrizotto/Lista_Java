import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int golsTimeA = 0;
        int golsTimeB = 0;
        String resposta;
        
        boolean continuar = true;
        
        do {
            System.out.print("Digite a quantidade de gols do Time A: ");
            golsTimeA = scanner.nextInt();
            
            System.out.print("Digite a quantidade de gols do Time B: ");
            golsTimeB = scanner.nextInt();
            
            if (golsTimeA > golsTimeB) {
                System.out.println("O Time A venceu!");
            } else if (golsTimeB > golsTimeA) {
                System.out.println("O Time B venceu!");
            } else {
                System.out.println("Empatou!");
            }
            System.out.print("Deseja jogar outra vez? (sim/nao): ");
            resposta = scanner.next();
            
        } while (resposta.equalsIgnoreCase("sim")); 
        
        
        
    }
}

