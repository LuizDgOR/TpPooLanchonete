package service;

import model.Pedido;
import model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ServicePedido {

    List<Pedido> pedidoList = new ArrayList<>();
    ServiceProduto serviceProduto = new ServiceProduto();

    public void listarProdutosDisponiveis() {
        for (Produto produto : serviceProduto.carregarDoArquivo()) {
            System.out.println(produto);
        }
    }




}

