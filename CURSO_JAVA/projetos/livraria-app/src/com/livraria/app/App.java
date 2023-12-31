package com.livraria.app;

import com.livraria.app.entidades.Autor;
import com.livraria.app.entidades.CarrinhoCompras;
import com.livraria.app.entidades.Ebook;
import com.livraria.app.entidades.LivroFisico;

public class App {
    public static void main(String[] args) {
        Autor autor = new Autor();

        autor.setNome("J.K. Rowling");
        autor.setEmail("jkrowling@hp.uk");
        autor.setRegistro("12345");

        LivroFisico livro1 = new LivroFisico("Harry Potter e a Pedra Filosofal", "978-85-333-0227-1", autor);

        livro1.setDescricao("Livro Capa Dura");
        livro1.setValor(49.90);

        // livro1.exibirDetalhes();

        // System.out.println(livro1.getAutor());
        // System.out.println(Livro.getNumLivrosCriados());
        
        LivroFisico livro2 = new LivroFisico("Harry Potter e a Câmara Secreta", "978-85-333-0227-2", autor);

        livro2.setDescricao("Livro Capa Dura");
        livro2.setValor(50);

        // livro2.exibirDetalhes();

        // livro2.aplicarDesconto(0.1);

        // System.out.println(Livro.getNumLivrosCriados());

        Ebook ebook = new Ebook("Animais Fantásticos e onde habitam", "978-85-333-0227-3", autor);
    
        // ebook.exibirDetalhes();

        ebook.setValor(20);

        // ebook.aplicarDesconto(0.20); // 16

        LivroFisico livroFisico = new LivroFisico("Quadribol", "978-85-333-0227-4", autor);

        livroFisico.setValor(30);

        // livroFisico.aplicarDesconto(0.20); // ---

        // System.out.println(livroFisico.obterTaxaDeImpressao()); // 1.5

        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarLivro(livro1);
        carrinho.adicionarLivro(livro2);
        carrinho.adicionarLivro(ebook);
        carrinho.adicionarLivro(livroFisico);

        System.out.println(carrinho.getTotal());
    }
}
