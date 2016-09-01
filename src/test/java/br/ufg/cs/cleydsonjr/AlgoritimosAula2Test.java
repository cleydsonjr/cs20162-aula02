package br.ufg.cs.cleydsonjr;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class AlgoritimosAula2Test {
    private AlgoritimosAula2 algoritimosAula2;

    @Before
    public void setUp() {
        algoritimosAula2 = new AlgoritimosAula2();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void falhaAoFornecerNumeroMenorQueUm() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Número inválido fornecido: 0");

        algoritimosAula2.somaNaturais(0);
    }

    @Test
    public void calculaCorretamenteParaNumeroMaiorQueUm() {
        int resultado = algoritimosAula2.somaNaturais(25);

        assertEquals("Resultado inválido retornado para soma", 325, resultado);
    }

}