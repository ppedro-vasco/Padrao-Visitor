public class Nafazolina extends ProdutoFarmaceutico {
    String marca;
    public Nafazolina(int quantidade, String marca) {
        super("Nafazolina", quantidade, 10.0f);

        this.marca = marca;
    }
}