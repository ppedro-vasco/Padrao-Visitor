public class Detergente extends ProdutoLimpeza{
    String marca;
    public Detergente(int quantidade, String marca) {
        super("Detergente", quantidade, 8.0f);

        this.marca = marca;
    }
}
