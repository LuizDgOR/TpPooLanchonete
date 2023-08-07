package service;

import model.Cliente;
import model.Pedido;
import model.Produto;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;

public class ServicePedido {

    List<Pedido> pedidoList = new ArrayList<>();


    List<Produto> produtoList = new ArrayList<>();
    List<Cliente> clienteList;

    ServiceCliente  serviceClienteAdicionar;// faz referencia a instancia

    public void adicionarProduto(List<Produto> produtoList) {
        Produto novoProduto = new Produto(nome,idproduto,preco);
        novoproduto.add(produtoList); // Adiciona o produto à lista de produtos do pedido
    }
    public void incluirPedido(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do pedido: ");
        String numeroPedido = scanner.nextLine();

        System.out.print("Digite o ID do cliente: ");
        String idCliente = scanner.nextLine();

        System.out.print("Digite a descrição do pedido: ");
        String descricao = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Digite o preço do pedido: ");
        String preco = scanner.nextLine();

        Pedido novoPedido = new Pedido(numeroPedido, idCliente, descricao, preco);
        pedidoList.add(novoPedido);
        System.out.println("Pedido adicionado com sucesso");

    }

    public void incluirProdutoNoPedido(Cliente cliente) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o ID do produto: ");
        String idProduto = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        String preco = scanner.nextLine();

        Produto novoProduto = new Produto(nome, idProduto, preco);
        cliente.getPedidoAtivo().incluirProdutoNoPEdido(novoProduto);
        System.out.println("Produto adicionado ao pedido do cliente com sucesso");


    }

    public void incluirPedidoParaCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente cliente : clienteList) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            incluirProdutoNoPedido(clienteEncontrado); // Chama o método com o cliente encontrado
        } else {
            System.out.println("Cliente não encontrado");
            System.out.println("Deseja adicionar um novo cliente? (sim/nao)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("sim")) {
                serviceClienteAdicionar.adicionarCliente();
            }
        }
    }


}










