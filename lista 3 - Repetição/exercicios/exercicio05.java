import java.util.Scanner;
 
public class exercicio05 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int saldoPositivo = 0, saldoNegativo = 0;
        String continuar;
 
        do {
            System.out.print("Digite o saldo: ");
            double saldo = scanner.nextDouble();
 
            if (saldo >= 0) saldoPositivo++;
            else saldoNegativo++;
 
            System.out.print("Deseja informar mais um saldo? (S/N): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("S"));
 
        int total = saldoPositivo + saldoNegativo;
        String mensagem = (saldoPositivo >= total / 2.0) ? "Nenhum risco!" : "Risco ao banco!";
        System.out.println(mensagem);
    }
}