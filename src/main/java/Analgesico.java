public class Analgesico extends ProdutoFarmaceutico {
    String marca;
    public Analgesico(int quantidade, String marca) {
        super("Analgesico", quantidade, 15.0f);

        this.marca = marca;
    }
}