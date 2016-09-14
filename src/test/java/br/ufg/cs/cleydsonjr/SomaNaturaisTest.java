package br.ufg.cs.cleydsonjr;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SomaNaturaisTest {
    private SomaNaturais somaNaturais;

    @Before
    public void setUp() {
        somaNaturais = new SomaNaturais();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void falhaAoFornecerNumeroMenorQueUm() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Número inválido fornecido: 0");

        somaNaturais.somaNaturais(0);
    }

    @Test
    public void calculaCorretamenteParaNumeroMaiorQueUm() {
        int resultado = somaNaturais.somaNaturais(25);

        assertEquals("Resultado inválido retornado para soma", 325, resultado);
    }

}