package model.Abstracts;

public abstract class Usuario {
    private String nome;
    private String cpf;
    private String id;

    // Construtor da classe
    public Usuario(String nome, String cpf, String id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
    }

    //método para as classes filhas implementarem
    public void login(){}
}
