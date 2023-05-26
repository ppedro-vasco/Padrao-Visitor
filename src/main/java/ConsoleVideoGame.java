public class ConsoleVideoGame extends ProdutoEletronico{
    String marca;
    public ConsoleVideoGame(int quantidade, String marca) {
        super("ConsoleVideoGame", quantidade, 4000.0f);

        this.marca = marca;
    }
}
