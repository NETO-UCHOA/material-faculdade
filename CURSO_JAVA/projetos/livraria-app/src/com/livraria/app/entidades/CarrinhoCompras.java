package com.livraria.app.entidades;

import com.livraria.app.abstratas.Livro;

public class CarrinhoCompras {
    
    private double total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double adicionarLivro(Livro livro) {
        total += livro.getValor();
        return total;
    }

}
