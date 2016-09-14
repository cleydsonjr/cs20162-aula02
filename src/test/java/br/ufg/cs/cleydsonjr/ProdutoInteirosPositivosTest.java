package br.ufg.cs.cleydsonjr;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ProdutoInteirosPositivosTest {
    private ProdutoInteirosPositivos produtoInteirosPositivos;
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Before
    public void setUp() {
        produtoInteirosPositivos = new ProdutoInteirosPositivos();
    }

    @Test
    public void falhaAoFornecerOPrimeiroNumeroMenorQueZero() throws Exception {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Números informados inválidos: -1, 2");

        produtoInteirosPositivos.produtoInteirosPositivos(-1, 2);
    }

    @Test
    public void falhaAoFornecerOSegundoNumeroMenorQueZero() throws Exception {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Números informados inválidos: 2, -1");

        produtoInteirosPositivos.produtoInteirosPositivos(2, -1);
    }

    @Test
    public void calculaCorretamenteParaPrimeiroNumeroMaiorQueSegundo() {
        int resultado = produtoInteirosPositivos.produtoInteirosPositivos(10, 5);

        assertEquals("Resultado inválido retornado para o produto", 50, resultado);
    }

    @Test
    public void calculaCorretamenteParaPrimeiroNumeroMenorQueSegundo() {
        int resultado = produtoInteirosPositivos.produtoInteirosPositivos(3, 20);

        assertEquals("Resultado inválido retornado para o produto", 60, resultado);
    }

    @Test
    public void calculaCorretamenteParaDoisNumeroIguais() {
        int resultado = produtoInteirosPositivos.produtoInteirosPositivos(8, 8);

        assertEquals("Resultado inválido retornado para o produto", 64, resultado);
    }
}