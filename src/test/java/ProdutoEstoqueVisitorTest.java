import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoEstoqueVisitorTest {

    // Exibir
    @Test
    void deveExibirProdutoFarmaceutico() {
        ProdutoFarmaceutico analgesico = new Analgesico(10, "Dipirona");

        ProdutoEstoqueVisitor visitor = new ProdutoEstoqueVisitor();
        assertEquals("Analgesico", visitor.exibirProdutoEstoque(analgesico));
    }

    @Test
    void deveExibirProdutoEletronico() {
        ProdutoEletronico smartphone = new Smartphone(5, "Samsung");

        ProdutoEstoqueVisitor visitor = new ProdutoEstoqueVisitor();
        assertEquals("Smartphone", visitor.exibirProdutoEstoque(smartphone));
    }

    @Test
    void deveExibirProdutoLimpeza() {
        ProdutoLimpeza detergente = new Detergente(20, "Ypê");

        ProdutoEstoqueVisitor visitor = new ProdutoEstoqueVisitor();
        assertEquals("Detergente", visitor.exibirProdutoEstoque(detergente));
    }

    // Quantidade
    @Test
    void deveRetornarQuantidadeProdutoFarmaceutico() {
        ProdutoFarmaceutico nafazolina = new Nafazolina(15, "Neosoro");

        ProdutoEstoqueVisitor visitor = new ProdutoEstoqueVisitor();
        assertEquals(15, visitor.quantidadeProdutoEstoque(nafazolina));
    }

    @Test
    void deveRetornarQuantidadeProdutoEletronico() {
        ProdutoEletronico consoleVideoGame = new ConsoleVideoGame(2, "PS5");

        ProdutoEstoqueVisitor visitor = new ProdutoEstoqueVisitor();
        assertEquals(2, visitor.quantidadeProdutoEstoque(consoleVideoGame));
    }

    @Test
    void deveRetornarQuantidadeProdutoLimpeza() {
        ProdutoLimpeza desinfetante = new Desinfetante(30, "Veja");

        ProdutoEstoqueVisitor visitor = new ProdutoEstoqueVisitor();
        assertEquals(30, visitor.quantidadeProdutoEstoque(desinfetante));
    }

    // Valor
    @Test
    void deveRetornarValorTotalProdutoFarmaceutico() {
        ProdutoFarmaceutico analgesico = new Analgesico(10, "Dipirona");

        ProdutoEstoqueVisitor visitor = new ProdutoEstoqueVisitor();
        assertEquals(150.0f, visitor.valorTotalProdutoEstoque(analgesico));
    }

    @Test
    void deveRetornarValorTotalProdutoEletronico() {
        ProdutoEletronico smartphone = new Smartphone(5, "Samsung");

        ProdutoEstoqueVisitor visitor = new ProdutoEstoqueVisitor();
        assertEquals(7500.0f, visitor.valorTotalProdutoEstoque(smartphone));
    }

    @Test
    void deveRetornarValorTotalProdutoLimpeza() {
        ProdutoLimpeza detergente = new Detergente(20, "Ypê");

        ProdutoEstoqueVisitor visitor = new ProdutoEstoqueVisitor();
        assertEquals(160.0f, visitor.valorTotalProdutoEstoque(detergente));
    }
}
