
import model.Cliente;

import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luiz
 */
public class ClienteNomeComparator implements Comparator <Cliente> {

     @Override
    public int compare(Cliente c1 , Cliente c2){
        if(c1.getNome().compareTo(c2.getNome())> 0){
            return 1;
    }
    return -1;
    }
}
