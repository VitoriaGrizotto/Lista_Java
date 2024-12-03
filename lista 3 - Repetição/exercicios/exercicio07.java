import java.util.Scanner;
 
public class exercicio07 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
 
        String nomeMaisAlto = "", nomeMaisPesado = "";
        double alturaMaisAlta = 0, pesoMaisPesado = 0;
 
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.next();
 
            System.out.print("Digite a altura de " + nome + ": ");
            double altura = scanner.nextDouble();
 
            System.out.print("Digite o peso de " + nome + ": ");
            double peso = scanner.nextDouble();
 
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlto = nome;
            }
            if (peso > pesoMaisPesado) {
                pesoMaisPesado = peso;
                nomeMaisPesado = nome;
            }
        }
 
        System.out.println("\nPessoa mais alta: " + nomeMaisAlto + " com " + alturaMaisAlta + "m");
        System.out.println("Pessoa mais pesada: " + nomeMaisPesado + " com " + pesoMaisPesado + "kg");
    }
}
