package br.edu.unisep.veiculo.model;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected String placa;
    protected String cor;
    protected String tipo;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.cor = cor;
        this.tipo = tipo;
    }
    public abstract void exibirDetalhes();
}
