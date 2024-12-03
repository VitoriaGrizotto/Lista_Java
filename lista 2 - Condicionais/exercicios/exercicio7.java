import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        int resposta;
        String pergunta;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você deseja responder a pergunta 1 ou a pergunta 2?");
        resposta = scanner.nextInt();
        scanner.nextLine();

        switch (resposta){
            case 1 ->{
                System.out.println("De quem é a famosa frase 'Penso, logo existo'? \na) Platão \nb) Descartes \nc) Sócrates");
                pergunta = scanner.nextLine();
                if (pergunta.equalsIgnoreCase("b")){
                    System.out.println("Resposta certa!");
                }
                else {
                    System.out.println("Você errou!!");
                }
            }
            case 2 ->{
                System.out.println("Qual o livro mais vendido no mundo a seguir à Bíblia? \na) O Senhor dos Anéis \nb) Dom Quixote \nc)  O Pequeno Príncipe");
                pergunta = scanner.nextLine();
                if (pergunta.equalsIgnoreCase("b")){
                    System.out.println("Resposta certa!");
                }
                else {
                    System.out.println("Você errou!!");
                }
            }
        }
    }
}