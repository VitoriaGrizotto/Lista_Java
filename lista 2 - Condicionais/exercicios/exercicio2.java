import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        
        double valorUnitario = 10, valorFinal, valorDesconto;
        int quantidade;

    Scanner scanner = new Scanner (System.in);

        System.out.println("Quantos produtos você irá comprar?: ");
        quantidade = scanner.nextInt();

        valorFinal = quantidade * valorUnitario;
        valorDesconto = valorFinal - (valorUnitario * 0.10 );

        if (quantidade <= 12){
            System.out.println("O valor dessa compra será de: " + valorFinal);
        }else if (quantidade > 12){
            System.out.println("O valor dessa compra será de: " + valorDesconto);
        }
        

    }
}
