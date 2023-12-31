package com.livraria.app.entidades;

import com.livraria.app.abstratas.Livro;

public class LivroFisico extends Livro {

    public LivroFisico(String nome, String isbn, Autor autor) {
        super(nome, isbn, autor);
    }

    public double obterTaxaDeImpressao() {
        return getValor() * 0.05;
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        if (porcentagem <= 0.15) {
            double desconto = getValor() * porcentagem;
            setValor(getValor() - desconto);
        } else {
            System.out.println("Desconto acima do limite de 15%!");
        }
    }

    
    
}
