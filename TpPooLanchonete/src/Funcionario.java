/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luiz
 */
public class Funcionario extends Usuario{

    private String cargo;
    private String salario;

    public Funcionario(String cargo, String salario, String nome, String cpf, String id, String endereco, String telefone, String senha, String nivel) {
        super(nome, cpf, id, endereco, telefone, senha, nivel);
        this.cargo = cargo;
        this.salario = salario;
    }

    
    
    
    

    
   
      
  public  void alterarInformações(){
  
  };

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +" Nome= " + this.getNome()+  " cargo=" + cargo + ", salario=" + salario +  " id " + this.getId() + " cpf=" + this.getCpf()+ " senha " + this.getSenha() + '}';
    }

   

    
  

   
    
}
