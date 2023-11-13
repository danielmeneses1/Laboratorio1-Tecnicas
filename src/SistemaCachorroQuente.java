import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaCachorroQuente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de Cachorro-Quente!");
        String proteina = escolherProteina(scanner);
        String queijo = escolherQueijo(scanner);
        List<String> ingredientesAdicionais = adicionarIngredientesAdicionais(scanner);
        String bebida = escolherBebida(scanner);

        CachorroQuente pedido = new CachorroQuente(proteina, queijo, ingredientesAdicionais, bebida);
        pedido.exibirPedido();

        scanner.close();
    }

    private static String escolherProteina(Scanner scanner) {
        System.out.println("Escolha a proteína do cachorro-quente:");
        System.out.println("1. Salsicha");
        System.out.println("2. Linguiça");
        System.out.println("3. Frango");
        System.out.println("4. Bacon");

        int opcaoProteina = scanner.nextInt();
        return obterProteina(opcaoProteina);
    }

    private static String escolherQueijo(Scanner scanner) {
        System.out.println("Escolha o queijo do cachorro-quente:");
        System.out.println("1. Mussarela");
        System.out.println("2. Prato");
        System.out.println("3. Parmesão");
        System.out.println("4. Coalho");

        int opcaoQueijo = scanner.nextInt();
        return obterQueijo(opcaoQueijo);
    }

    private static List<String> adicionarIngredientesAdicionais(Scanner scanner) {
        System.out.println("Deseja adicionar ingredientes adicionais? (S/N)");
        char respostaIngredientes = scanner.next().charAt(0);
        List<String> ingredientesAdicionais = new ArrayList<>();

        if (respostaIngredientes == 'S' || respostaIngredientes == 's') {
            System.out.println("Adicionando ingredientes adicionais: maionese, ketchup, ovo, batata palha");
            ingredientesAdicionais.add("maionese");
            ingredientesAdicionais.add("ketchup");
            ingredientesAdicionais.add("ovo");
            ingredientesAdicionais.add("batata palha");
        }

        return ingredientesAdicionais;
    }

    private static String escolherBebida(Scanner scanner) {
        System.out.println("Escolha a bebida:");
        System.out.println("1. Coca-cola");
        System.out.println("2. Del Rio");
        System.out.println("3. Suco do Chaves");

        int opcaoBebida = scanner.nextInt();
        return obterBebida(opcaoBebida);
    }

    private static String obterProteina(int opcao) {
        switch (opcao) {
            case 1:
                return "Salsicha";
            case 2:
                return "Linguiça";
            case 3:
                return "Frango";
            case 4:
                return "Bacon";
            default:
                return "Opção inválida";
        }
    }

    private static String obterQueijo(int opcao) {
        switch (opcao) {
            case 1:
                return "Mussarela";
            case 2:
                return "Prato";
            case 3:
                return "Parmesão";
            case 4:
                return "Coalho";
            default:
                return "Opção inválida";
        }
    }

    private static String obterBebida(int opcao) {
        switch (opcao) {
            case 1:
                return "Coca-cola";
            case 2:
                return "Del Rio";
            case 3:
                return "Suco do Chaves";
            default:
                return "Opção inválida";
        }
    }
}
