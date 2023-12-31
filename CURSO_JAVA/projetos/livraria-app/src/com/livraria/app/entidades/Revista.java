package com.livraria.app.entidades;

import com.livraria.app.interfaces.Produto;

public class Revista implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        System.out.println("Revista não tem desconto!");
    }

}
