package model;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    private List<Cliente> clientesList;

    private List<Pedido> pedidoList;

    private List <Produto> produtoPedido;

    public Listas() {
    }

    public List<Cliente> getClientesList() {
        return clientesList;
    }

    public void setClientesList(List<Cliente> clientesList) {
        this.clientesList = clientesList;
    }

    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    public List<Produto> getProdutoPedido() {
        return produtoPedido;
    }

    public void setProdutoPedido(List<Produto> produtoPedido) {
        this.produtoPedido = produtoPedido;
    }
}
