package br.ufg.cs.cleydsonjr;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumeroPrimoTest {
    private NumeroPrimo numeroPrimo;

    @Before
    public void setUp() {
        numeroPrimo = new NumeroPrimo();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void falhaAoFornecerNumeroMenorQueUm() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Número inválido fornecido: 0");

        numeroPrimo.verifique(0);
    }

    @Test
    public void retornaVerdadeiroAoFornecer7() {
        boolean resultado = numeroPrimo.verifique(7);

        assertTrue("Verificação retornou um resultado inválido", resultado);
    }

    @Test
    public void retornaVerdadeiroAoFornecer23() {
        boolean resultado = numeroPrimo.verifique(23);

        assertTrue("Verificação retornou um resultado inválido", resultado);
    }

    @Test
    public void retornaFalsoAoFornecer15() {
        boolean resultado = numeroPrimo.verifique(15);

        assertFalse("Verificação retornou um resultado inválido", resultado);
    }
}