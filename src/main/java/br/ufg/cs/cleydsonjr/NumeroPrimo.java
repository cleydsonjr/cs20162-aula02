/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr;

/**
 * Implementação para verificar se um número fornecido é primo.
 */
public class NumeroPrimo {

    /**
     * Método auxiliar para verificar se um número fornecido é primo.
     *
     * @param n O numero para se verificar
     * @return O resultado da verificação
     */
    public final boolean verifique(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido fornecido: " + n);
        }

        boolean verificacao = true;

        for (int i = 2; i <= (n - 1); i++) {
            if (n % i == 0) {
                verificacao = false;
            }
        }

        return verificacao;
    }
}
