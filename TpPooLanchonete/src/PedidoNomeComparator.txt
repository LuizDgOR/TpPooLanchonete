
import model.Pedido;

import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luiz
 */
public class PedidoNomeComparator implements Comparator <Pedido> {

    @Override
    public int compare(Pedido p1, Pedido p2) {
        if(p1.getNomeCliente().compareTo(p2.getNomeCliente()) > 0){
            return 1;
        }
        return -1;
    }
    
}
