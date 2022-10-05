package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VeiculoTest {

    @Test
    public void testConstrutorVeiculo() {

        model.Veiculo veiculo = new model.Veiculo("DB0001", "Civic", "Honda");

        Assertions.assertEquals("Civic", veiculo.getModelo());
        Assertions.assertEquals("Honda", veiculo.getMarca());
        Assertions.assertEquals("DB0001", veiculo.getCodigo());

    }

}
