import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCompra;
        double valorRepresentante;
        double valorImpostos;
        double valorVenda;

       System.out.print("Digite o valor de venda da mercadoria: ");
       valorCompra = scanner.nextDouble();

       valorRepresentante = valorCompra * 0.20;
       valorImpostos = valorCompra * 0.30;

       valorVenda = valorCompra + valorRepresentante + valorImpostos;

        System.out.println("O valor da compra total é: " + valorCompra);
        System.out.println("O valor do representante é: " + valorRepresentante);
        System.out.println("O valor do imposto: " + valorImpostos);
        System.out.println("E o valor total com todas as taxas é: " + valorVenda);
    }
}
