/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Luiz
 */
public class Cliente  {
    
   String nome;
   String endereco;
   String telefone;
   String id;
   String cpf;
   private static int contador = 0;
    
    public Cliente(String nome, String endereco, String telefone, String id, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.id = id;
        this.cpf = cpf;
    }
    public Cliente(){
        contador ++;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Cliente.contador = contador;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", id=" + id + ", cpf=" + cpf + '}';
    }
   
   
   
   
    
}
