package model;

public class Pedido {
    private String numeroPedido;
    private String id;
    private String descricao;

    private String preco;

    public Pedido(String numeroPedido, String id, String descricao, String preco) {
        this.numeroPedido = numeroPedido;
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}

    
