package model;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luiz
 */
public class Produto{
    private String nomeProduto;
    private String Idproduto;
    private String preco;


    public Produto(String nome, String idproduto, String preco) {
        this.nomeProduto = nome;
        Idproduto = idproduto;
        this.preco = preco;
    }


    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nome) {
        this.nomeProduto = nome;
    }

    public String getIdproduto() {
        return Idproduto;
    }

    public void setIdproduto(String idproduto) {
        Idproduto = idproduto;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", Idproduto='" + Idproduto + '\'' +
                ", preco='" + preco + '\'' +
                '}';
    }
}