package br.ufg.cs.cleydsonjr;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Propriedade153Test {
    private Propriedade153 propriedade153;

    @Before
    public void setUp() {
        propriedade153 = new Propriedade153();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void falhaAoFornecerNumeroMenorQueZero() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Número inválido fornecido: -50");

        propriedade153.verifique(-50);
    }

    @Test
    public void falhaAoFornecerNumeroMaiorQue9999() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Número inválido fornecido: 10000");

        propriedade153.verifique(10000);
    }

    @Test
    public void retornaVerdadeiroAoFornecer153() {
        boolean resultado = propriedade153.verifique(153);

        assertTrue("Verificação retornou um resultado inválido", resultado);
    }

    @Test
    public void retornaFalsoAoFornecer25() {
        boolean resultado = propriedade153.verifique(25);

        assertFalse("Verificação retornou um resultado inválido", resultado);
    }
}