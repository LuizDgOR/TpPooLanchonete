package model;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.List;

/**
 *
 * @author Luiz
 */


public class Cliente  {
    
   private String nome;
   private String endereco;
   private String telefone;
   private String idCliente;
   private String cpf;

   private Pedido pedidoAtivo;

    public Cliente(String nome, String endereco, String telefone, String idCliente, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idCliente = idCliente;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String id) {
        this.idCliente = idCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pedido getPedidoAtivo() {
        return pedidoAtivo;
    }

    public void setPedidoAtivo(Pedido pedidoAtivo) {
        this.pedidoAtivo = pedidoAtivo;
    }
}
