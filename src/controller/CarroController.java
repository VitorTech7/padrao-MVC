package controller;

import model.CarroModel;
import view.CarroView;

import java.util.ArrayList;
import java.util.List;

public class CarroController {
    private List<CarroModel> carroModels;
    private int proximoID;
    private CarroView carroView;

    public CarroController() {
        this.carroModels = new ArrayList<>();
        this.proximoID = 1;
        this.carroView = new CarroView();
    }

    public void adicionarCarros(String marca, String modelo, int ano) {
        CarroModel carroModel = new CarroModel(proximoID, marca, modelo, ano);
        carroModels.add(carroModel);
        proximoID++;
        carroView.imprimirMensagem("Carro adicionado com sucesso!");
    }

    public void listarCarros() {
        carroView.printarListaDeCarros(carroModels);
    }

    public CarroModel encontrarCarroPeloId(int id) {
        for (CarroModel carroModel : carroModels) {
            if (carroModel.getId() == id) {
                return carroModel;
            }
        }
        return null;
    }

    public void atualizarCarros(int id, String marca, String modelo, int ano) {
        CarroModel carroModel = encontrarCarroPeloId(id);
        if (carroModel != null) {
            carroModel.setMarca(marca);
            carroModel.setModelo(modelo);
            carroModel.setAno(ano);
            carroView.imprimirMensagem("Carro atualizado com sucesso!");
        } else {
            carroView.imprimirMensagem("Carro não encontrado. Atualização falhou.");
        }
    }

    public void deletarCarro(int id) {
        CarroModel carroModel = encontrarCarroPeloId(id);
        if (carroModel != null) {
            carroModels.remove(carroModel);
            carroView.imprimirMensagem("Carro deletado com sucesso!");
        } else {
            carroView.imprimirMensagem("Carro não encontrado. Exclusão falhou.");
        }
    }
}
