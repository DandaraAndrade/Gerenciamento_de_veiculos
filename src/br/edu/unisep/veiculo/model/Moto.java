package br.edu.unisep.veiculo.model;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Moto - Marca: " + marca +
                ", Modelo: " + modelo + ", Ano: " + ano +
                ", Cilindradas: " + cilindradas + "cc");
    }
}