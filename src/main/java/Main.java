package main;

import model.Aluguel;
import model.Veiculo;
import service.AluguelService;
import service.VeiculoService;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VeiculoService veiculoService = new VeiculoService();
        AluguelService aluguelService = new AluguelService();

        while (true) {
            System.out.println("1) Cadastrar veiculo");
            System.out.println("2) Listagem de veiculo");
            System.out.println("3) Cadastro de aluguel");
            System.out.println("4) Listagem dos alugueis");
            System.out.println("5) Devolução do veiculo alugado");


            String opcao = scanner.nextLine();
            if (opcao.equals("1")) {
                System.out.println("Digite o Modelo do Veiculo:");
                String modelo = scanner.nextLine();

                System.out.println("Digite a marca do veiculo:");
                String marca = scanner.nextLine();

                System.out.println("Digite o código do veiculo:");
                String codigo = scanner.nextLine();


                Veiculo veiculo = veiculoService.cadastrarVeiculo(codigo, modelo, marca);
                if (veiculo != null) {
                    System.out.println("Veiculo cadastrado!!!");
                } else {
                    System.out.println("Erro ao cadastrar o veiculo!!!");
                }
            }

            if (opcao.equals("2")) {
                List<Veiculo> veiculo = veiculoService.listarVeiculo();
                veiculo.forEach(p -> System.out.println(p.getModelo() + " " + p.getCodigo()));
            }

            if (opcao.equals("4")) {
                System.out.println("Digite o codigo:");
                String codigo = scanner.nextLine();

                System.out.println("Digite o modelo:");
                String modelo = scanner.nextLine();

                System.out.println("Digite a marca:");
                String marca = scanner.nextLine();

                model.Veiculo veiculo = VeiculoService.cadastrarVeiculo(codigo, modelo, marca);
                if (veiculo != null) {
                    System.out.println("Veiculo cadastrado!!!");
                } else {
                    System.out.println("Erro ao cadastrar veiculo!!!");
                }
            }

            if (opcao.equals("5")) {
                List<Aluguel> aluguel = aluguelService.listarAluguel();
                aluguel.forEach(e -> System.out.println(e.getVeiculo().getCodigo() + " " + e.getDataAluguel() + " " + e.getDataDevolucao()));
            }

            if (opcao.equals("6")) {
                System.out.println("Digite o Código:");
                String codigo = scanner.nextLine();

                boolean funcionou = aluguelService.finalizarAluguel(codigo);
                if (funcionou) {
                    System.out.println("Aluguel finalizado!!!");
                } else {
                    System.out.println("Erro ao finalizar o aluguel!!!");
                }
            }


        }


    }

}
