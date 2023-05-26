public interface ProdutoEstoque {
    void aceitar(Visitor visitor);
    String exibir();
    int getQuantidade();
    float getValorTotal();
}