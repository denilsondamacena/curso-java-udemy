package lista5.entities;

public class Product {

    public String nome;
    public double preco;
    public int quantidade;

    public double quantidadeTotalEstoque(){
        return preco * quantidade;
    }

    public void AdicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void RemoverProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
            + ", R$ "
            + String.format("%.2f", preco)
            + ", "  
            + quantidade
            + " unidades, Total: R$ "
            + String.format("%.2f", quantidadeTotalEstoque());
    }
}