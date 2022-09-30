package service;

import model.Aluguel;
import model.Veiculo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmprestimoService {

    private static List<Aluguel> aluguel = new ArrayList<>();

    private service.AluguelService veiculoService = new service.AluguelService();

    public Aluguel cadastrarAlguel(String modelo, String codigo) {

       model.Veiculo veiculo = veiculoService.buscarveiculo(codigo);
        if (veiculo == null) {
            return null;
        }

        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataDevolucao = dataEmprestimo.plusDays(10);

        Aluguel aluguel = new Aluguel(veiculo, dataEmprestimo, dataDevolucao);
        aluguel.add(aluguel);
        return aluguel;
    }

    public List<Aluguel> listarAluguel() {
        return aluguel;
    }

    public boolean finalizarAluguel(String cpf) {

        if (aluguel.isPresent()) {
            Aluguel emp = aluguel.get();
            aluguel.remove(emp);
            return true;
        }
        return false;
    }



}