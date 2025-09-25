package com.teste.teste.repository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.teste.teste.model.Produto;

@Repository
public class ProdutoRepository {
    
    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoID = 0;

    /*
     * Método que retorna uma lista com todos os produtos.
     */
    public List<Produto> obterTodos(){
        return produtos;
    }

    /*
     * Método que retorna um produto pelo ID
     */
    public Optional<Produto> obterporID(Integer id){
        return produtos.stream()
        .filter(produto -> produto.getId() == id)
        .findFirst();

    }



}