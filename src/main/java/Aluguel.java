package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluguel {

    private model.Veiculo veiculo;
    private LocalDate dataAluguel;
    private LocalDate dataDevolucao;

}
