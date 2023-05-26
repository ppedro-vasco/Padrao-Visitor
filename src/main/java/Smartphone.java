public class Smartphone extends ProdutoEletronico{
    String marca;
    public Smartphone(int quantidade, String marca) {
        super("Smartphone", quantidade, 1500.0f);

        this.marca = marca;
    }
}
