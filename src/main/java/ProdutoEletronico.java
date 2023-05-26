public class ProdutoEletronico implements ProdutoEstoque {
    private String nome;
    private int quantidade;
    private float valorUnitario;

    public ProdutoEletronico(String nome, int quantidade, float valorUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.exibirProdutoEstoque(this);
    }

    @Override
    public String exibir() {
        return nome;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public float getValorTotal() {
        return quantidade * valorUnitario;
    }

    public String getNome(){
        return nome;
    }
    public float getValorUnitario(){
        return valorUnitario;
    }
}
