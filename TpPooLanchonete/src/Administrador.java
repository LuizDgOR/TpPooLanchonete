/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luiz
 */
public class Administrador extends Funcionario {

    public Administrador(String cargo, String salario, String nome, String cpf, String id, String endereco, String telefone, String senha, String nivel) {
        super(cargo, salario, nome, cpf, id, endereco, telefone, senha, nivel);
    }

   
    @Override
    public String toString() {
        return "Administrador{" +" Nome= " + this.getNome()+  " cargo=" + this.getCargo() + ", salario=" + this.getSalario() +  " id " + this.getId() + " cpf=" + this.getCpf()+" senha " + this.getSenha() + '}';
    }
}
