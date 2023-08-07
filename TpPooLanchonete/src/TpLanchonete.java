
import model.*;
import service.GerarJson;
import service.ServiceCliente;
import service.ServicePedido;

import java.util.List;

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

        ServiceCliente serviceClienteAdicionar = new ServiceCliente();

        ServicePedido serviceAdicionarProduto = new ServicePedido();

        List<Produto> produtoList = null;

        //acessa cliente list
        //List<Cliente> clienteList = serviceClienteAdicionar.getClienteList();

        //vai criar novos clientes
        //for(int i = 0; i<2 ; i++) {
           // serviceClienteAdicionar.adicionarCliente();
        //}

        serviceAdicionarProduto.adicionarProduto(produtoList);


        /*for(Cliente cliente : clienteList){
            System.out.print(cliente.getNome());
        }

        GerarJson.adicionarClientesJSON(clienteList);
        */


    }

}

        

     

