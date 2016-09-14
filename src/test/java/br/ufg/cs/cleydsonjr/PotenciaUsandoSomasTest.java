package br.ufg.cs.cleydsonjr;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class PotenciaUsandoSomasTest {

    private PotenciaUsandoSomas potenciaUsandoSomas;

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Before
    public void setUp() {
        potenciaUsandoSomas = new PotenciaUsandoSomas();
    }

    @Test
    public void falhaAoFornecerOPrimeiroNumeroMenorQueZero() throws Exception {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Números informados inválidos: -1, 2");

        potenciaUsandoSomas.potenciaUsandoSomas(-1, 2);
    }

    @Test
    public void falhaAoFornecerOSegundoNumeroMenorQueZero() throws Exception {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Números informados inválidos: 2, -1");

        potenciaUsandoSomas.potenciaUsandoSomas(2, -1);
    }

    @Test
    public void calculaCorretamenteParaPrimeiroNumeroMaiorQueSegundo() {
        int resultado = potenciaUsandoSomas.potenciaUsandoSomas(2, 4);

        assertEquals("Resultado inválido retornado para a potência", 16, resultado);
    }
}