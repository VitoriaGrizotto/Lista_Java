import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carrosVendidos;
        double salarioVendedor,comissaoCarros,comissaoPorCarro,porcentagemVendas,bonusVendas,salarioTotal;

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        System.out.print("Digite o mês: ");
        String mes = scanner.nextLine();

        System.out.print("Digite o número de carros vendidos: ");
        carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas da loja no mês: R$ ");
        double valorTotalVendas = scanner.nextDouble();

        salarioVendedor = 1500.00;
        comissaoPorCarro = 350.00;
        porcentagemVendas = 0.001;

        comissaoCarros = carrosVendidos * comissaoPorCarro;
        bonusVendas = valorTotalVendas * porcentagemVendas;
        salarioTotal = salarioVendedor + comissaoCarros + bonusVendas;

        System.out.println("\n--- Resumo do Salário ---");
        System.out.println("Nome do Vendedor: " + nomeVendedor);
        System.out.println("Mês: " + mes);
        System.out.println("Carros Vendidos: " + carrosVendidos);
        System.out.printf("Valor Total de Vendas da Loja: R$ %.2f\n", valorTotalVendas);
        System.out.printf("Salário Total: R$ %.2f\n", salarioTotal);
    }
}