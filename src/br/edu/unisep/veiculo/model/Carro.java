package br.edu.unisep.veiculo.model;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro - Marca: "
                + marca + ", Modelo: " + modelo + ", " +
                "Ano: " + ano + ", Portas: " + numeroDePortas);
    }
}

