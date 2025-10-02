package com.teste.teste.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.teste.model.Produto;
import com.teste.teste.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired 
    private ProdutoRepository produtoRepository;


    public List<Produto> obterTodosOsProdutos(){
        return produtoRepository.obterTodos();
    }

    public Optional<Produto> obterporID(Integer id){
        return produtoRepository.obterporID(id);

    }

    public Produto adicionar(Produto produto){
        return produtoRepository.adicionar(produto);
    }

    public void deletar(Integer id){
        produtoRepository.deletar(id);
    }

    public Produto atualizar(Integer id, Produto produto){
        // Adicionar validação no id:
        produto.setId(id);
        return produtoRepository.atualizar(produto);
    }

    // Aqui eu coloco as regras de negócio.
}
