package service;

import model.Aluguel;
import model.Veiculo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class AluguelServiceTest {

    @InjectMocks
    private service.AluguelService aluguelService;

    @Mock
    private service.VeiculoService veiculoService;

    @Test
    public void testCadastrarAluguel() {

        Mockito.when(aluguelService.buscarVeiculo("1234"))
                .thenReturn(new model.Veiculo("DB0001", "Civic", "Honda"));

        Aluguel aluguel
                = aluguelService.cadastrarAluguel("DB0001","DB0001");

        Assertions.assertEquals("Civic", aluguel.getVeiculo().getModelo());
        Assertions.assertEquals(LocalDate.now(), veiculo.getDataAluguel());
        Assertions.assertEquals(LocalDate.now().plusDays(7), veiculo.getDataDevolucao());

    }

}
