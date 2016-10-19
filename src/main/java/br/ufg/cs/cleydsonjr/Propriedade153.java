/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr;

/**
 * Implementação para verificar se um número fornecido apresenta a propriedade 153.
 */
public class Propriedade153 {
    /**
     * Valor máximo do número para se verificar.
     */
    private static final int VALOR_MAXIMO = 9999;

    /**
     * Valor mínimo do número para se verificar.
     */
    private static final int VALOR_MINIMO = 0;

    /**
     * Representação de uma centena.
     */
    private static final int CENTENA = 100;

    /**
     * Representação de uma dezena.
     */
    private static final int DEZENA = 10;

    /**
     * Representação de um cubo.
     */
    private static final int CUBO = 3;

    /**
     * Método auxiliar para verificar se um número fornecido apresenta a propriedade 153.
     *
     * @param n O numero para se verificar
     * @return O resultado da verificação
     */
    public final boolean verifique(final int n) {
        if (n < VALOR_MINIMO || n > VALOR_MAXIMO) {
            throw new IllegalArgumentException("Número inválido fornecido: " + n);
        }

        int i = n / CENTENA;
        int aux = n - CENTENA * i;
        int j = aux / DEZENA;
        int k = n % DEZENA;

        int somaDosCubos = (int) (Math.pow(i, CUBO) + Math.pow(j, CUBO) + Math.pow(k, CUBO));

        return somaDosCubos == n;
    }
}
