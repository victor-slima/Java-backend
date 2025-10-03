package com.teste.teste.repository;

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

    /*
     * Método para aicionar um produto
     */
    public Produto adicionar(Produto produto){
        
        ultimoID += 1;

        produto.setId(ultimoID);
        produtos.add(produto); // adicionando o produto na lista
        
        return produto;
    }

    /*
     * Método que deleta um produto
     */
    public void deletar(Integer id){
        produtos.removeIf(produto -> produto.getId() == id); // remove de acordo com o filtro
    }

    /*
     * Método que atualiza um produto
     */
    public Produto atualizar(Produto produto){
        Optional<Produto> produtoEncontrado = obterporID(produto.getId());
        if (produtoEncontrado.isEmpty()){
            throw new IllegalArgumentException("Produto nao encontrado.");
        }
        //Remover o produto antifo e substituir pelo novo;
        //Encontrar o produto
        obterporID(produto.getId());

        //Removendo
        deletar(produto.getId());

        // Adicionando um novo produto no lugar do excluído:
        produtos.add(produto);


        return produto;
    }
}