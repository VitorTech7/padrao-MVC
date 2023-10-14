import controller.CarroController;
import view.CarroView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CarroController carroController = new CarroController();
        CarroView carroView = new CarroView();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            carroView.imprimirMensagem("\nSistema de gerenciamento de carros");
            carroView.imprimirMensagem("1. Adicionar Carros");
            carroView.imprimirMensagem("2. Listar Carros");
            carroView.imprimirMensagem("3. Atualizar detalhes do carro");
            carroView.imprimirMensagem("4. Deletar Carro");
            carroView.imprimirMensagem("5. Sair");
            carroView.imprimirMensagem("Pressione um número (1/2/3/4/5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    carroView.imprimirMensagem("Escolha a marca do carro: ");
                    String marca = scanner.nextLine();
                    carroView.imprimirMensagem("Escolha o modelo do carro: ");
                    String modelo = scanner.nextLine();
                    carroView.imprimirMensagem("Escolha o ano do carro: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    carroController.adicionarCarros(marca, modelo, ano);
                    break;
                case 2:
                    carroController.listarCarros();
                    break;
                case 3:
                    carroView.imprimirMensagem("Informe o ID para atualizar o carro: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();
                    carroView.imprimirMensagem("Escolha a nova marca do carro: ");
                    marca = scanner.nextLine();
                    carroView.imprimirMensagem("Escolha o novo modelo do carro: ");
                    modelo = scanner.nextLine();
                    carroView.imprimirMensagem("Escolha o novo ano do carro: ");
                    ano = scanner.nextInt();
                    scanner.nextLine();
                    carroController.atualizarCarros(idAtualizar, marca, modelo, ano);
                    break;
                case 4:
                    carroView.imprimirMensagem("Informe o ID para deletar o carro: ");
                    int idDeletar = scanner.nextInt();
                    scanner.nextLine();
                    carroController.deletarCarro(idDeletar);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    carroView.imprimirMensagem("Número inválido. Por favor, escolha os números 1, 2, 3, 4, ou 5.");
            }
        }
    }
}