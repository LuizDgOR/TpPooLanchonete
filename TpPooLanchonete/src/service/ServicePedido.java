package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.Listas;
import model.Pedido;
import model.Produto;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ServicePedido {

    List<Pedido> pedidoList = new ArrayList<>();
    ServiceProduto serviceProduto = new ServiceProduto();

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void listarProdutosDisponiveis() {
        for (Produto produto : serviceProduto.carregarDoArquivo()) {
            System.out.println(produto);
        }
    }

    public void adicionarProduto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto desejado: ");
        String nomeDesejado = scanner.nextLine();

        for (Produto produto : serviceProduto.produtoList) {
            String selecionarNomeProduto = produto.getNomeProduto();

            if (selecionarNomeProduto.equals(nomeDesejado)) {
                Pedido novoPedido = new Pedido(); // Crie uma nova instância de Pedido
                pedidoList.add(novoPedido); // Adicione o Pedido à lista de pedidos
            }
        }

        scanner.close();
    }


}

