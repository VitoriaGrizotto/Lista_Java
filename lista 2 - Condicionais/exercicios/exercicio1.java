import java.util.Scanner;

public class exercicio1 {
 public static void main(String[] args) {
    
    int idade;

    Scanner scanner = new Scanner (System.in);

    System.out.println("Informe sua idade: ");
    idade = scanner.nextInt();

    if(idade<=14){
        System.out.println("Você é uma criança");
        idade = scanner.nextInt();
    }else if (idade > 14 && idade <17){
        System.out.println("Você é um adolescente");
        idade = scanner.nextInt();

    }else if (idade > 17 && idade < 30){
        System.out.println("Você é um jovem adulto");
        idade = scanner.nextInt();
    }else if (idade > 30){
        System.out.println("Você é um adulto");
        idade = scanner.nextInt();
    }
    








 }

}
 