import java.util.List;

public class CachorroQuente {
    private String proteina;
    private String queijo;
    private List<String> ingredientesAdicionais;
    private String bebida;

    public CachorroQuente(String proteina, String queijo, List<String> ingredientesAdicionais, String bebida) {
        this.proteina = proteina;
        this.queijo = queijo;
        this.ingredientesAdicionais = ingredientesAdicionais;
        this.bebida = bebida;
    }

    public void exibirPedido() {
        System.out.println("\nPedido Finalizado:");
        System.out.println("Proteína: " + proteina);
        System.out.println("Queijo: " + queijo);
        System.out.println("Ingredientes Adicionais: " + ingredientesAdicionais);
        System.out.println("Bebida: " + bebida);
    }
}

