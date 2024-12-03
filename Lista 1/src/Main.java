import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // variaveis da problematica

        double quantiaCarlos = 0;
        String aprovacaodeAninha = ""; // aspas simples pra caracter e aspas simples para string
        boolean feriasJoana = false;

        //variaveis para o controle do programa

        int opcao = 0; // Controlar o menu do switch case
        String continuar = ""; // Controla o laço de repetição while

        //Variaveis para a entrada
        Scanner scanner = new Scanner(System.in) ;

        while (!continuar.equalsIgnoreCase( "sair")){ //enquanto a variavel "continuar" for diferente de sair,
            // o laço continuar repetindo

            System.out.println("Qual membro da família você deseja inserir dados?");
            System.out.println("""
                    [1] Carlos
                    [2] Joana
                    [2] Ana
                    [4] Exibir situação
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpeza do buffer

            switch (opcao){
                case 1 -> {
                    try {
                        System.out.println("Qual a quantia que o Carlos conseguiu juntar?");
                        quantiaCarlos = Double.parseDouble(scanner.nextLine());
                        continue;

                    }catch (NumberFormatException e){
                        System.out.println("Você digitou caracteres invalidos, digite novamente");
                        continue;
                    }

                }
                case 2 ->{
                    System.out.println("Joana conseguiu tirar férias? Digite sim ou não");
                    feriasJoana = scanner.nextLine().equalsIgnoreCase("sim");
                    continue;

                }

                case 3 ->{
                    System.out.println("A Ana passou de ano? Digite aprovada ou reprovado");
                    aprovacaodeAninha = scanner.nextLine();
                    continue;
                }
                case 4 -> {
                    if(quantiaCarlos >= 8000 && aprovacaodeAninha.equalsIgnoreCase("aprovada") && feriasJoana){
                        System.out.println("A família podera viajar");
                    } else if (quantiaCarlos < 8000 && aprovacaodeAninha.equalsIgnoreCase("aprovada") && feriasJoana){
                        System.out.println("Carlos não conseguiu juntar o dinheiro");
                    }else if (quantiaCarlos >= 8000 && aprovacaodeAninha.equalsIgnoreCase("aprovada") && !feriasJoana){
                        System.out.println("Joana não conseguiu tirar férias");
                    }else if (quantiaCarlos>=8000 && aprovacaodeAninha.equalsIgnoreCase("reprovada") && feriasJoana){
                        System.out.println("A Ana reprovou!");
                    }
                    else{
                        System.out.println("Dois ou mais critérios não foram atingidos");
                    }


                }
            }

            System.out.print("Deseja continuar ou sair do programa?");
            continuar=scanner.nextLine();
        }


    }
}

