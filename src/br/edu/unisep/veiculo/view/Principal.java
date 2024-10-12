package br.edu.unisep.veiculo.view;

import br.edu.unisep.veiculo.model.*;

public class Principal {
    private static Veiculo veiculo1;
    private static Veiculo veiculo2;
    private static Veiculo veiculo3;
    private static Veiculo veiculo4;

    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "Toyota",
                "Corolla",
                2020, 4);
        Moto moto1 = new Moto(
                "Yamaha",
                "MT-07",
                2019,
                689);
        Caminhao caminhao1 = new Caminhao(
                "Scania",
                "R450",
                2018,
                "Carga pesada");
        Frota frota = new Frota();

        frota.adicionarVeiculo(carro1);
        frota.adicionarVeiculo(moto1);
        frota.adicionarVeiculo(caminhao1);

        frota.exibirFrota();
    }
}