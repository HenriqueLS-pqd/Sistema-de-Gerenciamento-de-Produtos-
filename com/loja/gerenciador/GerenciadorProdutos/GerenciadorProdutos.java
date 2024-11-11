package com.loja.gerenciador.GerenciadorProdutos;

import com.loja.modelo.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos extends Produto {

    private ArrayList<Produto> produtos;
    private int proximoId;

    public GerenciadorProdutos(String nome, double preco, int quantidadeEstoque, String categoria, ArrayList<Produto> produtos,int proximoId) {
        super(nome, preco, quantidadeEstoque, categoria);
        this.produtos = new ArrayList<>();
        this.proximoId = 1;
    }

    public void criar(Produto produto){

    }
}
