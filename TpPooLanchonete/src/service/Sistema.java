package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Sistema {
    
    //Vetores
    private Funcionario funcs[] = new Funcionario[10];
    private Administrador adms [] = new Administrador[5];
    
    // Listas
    private static List <Pedido> listaPedidos = new ArrayList();
    private static List <Funcionario> funcionarios = new ArrayList();
    private static List <Administrador> adm = new ArrayList();
    private static List <Cliente> cliente = new ArrayList();
    private static List <Produto> produto = new ArrayList();
    private static List <Pedido> pedido = new ArrayList();
    private static int instanciasCliente = 0;
    //** Funções para verificar nas listas */
    /** Verifica se já possui um Adm  cadastrado na lista */
    public boolean verificarAdm(String cpf,String senha){ 
        for(Administrador a : adm){
            if(a.getCpf().equals(cpf) && a.getSenha().equals(senha) ){
               
                return true;
            }
        }
        return false;
    };
    /** Imrprime a quantidade de insntaicas da classe cliente * - Questao 11*/
    public void instanciasCliente(){
        System.out.println(instanciasCliente);
    };
    /**  Verifica se já possui um Funcionario  cadastrado na lista com o Cpf e senha mencionados */
    public boolean verificarFunc(String cpf,String senha){ 
        for(Funcionario f : funcionarios){
            if(f.getCpf().equals(cpf) && f.getSenha().equals(senha)){
               
                return true;
            }
        }
        return false;
    };
    /** Verifica se já possui um Cliente  cadastrado na lista com o Cpf e senha mencionados */
    public boolean verificarCli(String cpf,String nome){ /** Verifica se já possui um Cliente  cadastrado na lista com o Cpf e senha mencionados */
        for(Cliente c : cliente){
            if(c.getCpf().equalsIgnoreCase(cpf) && c.getNome().equalsIgnoreCase(nome)){
               
                return true;
            }
        }
        return false;
    };
    /**Imprime os funcs */
    public void imprimirFuncs(){
        for(Funcionario f : funcionarios){
            System.out.println(" Funcionarios: " + f.getId() + f.getNome() + f.getCpf());
        }
    };
    // Adms
    
    /**Add Funcionarios  no vetor. */
    
    public void addFuncs(Funcionario funcs, int n){
        this.funcs[n] = funcs;
    };
    /**Add  adms no vetor. */
    public void addAdms(Administrador adm , int n){
        this.adms[n] = adm;
    };
   /**Add  adms no vetor. */
    public void addAdm(Administrador a){
        adm.add(a);
    };
    /**8 Remove adm da lista */
    public boolean removerAdm(String id){
        for(Administrador a : adm){
            if(a.getId().equalsIgnoreCase(id)){
                adm.remove(a);
                return true;
            }
        }
        return false;
    };
    /** Adiciona um novo pedido */
    public void adicionarPedido(Pedido p){
        listaPedidos.add(p);
    } 
    /** Remove um pedido */
    public boolean removerPedido(String numeroPedido) {
    for(Pedido p : pedido){
        if(p.getNumeroPedido().equalsIgnoreCase(numeroPedido)){
            pedido.remove(p);
            return true;
        }
    }
    return false;
    }
    /** Adiciona um novo produto */
    public void addProduto(Produto p){
        produto.add(p);
    };
    
    /** Altera nome do funcionario */
    public void alterarNomeFunc(String id, String nome) { // Alterar nome
    for(Funcionario f : funcionarios){
        if(f.getId().equalsIgnoreCase(id)) {
            f.setNome(nome);
            
        }
} 
    };
    /** Alterar senha do funcionario */
    public void alterarSenhaFunc(String cpf, String senha) { // Alterar senha
    for(Funcionario f : funcionarios){
        if(f.getCpf().equalsIgnoreCase(cpf)) {
            f.setSenha(senha);
            
        }
} 
    };
    /** Muda a senha do funcionario */
    public void mudarSenhaFunc(String cpf, String senha) { // Alterar senha 
    for(Funcionario f : funcionarios){
        if(f.getCpf().equalsIgnoreCase(cpf)) {
            f.setSenha(senha);
            
        }
} 
    };
    /** Altera o salario do funcionario */
    public void alterarSalarioFunc(String id, String salario) { // Alterar salario
    for(Funcionario f : funcionarios){
        if(f.getId().equalsIgnoreCase(id)) {
            f.setSalario(salario);
            
        }
} 
    };
    /** Altera o salario do adm */
    public void alterarSalarioAdm(String id, String salario) { // Alterar salario
    for(Administrador a : adm){
        if(a.getId().equalsIgnoreCase(id)) {
            a.setSalario(salario);
            
        }
} 
    };
    /** Altera a senha do adm */
    public void alterarSenhaAdm(String id, String senha) { // Alterar salario
    for(Administrador a : adm){
        if(a.getId().equalsIgnoreCase(id)) {
            a.setSenha(senha);
            
        }
} 
    };
    /** Altera o nome do adm */
    public void alterarNomeAdm(String id, String nome) { // Alterar nome
    for(Administrador a : adm){
        if(a.getId().equalsIgnoreCase(id)) {
            a.setNome(nome);
            
        }
} 
    };
    /** Altera o status do pedido */
    public void alterarStatusPedido(String id, String status) { // Alterar o estado do pedido
    for(Pedido p : pedido){
        if(p.getNumeroPedido().equalsIgnoreCase(id)) {
            p.setStatus(status);
            
        }
} 
    };
    /** altera a descricao do pedido */
    public void alterarDescricaoPedido(String id, String descricao) { // Alterar a descricao do pedido
    for(Pedido p : pedido){
        if(p.getIdDescricaoPedido().equalsIgnoreCase(id)) {
           p.setIdDescricaoPedido(descricao);
            
        }
} 
    };
    
    /** Remove um produto */
    public boolean removerProduto(String numeroProduto){
        for(Produto p : produto){
            if(p.getIdproduto().equalsIgnoreCase(numeroProduto)){
                produto.remove(p);
                return true;
            }
        }
        return false;
    }
    /** Imprime os pedidos */
    public void imprimirPedido(){
        for(Pedido pedido : listaPedidos ){
           System.out.println(pedido.getNumeroPedido());     
       }
    }
    /** Busca um determinado pedido */
    public ArrayList<Pedido> buscadorPedido(String anodaBusca){

        ArrayList<Pedido> resultadoBusca = new ArrayList<>();
        for (Pedido p : pedido) {
            if ( p.getDataPedido().equalsIgnoreCase(anodaBusca)){

                resultadoBusca.add(p);
                
            }
        }
        return resultadoBusca;
    }
    /** Busca um determinado cliente */
    public ArrayList<Cliente> buscadorCliente(String cpf){

        ArrayList<Cliente> resultadoBusca = new ArrayList<>();
        for (Cliente c : cliente) {
            if ( c.getCpf().equalsIgnoreCase(cpf)){

                resultadoBusca.add(c);
                
            }
        }
        return resultadoBusca;
    }
    
   /** Menu do adm com suas funcionalidades */
   public void menuAdm(){
        Scanner sc = new Scanner(System.in);
        Sistema s = new Sistema();
        System.out.println("Incluir Administrador - 1");
        System.out.println("Incluir Funcionário - 2");
        System.out.println("Incluir Produto - 3");
        System.out.println("Alterar informações sobre funcionário - 4");
        System.out.println("Alterar informações sobre Administrador - 5");
        System.out.println("Remover Funcionario - 6");
        System.out.println("Remover Produto - 7 ");
        System.out.println("Incluir Cliente - 8 "); 
        System.out.println("Exibir Funcionarios - 9 "); 
        System.out.println("Quantidade clientes - 10 ");
        System.out.println("sair -11");
        System.out.println("Voltar -12");
        System.out.println("Ordernar Cliente pelo nome -13");
        int numero = sc.nextInt();
        switch(numero){
            case 1: incluirAdministrador();
                    System.out.println("Administrador incluido com sucesso");
                    
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuAdm();
                    break;
                   
                   
            case 2: incluirFuncionario();
                    System.out.println("Funcionario incluido com sucesso");
                    
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuAdm();
                    break;
            
            case 3: incluirProduto();
                    System.out.println("Produto incluido com sucesso");
                    
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuAdm();
                    break;
            
            case 4: alterarFunc();
                    System.out.println("Funcionario alterado com sucesso");
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuAdm();
                    break;
            case 5: alterarAdm();
                    System.out.println("Administrador alterado com sucesso ");
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuAdm();
                    break;
            case 6: System.out.println(funcionarios);
                    System.out.println("Selecione o id do funcionario que sera removido");
                    String id = sc.next();
                    s.removerFuncionario(id);
                    System.out.println("Funcionario removido com sucesso");
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuAdm();
                    break;
            case 7: System.out.println(produto);
                    System.out.println("Selecione o id do Produto que sera removido");
                    String idP = sc.next();
                    s.removerProduto(idP);
                    System.out.println("Produto removido com sucesso");
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuAdm();
                    break;
            case 8 : incluirClienteAdm();
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuAdm();
                    break;
                
                
            case 9 : System.out.println(funcionarios);
                     System.out.println("-------- Menu ---------- ");
                     System.out.println("------------------------- ");
                     System.out.println("------------------------- ");
                     System.out.println("----------------------- ");
                     menuAdm();
                     break;
            case 10: System.out.println(" Quantidade instancias cliente: ");
                     instanciasCliente();
                     System.out.println("-------- Menu ---------- ");
                     System.out.println("------------------------- ");
                     System.out.println("------------------------- ");
                     System.out.println("----------------------- ");
                     menuAdm();
                     break;
            case 11: System.exit(0);
                      break;
            case 12 : login();
                      break;
            case 13 : s.clienteOrdenado();
                      menuAdm();
                      break;
            default: System.out.println("Opcao invalida");
                     System.out.println("-------- Menu ---------- ");
                     System.out.println("------------------------- ");
                     System.out.println("------------------------- ");
                     System.out.println("----------------------- ");
                     menuAdm();
              
        }
    };
   /** tela de login */
   public void login(){
      Scanner scanner = new Scanner(System.in);
      Scanner sc = new Scanner(System.in);
      Sistema s = new Sistema();
      System.out.println("***** Selecione uma operação que deseja realizar *****");
      System.out.println("------------------------------------------------------");
      System.out.println(" logar ");
      System.out.println("|   Opção 1 - Administrador   |");
      System.out.println("|   Opção 2 - Funcionario     |");
      int op = sc.nextInt();
      switch(op){
          case 1: 
              System.out.println("cpf ");
              
              String cpf = sc.next();
              System.out.println(" senha ");
              String senha = sc.next();
              
             if(s.verificarAdm(cpf, senha)==true){
                  System.out.println(" Logado com sucesso");
                  s.menuAdm();
             }else{
                 System.out.println("Administrador nao encontrado");
                 login();
             }
              break;
          case 2:
              System.out.println("cpf ");
              String cpffunc = sc.next();
              System.out.println(" senha ");
              String senhafunc = sc.next();
              if(s.verificarFunc(cpffunc,senhafunc)==true){
                  System.out.println(" Logado com sucesso");
                  s.menuFunc();
              }else{
                  System.out.println("Funcionario nao encontrado");
                  login();
              };
              break;
      }
   }
   /** Menu do funcionario com suas funçoes */
   public void menuFunc(){
        Scanner sc = new Scanner(System.in);
        Sistema s = new Sistema();
        System.out.println("Alterar dados - 1");
        System.out.println("Incluir Pedido - 2"); /////////////// 
        System.out.println("Remover Pedido - 3"); /// Cancela o pedido
        System.out.println("Alterar Pedido - 4");
        System.out.println("Pesquisar Pedidos - 5"); /// 
        System.out.println("sair -6");
        System.out.println("Voltar -7");
        System.out.println("Ordernar Pedidos pelo nome -8 "); /// Comparator
        int numero = sc.nextInt();
        switch(numero){
            case 1: System.out.println("Digite seu cpf");
                    String cpf = sc.next();
                    System.out.println("Digite a nova senha");
                    String senha = sc.next();
                    alterarSenhaFunc(cpf,senha);
                    System.out.println("Funcionario alterado com sucesso");
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuFunc();
                    
                    break;
                   
                   
            case 2: incluirPedido();
                    
                    System.out.println("Pedido incluido com sucesso ");
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuFunc();
                    break;
            
            case 3: System.out.println(pedido);
                    System.out.println("Selecione o id do Pedido que sera removido");
                    String id = sc.next();
                    removerPedido(id);
                    System.out.println("Pedido removido com sucesso");
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuFunc();
                    break;
            
            case 4: alterarPedido();
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuFunc();
                    break;
            case 5: System.out.println("Digite o ano: ");
                    String ano = sc.next();
                   System.out.println(buscadorPedido(ano));
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuFunc();
                    break;
            case 6 : System.exit(0);
                    break;
            case 7:login();
                    break;
            case 8: s.pedidoOrdenado();
                    menuFunc();
                    break;
           default: System.out.println("Opcao invalida");
                    System.out.println("-------- Menu ---------- ");
                    System.out.println("------------------------- ");
                    System.out.println("------------------------- ");
                    System.out.println("----------------------- ");
                    menuFunc();
                    break;
   };
   }
   
   /** altera a senha, o nome e o salario dos administradores */
     public void alterarAdm(){ 
          Scanner sc = new Scanner(System.in);
          Sistema s = new Sistema();
          System.out.println("Administradores cadastrados no sistema : ");
          System.out.println(adm);
          
         
          System.out.println(" Digite 1 para alterar a senha : \n  Digite 2 para alterar o nome : \n Digite 3 para alterar o salario : ");
          int numero = sc.nextInt();
        switch(numero){
            case 1: System.out.println("Escolha o id do administrador que sera alterado a senha ");
                    String id = sc.next();
                    System.out.println("Digite a nova senha ");
                    String senha = sc.next();
                    alterarSenhaAdm(id,senha);
                    s.admJson();
                    System.out.println(adm);
                    System.out.println("Senha alterada com sucesso ");
                    menuAdm();// retorna pro menu
                    break;
                   
                   
            case 2: System.out.println("Escolha o id do Administrador que sera alterado o nome ");
                    String id2 = sc.next();
                    System.out.println("Digite o novo nome ");
                    String nome = sc.next();
                    alterarNomeAdm(id2,nome);
                    System.out.println(adm);
                    System.out.println(" Nome alterada com sucesso ");
                    menuAdm();// retorna pro menu
                    break;
            
            case 3: System.out.println("Escolha o id do Administrador que sera alterado o salario ");
                    String id3 = sc.next();
                    System.out.println("Digite o novo salario ");
                    String salario = sc.next();
                    alterarSalarioAdm(id3,salario);
                    System.out.println(adm);
                    System.out.println(" Salario alterado com sucesso ");
                    menuAdm();// retorna pro menu
                    break;
                    
                    default: System.out.println("Opcao invalida");
                    menuAdm();
                    break;
                            
        }
         
          
     };
     /** Altera o pedido */
     public void alterarPedido(){
          Scanner sc = new Scanner(System.in);
          Sistema s = new Sistema();
          System.out.println("Pedidos cadastrados no sistema : ");
          System.out.println(pedido);
          
         
          System.out.println(" Digite 1 para alterar o status do pedido : \n  Digite 2 para a descricao do pedido : ");
          int numero = sc.nextInt();
        switch(numero){
            case 1: System.out.println("Escolha o id do pedido que sera alterado  ");
                    String id = sc.next();
                    System.out.println("Digite o novo status ");
                    String status = sc.next();
                    alterarStatusPedido(id,status);
                    System.out.println(pedido);
                    System.out.println("Estado alterado com sucesso ");
                    menuFunc();// retorna pro menu
                    break;
                   
                   
            case 2: System.out.println("Escolha o id para alterar a descricao ");
                    String id2 = sc.next();
                    System.out.println("Digite a nova descricao ");
                    String descricao = sc.next();
                    alterarDescricaoPedido(id2,descricao);
                    System.out.println(pedido);
                    System.out.println(" Descricao alterada com sucesso ");
                    menuFunc();// retorna pro menu
                    break;
            
            
                    
                    default: System.out.println("Opcao invalida");
                    menuFunc();
                    break;
                            
        }
    };
     /** Altera o funcionario */
     public void alterarFunc(){ 
          Scanner sc = new Scanner(System.in);
          Sistema s = new Sistema();
          System.out.println("Funcionarios cadastrados no sistema : " );
          System.out.println(funcionarios);
         
          
          
          
          System.out.println(" Digite 1 para alterar a senha : \n  Digite 2 para alterar o nome : \n Digite 3 para alterar o salario : ");
          int numero = sc.nextInt();
        switch(numero){
            case 1: System.out.println("Escolha o id do funcionario que sera alterado a senha ");
                    String id = sc.next();
                    System.out.println("Digite a nova senha ");
                    String senha = sc.next();
                    alterarSenhaFunc(id,senha);
                    System.out.println(funcionarios);
                    System.out.println("Senha alterada com sucesso ");
                    menuAdm();// retorna pro menu
                    break;
                   
                   
            case 2: System.out.println("Escolha o id do funcionario que sera alterado o nome ");
                    String id2 = sc.next();
                    System.out.println("Digite o novo nome ");
                    String nome = sc.next();
                    alterarNomeFunc(id2,nome);
                    System.out.println(funcionarios);
                    System.out.println(" Nome alterada com sucesso ");
                    menuAdm();// retorna pro menu
                    break;
            
            case 3: System.out.println("Escolha o id do funcionario que sera alterado o salario ");
                    String id3 = sc.next();
                    System.out.println("Digite o novo salario ");
                    String salario = sc.next();
                    alterarSalarioFunc(id3,salario);
                    System.out.println(funcionarios);
                    System.out.println(" Salario alterada com sucesso ");
                    menuAdm();// retorna pro menu
                    break;
                    
                    default: System.out.println("Opcao invalida");
                    menuAdm();
                    break;
                            
        }
         
          
     };
     /** Cria um administrador novo  */
     public void incluirAdministrador(){
                    Scanner sc = new Scanner(System.in);
                    System.out.println(" digite o nome ");
                    String nome = sc.next();
                    System.out.println(" cpf: ");
                    String cpf = sc.next();
                    System.out.println(" Nivel: ");
                    String nivel = sc.next();
                    System.out.println(" Cargo ");
                    String cargo = sc.next();
                    System.out.println(" Salario");
                    String salario = sc.next();
                    System.out.println(" Id");
                    String id = sc.next();
                    System.out.println("Endereco");
                    String endereco = sc.next();
                    System.out.println(" Telefone");
                    String telefone = sc.next();
                    System.out.println("Senha");
                    String senha = sc.next();

                    Administrador a = new Administrador(cargo,salario,nome,cpf,id,endereco,telefone,senha,nivel);
                    Sistema s = new Sistema();
                    s.addAdm(a);
                    s.admJson();
     
     }
     /** Coleta os dados para incluir um funcionario novo */
     public void incluirFuncionario(){
                    
                    Scanner sc = new Scanner(System.in);
                    System.out.println(" digite o nome ");
                    String nomeF = sc.next();
                    System.out.println(" cpf: ");
                    String cpfF = sc.next();
                    System.out.println(" Nivel: ");
                    String nivelF = sc.next();
                    System.out.println(" Cargo ");
                    String cargoF = sc.next();
                    System.out.println(" Salario");
                    String salarioF = sc.next();
                    System.out.println(" Id");
                    String idF = sc.next();
                    System.out.println("Endereco");
                    String enderecoF = sc.next();
                    System.out.println(" Telefone");
                    String telefoneF = sc.next();
                    System.out.println("Senha");
                    String senhaF = sc.next();
                   
                    
                    Funcionario f = new Funcionario(nomeF,cpfF,nivelF,cargoF,salarioF,idF,enderecoF,telefoneF,senhaF);
                    Sistema s = new Sistema();
                    s.addFuncionario(f);
                    s.funcJson();
     }
     /** Solicita os dados do cliente e adiciona um novo cliente */
     public void incluirClienteAdm(){ // adm inclui o cliente
                    Scanner sc = new Scanner(System.in);
                    System.out.println(" digite o nome ");
                    String nomeC = sc.next();
                    System.out.println("Endereco");
                    String enderecoC = sc.next();
                    System.out.println(" Telefone");
                    String telefoneC = sc.next();
                    System.out.println(" Id");
                    String idC = sc.next();
                    System.out.println(" cpf: ");
                    String cpfC = sc.next();
                    
                    
                   
                   Cliente c = new Cliente(nomeC,enderecoC,telefoneC,idC,cpfC); 
                    Sistema s = new Sistema();
                    s.incluirCliente(c);
                    s.clienteJson();
                    instanciasCliente++;
     }
     /** Ordena os clientes com comparator- QUESTAO 12 */
     public void clienteOrdenado(){ //// QUESTAO 12
         /// ordena os nomes dos clientes
         Collections.sort(cliente,new ClienteNomeComparator());
         for(Cliente c : cliente){
             System.out.println(c.toString());
         };
     };
     /** Ordena os pedidos atraves do comparator */
     public void pedidoOrdenado(){ ///////// Questao 12 ordenando os pedidos com comparator
         Collections.sort(pedido,new PedidoNomeComparator());
         for(Pedido p : pedido){
             System.out.println(p.toString());
         }
     };
     /** Coleta os dados de um pedido e adiciona um novo */
     public void incluirProduto(){
         Scanner sc = new Scanner(System.in);
         System.out.println(" Nome: ");
         String nome = sc.next();
         System.out.println(" Id do produto ");
         String idProduto = sc.next();
         System.out.println("Preço: ");
         String preco = sc.next();
         System.out.println("Descricao ");
         String descricao = sc.next();
         System.out.println("Id Descricao");
         String idDescricao = sc.next();
         Produto p = new Produto(nome,idProduto,preco,descricao,idDescricao);
         Sistema s = new Sistema();
         s.addProduto(p);
         s.prodJson();
     
     };
     /** Coleta dados do pedido para criar um novo pedido no sistema */
     public void incluirPedido(){/////////////////////// falta fazer
         
         Scanner sc = new Scanner(System.in);
         Sistema s = new Sistema();
         System.out.println(" Numero do pedido : ");
         String numero = sc.next();
         System.out.println(" Data do pedido ");
         String data = sc.next();
         System.out.println("Horário do pedido : ");
         String horarioP = sc.next();
         System.out.println("Horario da entrega:  ");
         String horarioE = sc.next();
         System.out.println("Id Descricao do Pedido");
         String idDescricaoP = sc.next();
         System.out.println(" Id adicionais: ");
         String idAdicionais = sc.next();
         System.out.println("Estado \n Em Preparo \n  Entregue \nCancelado ");
         String estado = sc.next();
         System.out.println("Nome");
         String nome = sc.next();
         System.out.println("Digite o cpf do cliente");
         String cpfC = sc.next();
         if(verificarCli(cpfC,nome) == true){
             Pedido p = new Pedido(cpfC,nome,numero, data, horarioP, horarioE, idDescricaoP, idAdicionais,estado);
                System.out.println("Pedido cadastrado com sucesso ");
                s.addPedido(p);
                s.extratoPedido(numero);
                s.pedidoJson();
         } else{
             System.out.println("Cliente não cadastrado");
         };
         
         
         
         
         
         
     };
     /** Inclui um cliente e adiciona mais uma instancia dele - Questao 10 */
     public void incluirCliente(Cliente c){
        cliente.add(c);
        instanciasCliente++;
    };
     /** Adiciona um funcionario */
     public void addFuncionario(Funcionario a){
        funcionarios.add(a);
    };
     /** Adiciona um pedido */
    public void addPedido(Pedido p){
        pedido.add(p);
    }
    /** Exclui um pedido */
    public boolean excluirPedido(String id){
        for(Pedido p : pedido){
        if(p.getNumeroPedido().equalsIgnoreCase(id)){
            pedido.remove(id);
            return true;
        }
        }
        return false;
    };
   /** Gera um extrato do pedido */
    public void extratoPedido(String numeroPedido){
        for(Pedido p : listaPedidos){
            if(p.getNumeroPedido().equalsIgnoreCase(numeroPedido))
                System.out.println(p.toString());
        }
    };
    
    
    /** Exclui um cliente do sistema */
    public boolean excluirCliente(String id){
        for(Cliente c : cliente){
            if(c.getId().equalsIgnoreCase(id)){
                cliente.remove(c);
                return true;
            }
        }
        return false;
    };
   
   
    
    
    /** Remove funcionario do arraylist */
     public boolean removerFuncionario(String id){
       for(Funcionario c : funcionarios){
       if(c.getId().equalsIgnoreCase(id)){
          funcionarios.remove(c);
          return true;
       }
       }
       return false;
        }
     
     
     /** Exibir os funcionarios */
     public String exibirFuncionarios(){
       String s = " ";
         int i = 1;
         System.out.println(" ");
     for (Funcionario f : funcionarios){
         s+= "  Funcionarios: " + (i++) + "  ";
       s+= f.toString() + " \n";
     }
     return s;
   }
     /** Exibe os pedidos */
     public String exibirPedidos(){
       String s = " ";
         int i = 1;
         System.out.println(" ");
     for (Pedido p : pedido){
         s+= "  Pedidos : " + (i++) + "  ";
       s+= p.toString() + " \n";
     }
     return s;
   }
     
     /** Exibe os adms */
     public String exibirAdms(){
       String s = " ";
         int i = 1;
         System.out.println(" ");
     for (Administrador a : adm){
         s+= "  Administradores : " + (i++) + "  ";
       s+= a.toString() + " \n";
     }
     return s;
   }
     /** Exibe um produto */
     public String exibirProdutos(){
       String s = " ";
         int i = 1;
         System.out.println(" ");
     for (Produto p : produto){
         s+= "  Funcionarios: " + (i++) + "  ";
       s+= p.toString() + " \n";
     }
     return s;
   }
    /** Cria um arquivo Json no endereço mencionado, com alguns adms e funcs */
    public void json(){
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        String json = gson.toJson(funcs);
        String json2 = gson.toJson(adms);
       
        
        try {
		//Escreve Json convertido em arquivo 
		FileWriter writer = new FileWriter("C:\\Users\\pedro\\OneDrive\\Documentos\\NetBeansProjects\\TpPooLanchonete\\admEfunc.json");
		writer.write(json);
                writer.write(json2);
               
		writer.close();
                
            
	} catch (IOException e) {
                 
		e.printStackTrace();
	}
    }
    /** Cria um json no endereço mencionado com os pedidos cadastrados */
    public void pedidoJson(){
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        
       
        String json6 = gson.toJson(pedido);
        
        try {
		//Escreve Json convertido em arquivo 
		FileWriter writer = new FileWriter("C:\\Users\\pedro\\OneDrive\\Documentos\\NetBeansProjects\\TpPooLanchonete\\pedido.json");
		
               
                writer.write(json6);
		writer.close();
                
            
	} catch (IOException e) {
                 
		e.printStackTrace();
	}
    }  
    /** Cria um json dos novos funcionario cadastrados */
    public void funcJson(){
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        String json = gson.toJson(funcionarios);
        
        
        try {
		//Escreve Json convertido em arquivo 
		FileWriter writer = new FileWriter("C:\\Users\\pedro\\OneDrive\\Documentos\\NetBeansProjects\\TpPooLanchonete\\funcionarios.json");
		writer.write(json);
                
		writer.close();
                
            
	} catch (IOException e) {
                 
		e.printStackTrace();
	}
    }
     /** Cria um json dos novos adms cadastrados */
    public void admJson(){
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
       
        String json2 = gson.toJson(adm);
       
        
        try {
		//Escreve Json convertido em arquivo 
		FileWriter writer = new FileWriter("C:\\Users\\pedro\\OneDrive\\Documentos\\NetBeansProjects\\TpPooLanchonete\\adms.json");
		
                writer.write(json2);
                
		writer.close();
                
            
	} catch (IOException e) {
                 
		e.printStackTrace();
	}
    }
    /** Cria um json dos novos clientes cadastrados */
    public void clienteJson(){
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
    
        String json5 = gson.toJson(cliente);
       
        
        try {
		//Escreve Json convertido em arquivo 
		FileWriter writer = new FileWriter("C:\\Users\\pedro\\OneDrive\\Documentos\\NetBeansProjects\\TpPooLanchonete\\clientes.json");
		
                writer.write(json5);
                
		writer.close();
                
            
	} catch (IOException e) {
                 
		e.printStackTrace();
	}
    }
    /** Cria um json dos novos produtos cadastrados */
    public void prodJson(){
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        String json = gson.toJson(produto);
        
        
        try {
		//Escreve Json convertido em arquivo 
		FileWriter writer = new FileWriter("C:\\Users\\pedro\\OneDrive\\Documentos\\NetBeansProjects\\TpPooLanchonete\\produtos.json");
		writer.write(json);
                
		writer.close();
                
            
	} catch (IOException e) {
                 
		e.printStackTrace();
	}
    }
    }
    