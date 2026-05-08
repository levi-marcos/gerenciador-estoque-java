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
                leitor.nextLine();

                estoque.put(nomeProduto, valorProduto);

            } else if (opcaoAdicionar.equalsIgnoreCase("N")){
                break;
            } else {
                System.out.println("OPÇÃO INVÁLIDA, DIGITE NOVAMENTE!");
            }
        }

        double somaTotalProdutos = 0;
        System.out.println("\nRelatório dos produtos do Estoque!");


        for (String nomeProduto: estoque.keySet()){
            double precoProduto = estoque.get(nomeProduto);
            System.out.println("Produto: " + nomeProduto + " | Preço: R$ " + precoProduto);
            somaTotalProdutos += precoProduto;
        }

        System.out.println("VALOR TOTAL DOS PRODUTOS É DE: " + somaTotalProdutos);

    }
}