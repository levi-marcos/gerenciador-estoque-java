import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, Double> estoque = new HashMap<>();

        System.out.println("Bem-vindo ao Gerenciador de Estoque!");

        while (true){
            System.out.println("Deseja adicionar um produto ao estoque? [S] [N]");
            String opcaoAdicionar = leitor.nextLine();

            if (opcaoAdicionar.equalsIgnoreCase("S")){
                System.out.println("NOME DO PRODUTO: ");
                String nomeProduto = leitor.nextLine();

                System.out.println("VALOR DO PRODUTO: ");
                double valorProduto = leitor.nextDouble();
            } else if (opcaoAdicionar.equalsIgnoreCase("N")){
                break;
            } else {
                System.out.println("OPÇÃO INVÁLIDA, DIGITE NOVAMENTE!");
            }
        }

    }
}