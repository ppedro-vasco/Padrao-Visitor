public class ProdutoEstoqueVisitor implements Visitor {
    //Eletronico
    @Override
    public String exibirProdutoEstoque(ProdutoEletronico produtoEletronico) {
        return produtoEletronico.getNome();
    }

    @Override
    public int quantidadeProdutoEstoque(ProdutoEletronico produtoEletronico) {
        return produtoEletronico.getQuantidade();
    }

    @Override
    public float valorTotalProdutoEstoque(ProdutoEletronico produtoEletronico) {
        return produtoEletronico.getQuantidade() * produtoEletronico.getValorUnitario();
    }

    // Farmaceutico
    @Override
    public String exibirProdutoEstoque(ProdutoFarmaceutico produtoFarmaceutico) {
        return produtoFarmaceutico.getNome();
    }

    @Override
    public int quantidadeProdutoEstoque(ProdutoFarmaceutico produtoFarmaceutico) {
        return produtoFarmaceutico.getQuantidade();
    }

    @Override
    public float valorTotalProdutoEstoque(ProdutoFarmaceutico produtoFarmaceutico) {
        return produtoFarmaceutico.getQuantidade() * produtoFarmaceutico.getValorUnitario();
    }

    // Limpeza
    @Override
    public String exibirProdutoEstoque(ProdutoLimpeza produtoLimpeza) {
        return produtoLimpeza.getNome();
    }

    @Override
    public int quantidadeProdutoEstoque(ProdutoLimpeza produtoLimpeza) {
        return produtoLimpeza.getQuantidade();
    }

    @Override
    public float valorTotalProdutoEstoque(ProdutoLimpeza produtoLimpeza) {
        return produtoLimpeza.getQuantidade() * produtoLimpeza.getValorUnitario();
    }

}