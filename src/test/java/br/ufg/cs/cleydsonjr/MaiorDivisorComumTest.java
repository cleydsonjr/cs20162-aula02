package br.ufg.cs.cleydsonjr;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class MaiorDivisorComumTest {
    private MaiorDivisorComum maiorDivisorComum;

    @Before
    public void setUp() {
        maiorDivisorComum = new MaiorDivisorComum();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void falhaAoFornecerOPrimeiroTermoMenorQueOSegundo() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Primeiro termo deve ser maior que o segundo");

        maiorDivisorComum.mdc(1, 2);
    }

    @Test
    public void falhaAoFornecerOSegundoTermoMenorQueZero() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Segundo termo inválido: -2");

        maiorDivisorComum.mdc(1, -2);
    }

    @Test
    public void falhaAoFornecerOPrimeiroTermoMenorQueOSegundoUsandoSubtracoes() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Primeiro termo deve ser maior que o segundo");

        maiorDivisorComum.mdcSubTracoes(1, 2);
    }

    @Test
    public void falhaAoFornecerOSegundoTermoMenorQueZeroUsandoSubtracoes() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Segundo termo inválido: -2");

        maiorDivisorComum.mdcSubTracoes(1, -2);
    }

    @Test
    public void retornaMaiorDivisorComumCorretamente() {
        int resultado = maiorDivisorComum.mdc(81, 54);

        assertEquals("MDC retornou um resultado inválido", 27, resultado);
    }

    @Test
    public void retornaMaiorDivisorComumCorretamenteUsandoSubtracoes() {
        int resultado = maiorDivisorComum.mdcSubTracoes(81, 54);

        assertEquals("MDC retornou um resultado inválido", 27, resultado);
    }
}