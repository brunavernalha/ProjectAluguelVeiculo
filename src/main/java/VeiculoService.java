package service;

import model.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LivroService {

    private static List<model.Livro> Veiculo = new ArrayList<>();

    public model.Livro cadastrarVeiculo(String nome, String autor, String codigo) {
        if (nome == null || nome.isEmpty()) {
            return null;
        }
        if (autor == null || autor.isEmpty()) {
            return null;
        }
        if (codigo == null || codigo.isEmpty()) {
            return null;
        }
        model.Veiculo veiculo = new model.Veiculo(codigo, nome, autor);
        veiculo.add(veiculo);
        return veiculo;
    }

    public List<model.Veiculo> listarVeiculo() {
        return veiculo;
    }

    public model.Livro buscarVeiculo(String codigo) {
        Optional<model.Veiculo> livro = veiculo
                .stream()
                .filter(l -> l.getCodigo().equals(codigo))
                .findFirst();
        if (livro.isPresent()) {
            return veiculo.get();
        }
        return null;
    }

}