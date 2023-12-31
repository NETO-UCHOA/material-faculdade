package com.livraria.app.entidades;

import com.livraria.app.abstratas.Livro;

public class MiniLivro extends Livro {

    public MiniLivro(String nome, String isbn, Autor autor) {
        super(nome, isbn, autor);
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        System.out.println("Minilivro não tem desconto!");
    }
    
}
