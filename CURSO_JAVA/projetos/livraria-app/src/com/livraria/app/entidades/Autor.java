package com.livraria.app.entidades;

public class Autor {

    private String nome;
    private String email;
    private String registro;

    public Autor() {

    }

    public Autor(String nome) {
        this.nome = nome;
    }

    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public void exibirDetalhes() {
        System.out.println("Exibindo detalhes do autor:");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Registro: " + registro);
        System.out.println("------");
    }

}
