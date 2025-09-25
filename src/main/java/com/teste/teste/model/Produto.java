package com.teste.teste.model;

public class Produto {
    
    //#region Atributos
    private Integer id;
    private String nomeProduto;
    private Integer quantidade;
    private double valor;
    private String observacao;
    //#endregion

    //#region GETTERS e SETTERS
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        if (valor < 0){
            this.valor = valor;
        }
        else {
            throw new IllegalArgumentException("Valor zero ou menor que zero não é permitido.");
        }
    }
    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    //#endregion
    

    
}