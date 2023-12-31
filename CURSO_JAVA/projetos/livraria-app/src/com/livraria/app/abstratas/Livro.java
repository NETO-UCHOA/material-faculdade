package com.livraria.app.abstratas;

import com.livraria.app.entidades.Autor;
import com.livraria.app.interfaces.Produto;

public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    private static int numLivrosCriados;

    public Livro(String nome, String isbn, Autor autor) {
        numLivrosCriados++;
        this.nome = nome;
        this.isbn = isbn;
        this.autor = autor;
    }

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public static int getNumLivrosCriados() {
        return numLivrosCriados;
    }

    public static void setNumLivrosCriados(int numLivrosCriados) {
        Livro.numLivrosCriados = numLivrosCriados;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("Exibindo detalhes do livro:");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.printf("Valor: R$ %.2f\n", valor);
        System.out.println("ISBN: " + isbn);

        if (temAutor()) {
            // Evitar o NPE (Null Pointer Exception)
            autor.exibirDetalhes();
        }

        System.out.println("-------");
    }

    private boolean temAutor() {
        return (autor != null);
    }

}
