/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luiz
 */
public class Produto{
    private String nome;
    private String Idproduto;
    private String preco;
    private String descricao;
    private String idDescricao;

    public Produto(String nome, String Idproduto, String preco, String descricao, String idDescricao) {
        this.nome = nome;
        this.Idproduto = Idproduto;
        this.preco = preco;
        this.descricao = descricao;
        this.idDescricao = idDescricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdproduto() {
        return Idproduto;
    }

    public void setIdproduto(String Idproduto) {
        this.Idproduto = Idproduto;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIdDescricao() {
        return idDescricao;
    }

    public void setIdDescricao(String idDescricao) {
        this.idDescricao = idDescricao;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", Idproduto=" + Idproduto + ", preco=" + preco + ", descricao=" + descricao + ", idDescricao=" + idDescricao + '}';
    }

    
    
    
}