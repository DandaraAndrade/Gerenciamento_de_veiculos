package br.edu.unisep.veiculo.model;

public class Caminhao extends Veiculo {
    private String tipoDeCarga;

    public Caminhao(String marca, String modelo, int ano, String tipoDeCarga) {
        super(marca, modelo, ano);
        this.tipoDeCarga = tipoDeCarga;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Caminhão - Marca: " + marca +
                ", Modelo: " + modelo + ", Ano: " + ano +
                ", Tipo de carga: " + tipoDeCarga);
    }
}
