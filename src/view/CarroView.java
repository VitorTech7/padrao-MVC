package view;


import model.CarroModel;

import java.util.List;

public class CarroView {
    public void imprimirDetalhesDoCarro(CarroModel car) {
        System.out.println("Detalhes do carro:");
        System.out.println("ID: " + car.getId());
        System.out.println("Marca: " + car.getMarca());
        System.out.println("Modelo: " + car.getModelo());
        System.out.println("Ano: " + car.getAno());
    }

    public void printarListaDeCarros(List<CarroModel> carroModels) {
        System.out.println("Lista de Carros:");
        for (CarroModel carroModel : carroModels) {
            imprimirDetalhesDoCarro(carroModel);
            System.out.println("-------------");
        }
    }

    public void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
