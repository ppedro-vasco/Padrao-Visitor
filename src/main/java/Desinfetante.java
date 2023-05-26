public class Desinfetante extends ProdutoLimpeza{
    String marca;
    public Desinfetante(int quantidade, String marca) {
        super("Desinfetante", quantidade, 15.0f);

        this.marca = marca;
    }
}
