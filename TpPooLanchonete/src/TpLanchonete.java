
import model.*;
import service.ServiceCliente;
import service.ServiceJson;
import service.ServicePedido;
import service.ServiceProduto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Luiz
 */
public class TpLanchonete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ServiceCliente serviceCliente = new ServiceCliente();

        //ServiceProduto serviceProduto = new ServiceProduto();
        ServiceProduto serviceProduto = new ServiceProduto();
        ServiceJson serviceJson = new ServiceJson();

        //acessa a lista dos produtos
        List<Produto> produtoList = serviceProduto.getProdutoList();

        //acessa cliente list
        List<Cliente> clienteList = serviceCliente.getClienteList();

        //vai criar novos clientes
        //for(int i = 0; i<2 ; i++) {
           // serviceClienteAdicionar.adicionarCliente();
        //}

        //Chama o método incluirProduto para adicionar produtos à lista produtoList
        //serviceProduto.adicionarProduto();

       // }

        //serviceProduto.adicionarNaLista(produtoList);


       /* for (Cliente cliente : serviceCliente.carregarDoArquivo()) {
            System.out.println(cliente);

        }*/
       //GerarJson.adicionarProdutoJSON(produtoList);

        /*for(Cliente cliente : clienteList){
            System.out.print(cliente.getNome());
        }

        GerarJson.adicionarClientesJSON(clienteList);
        */
        /*for(Produto produto : produtoList){
            System.out.print(produto.getNomeProduto());
        }
        */

       /* ServiceJson serviceJson = new ServiceJson();

        List<Produto> produtos = serviceJson.lerProdutosDoJson("produtos.json");
        if (produtos != null) {
            serviceJson.compararProdutoComJson(produtos);
        }
        */


        ServicePedido servicePedido = new ServicePedido();

        servicePedido.compararEAdicionarPedido(produtoList);

    }
    }



        

     

