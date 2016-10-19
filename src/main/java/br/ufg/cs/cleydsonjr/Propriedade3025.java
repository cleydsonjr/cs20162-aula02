/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr;

/**
 * Implementação para verificar se um número fornecido apresenta a propriedade 3025.
 */
public class Propriedade3025 {
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
     * Método auxiliar para verificar se um número fornecido apresenta a propriedade 3025.
     *
     * @param n O numero para se verificar
     * @return O resultado da verificação
     */
    public final boolean verifique(final int n) {
        if (n < VALOR_MINIMO || n > VALOR_MAXIMO) {
            throw new IllegalArgumentException("Número inválido fornecido: " + n);
        }
        int i = n / CENTENA;
        int j = n % CENTENA;

        int potencia = (int) Math.pow(i + j, 2);

        return potencia == n;
    }
}
