package br.ufg.cs.cleydsonjr;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class NumeroHarmonicoTest {
    private NumeroHarmonico numeroHarmonico;

    @Before
    public void setUp() {
        numeroHarmonico = new NumeroHarmonico();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void falhaAoFornecerNumeroMenorQueUm() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Número inválido fornecido: 0");

        numeroHarmonico.nesimoHarmonico(0);
    }

    @Test
    public void calculaCorretamenteParaNumeroMaiorQueUm() {
        double resultado = numeroHarmonico.nesimoHarmonico(10);

        assertEquals("Resultado inválido retornado", 2.9289682539682538, resultado, 0);
    }

}