
import model.*;
import service.Sistema;

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
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Sistema s = new Sistema();

        Scanner sc = new Scanner(System.in);
        // QUestao 05 - O sistema deverá armazenar de forma estática 15 colaboradores..
        Funcionario f1 = new Funcionario("func1","1200"," Paula", "123456789-10","1 "," bela vista","4545455454", "1235454","1");
        Funcionario f2 = new Funcionario("func2","1200"," Paulo", "12345612211789-10","2 "," bela vista","4545455432354", "1254544545435454","1");
        Funcionario f3 = new Funcionario ("func3", "1200","Gustavo","1324342121344","3","centro","343124143141","1456","1");
        Funcionario f4 = new Funcionario ("func4", "1200","Joao","13243434211214","4","centro","343124143141","45623","1");
        Funcionario f5 = new Funcionario ("func5", "1200","Julia","13243212124344","5","centro","343124143141","456121","1");
        Funcionario f6 = new Funcionario ("func6", "1200","Fernando","13254443434344","6","centro","343124143141","456244","1");
        Funcionario f7 = new Funcionario ("func7", "1200","Fernanda","132476767634344","7","centro","343124143141","456121","1");
        Funcionario f8 = new Funcionario ("func8", "1200","Gabriela","1324121212134344","8","centro","343124143141","45612121","1");
        Funcionario f9 = new Funcionario ("func9", "1200","Guilherme","132121212434344","9","centro","343124143141","4577776","1");
        Funcionario f10 = new Funcionario ("func10", "1200","Bruno","1324212134344","10","centro","343124143141","4560989898","1");
        s.addFuncs(f1,0);
        s.addFuncs(f2,1);
        s.addFuncs(f3,2);
        s.addFuncs(f4,3);
        s.addFuncs(f5,5);
        s.addFuncs(f6,6);
        s.addFuncs(f7,7);
        s.addFuncs(f8,8);
        s.addFuncs(f9,9);
        

        Administrador a1 = new Administrador("adm1","3000","Fernando miguel","123434343","11"," rio grande","12333"," 134566","2");
        Administrador a2 = new Administrador("adm2","3000","Fernanda","12343434312","12"," rio grande","12333"," 134566","2");
        Administrador a3 = new Administrador("adm3","3000","Francisco","1234343421213","13"," rio grande","12333"," 134566","2");
        Administrador a4 = new Administrador("adm4","3000","Izabela","123434342121213","14"," rio grande","12333"," 134566","2");
        Administrador a5 = new Administrador("adm5","3000","Milena","123434342121213","15"," rio grande","12333"," 134566","2");
        s.addAdms(a1, 0);
        s.addAdms(a2, 1);
        s.addAdms(a3, 2);
        s.addAdms(a4, 3);
        s.addAdms(a5, 4);
        

        ///







         


         System.out.println(s.exibirFuncionarios());   
         s.removerFuncionario("123");
         System.out.println(s.exibirFuncionarios());
         s.json();


         System.out.println(s);
         Administrador r9 = new Administrador(" gerente","100000","Ronaldo","987","4545","123","1 ","3","1");
         Funcionario f100 = new Funcionario ("func10", "1200","Bruno","1324212134344","10","centro","343124143141","4560989898","1");
         Funcionario f1000 = new Funcionario ("func12", "1200","Bruno","1324212134344","100","centro","343124143141","4560989898","1");
         Funcionario f155 = new Funcionario ("Atendente", "1500","Julia","13","90","centro","343124143141","1","1");
         Funcionario f200 = new Funcionario("Garçom","20000","Joao","12344343","91","rua gaivotas","9982198291","12434343","2");
         s.addFuncionario(f1000);
         s.addFuncionario(f100);
         s.addFuncionario(f155);
         s.addFuncionario(f200);
         s.addAdm(r9);
         s.admJson();
         ////////////////////////////////////////////////////////
         ////////////// Produtos /////////////////////////
         Produto p = new Produto("Coxinha","1","3","de frango","1");
         Produto p1 = new Produto("Coxinha","2","5","de catupiry","2");
         Produto p2 = new Produto("Pizza","3","16"," de chocolate","3");
         Produto p3 = new Produto("Sanduiche","4","7","de frango","4");
         Produto p4 = new Produto("Sanduiche","5","8","de Bacon","5");
         Produto p5 = new Produto("Empada","6","9","de frango","6");
         s.addProduto(p1);
         s.addProduto(p2);
         s.addProduto(p3);
         s.addProduto(p4);
         s.addProduto(p4);
         s.addProduto(p5);
         s.prodJson();
         
         /**/////////////////////////// Cliente ////////////////////*//
         Cliente c = new Cliente("Julia","Beco das gaivotas","1232","1","123456");
         Cliente c1 = new Cliente("Fernanda","Espirito Santo","12322","2","1234567");
         Cliente c2 = new Cliente("Natalia","Beco das gaivotas","12323","3","12345678");
         Cliente c3 = new Cliente("Amanda","Beco das gaivotas","12362","4","123456789");
         Cliente c4 = new Cliente("Paulo","Beco das gaivotas","12328","5","12345678910");
         Cliente c5 = new Cliente("Gabriela","Beco das gaivotas","12329","6","1234567891011");
         s.incluirCliente(c);
         s.incluirCliente(c1);
         s.incluirCliente(c2);
         s.incluirCliente(c3);
         s.incluirCliente(c4);
         s.incluirCliente(c5);
         s.clienteJson();
         
         /**////////////////////////////////////// Pedidos //////////////////////////*/
         Pedido pedido1 = new Pedido("123456","julia", "1","2021","3","4","5","6","em preparo");
         Pedido pedido2 = new Pedido("1234567","Ananda","2","2020","20h","23h","2","3","entregue");
         Pedido pedido3 = new Pedido("12345678","Gabriela","3","2020","22h","23h","2","3","entregue");
         Pedido pedido4 = new Pedido("123456789","Fernando","4","2020","23h","23h","2","3","entregue");
         Pedido pedido5 = new Pedido("12345678910","Wagner","5","2020","18h","23h","2","3","entregue");
         Pedido pedido6 = new Pedido("1234567891011","Ricardo","6","2020","22h","23h","2","3","entregue");
         s.addPedido(pedido1);
         s.addPedido(pedido2);
         s.pedidoJson();
         s.login();
              
            
}

}
        
        

     

