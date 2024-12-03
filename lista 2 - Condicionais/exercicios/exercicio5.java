import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeEstoque, quantidadeMaxima, quantidadeMinima;
        
        System.out.print("Digite a quantidade atual em estoque: ");
        quantidadeEstoque = scanner.nextInt();
        
        System.out.print("Digite a quantidade máxima em estoque: ");
        quantidadeMaxima = scanner.nextInt();
        
        System.out.print("Digite a quantidade mínima em estoque: ");
        quantidadeMinima = scanner.nextInt();
        
        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;
        
        System.out.println("Quantidade média em estoque: " + quantidadeMedia);
        
        if (quantidadeEstoque >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
        
    }
}
