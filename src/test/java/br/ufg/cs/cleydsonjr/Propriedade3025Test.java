package br.ufg.cs.cleydsonjr;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Propriedade3025Test {
    private Propriedade3025 propriedade3025;

    @Before
    public void setUp() {
        propriedade3025 = new Propriedade3025();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void falhaAoFornecerNumeroMenorQueZero() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Número inválido fornecido: -50");

        propriedade3025.verifique(-50);
    }

    @Test
    public void falhaAoFornecerNumeroMaiorQue9999() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Número inválido fornecido: 10000");

        propriedade3025.verifique(10000);
    }

    @Test
    public void retornaVerdadeiroAoFornecer3025() {
        boolean resultado = propriedade3025.verifique(3025);

        assertTrue("Verificação retornou um resultado inválido", resultado);
    }

    @Test
    public void retornaVerdadeiroAoFornecer0001() {
        boolean resultado = propriedade3025.verifique(1);

        assertTrue("Verificação retornou um resultado inválido", resultado);
    }

    @Test
    public void retornaFalsoAoFornecer25() {
        boolean resultado = propriedade3025.verifique(25);

        assertFalse("Verificação retornou um resultado inválido", resultado);
    }
}