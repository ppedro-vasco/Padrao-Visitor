public interface Visitor {
    String exibirProdutoEstoque(ProdutoFarmaceutico produtoFarmaceutico);
    int quantidadeProdutoEstoque(ProdutoFarmaceutico produtoFarmaceutico);
    float valorTotalProdutoEstoque(ProdutoFarmaceutico produtoFarmaceutico);

    String exibirProdutoEstoque(ProdutoLimpeza produtoLimpeza);
    int quantidadeProdutoEstoque(ProdutoLimpeza produtoLimpeza);
    float valorTotalProdutoEstoque(ProdutoLimpeza produtoLimpeza);

    String exibirProdutoEstoque(ProdutoEletronico produtoEletronico);
    int quantidadeProdutoEstoque(ProdutoEletronico produtoEletronico);
    float valorTotalProdutoEstoque(ProdutoEletronico produtoEletronico);
}
