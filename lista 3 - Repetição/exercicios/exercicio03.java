import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int otimo = 0, bom = 0, ruim = 0;
        String continuar;

        do {
            System.out.print("Dê sua opiniao sobre o filme (1-otimo, 2-Bom, 3-Ruim): ");
            int opiniao = scanner.nextInt();

            switch (opiniao) {
                case 1: otimo++; break;
                case 2: bom++; break;
                case 3: ruim++; break;
                default: System.out.println("Opção inválida.");
            }
            
                System.out.print("Deseja continuar? (S/N): ");
                continuar = scanner.next();
            } while (continuar.equalsIgnoreCase("S"));
    
            int total = otimo + bom + ruim;
            System.out.println("\nTotal de respondentes: " + total);
            System.out.printf("Ótimo: %d (%.2f%%)%n", otimo, (otimo * 100.0 / total));
            System.out.printf("Bom: %d (%.2f%%)%n", bom, (bom * 100.0 / total));
            System.out.printf("Ruim: %d (%.2f%%)%n", ruim, (ruim * 100.0 / total));
            System.out.printf("Média das notas: %.2f%n", (otimo * 1 + bom * 2 + ruim * 3) / (double) total);
               }
            }
