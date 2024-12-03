import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        String nome, sobrenome, dataNascimento,grauInstituicao, cargoPretendido;
        boolean cnh = false;
        Double pretencaoSalarial;
        String enter;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.println("Informe sua data de nascimento: ");
        dataNascimento = scanner.nextLine();
        System.out.println("Informe o seu grau de instituição? [Ensino médio - Ensino Técnico - Ensino superior]: ");
        grauInstituicao = scanner.nextLine();
        System.out.println("Informe seu cargo: ");
        cargoPretendido = scanner.nextLine();
        System.out.println("Informe se possui cnh [sim] [nao]");
        cnh = scanner.nextLine().equalsIgnoreCase("sim");
        System.out.println("Qual sua pretenção salarial?: ");
        pretencaoSalarial = Double.parseDouble(scanner.nextLine());

        System.out.println("Você deseja confirmar seus dados? aperte enter para confirmar");
        enter = scanner.nextLine();

        System.out.printf("DADOS CONFIRMADOS!!!");

        System.out.printf("Nome: " + nome);
        System.out.printf("\nSobrenome: " + sobrenome);
        System.out.printf("\nData de Nascimento: " + dataNascimento);
        System.out.printf("\nGrau de instituição: " + grauInstituicao);
        System.out.printf("\nCargo: " + cargoPretendido);
        System.out.printf("\nCNHB: " + cnh);
        System.out.printf("\nPretenção salarial: " + pretencaoSalarial);




    }

















}
