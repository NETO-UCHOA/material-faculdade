package com.livraria.app.entidades;

import com.livraria.app.abstratas.Livro;

public class Ebook extends Livro {

    private String assinatura;

    public Ebook(String nome, String isbn, Autor autor) {
        super(nome, isbn, autor);
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        if (porcentagem <= 0.10) {
            double desconto = getValor() * porcentagem;
            setValor(getValor() - desconto);
        } else {
            System.out.println("Desconto acima do limite de 15%!");
        }
    }

}
