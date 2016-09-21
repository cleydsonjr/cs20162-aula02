package br.ufg.cs.cleydsonjr;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class CrivoDeEratostenesTest {

    private CrivoDeEratostenes eratostenes;

    @Before
    public void setUp() {
        eratostenes = new CrivoDeEratostenes();
    }

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void falhaAoFornecerNumeroMenorQueUm() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Número inválido fornecido: 0");

        int n = 50;
        int[] a = new int[n];
        eratostenes.realizeCrivo(a, 0);
    }

    @Test
    public void falhaAoFornecerListaInvalida() {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Array inválido fornecido");

        int n = 7;
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        eratostenes.realizeCrivo(a, n);
    }

    @Test
    public void crivoRealizadoComSucesso() {
        int n = 8;
        int[] a = new int[9];
        // Array representando os números [0,1,2,3,4,5,6,7,8]
        int[] esperado = new int[]{0, 0, 1, 1, 0, 1, 0, 1, 0};

        int[] resultado = eratostenes.realizeCrivo(a, n);
        assertArrayEquals(esperado, resultado);
    }
}