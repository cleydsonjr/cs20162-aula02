/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr;

/**
 * Auxiliar para cálculo dos primeiros números naturais sequenciais até um número inteiro positivo fornecido.
 */
public class SomaNaturais {

    /**
     * Método auxiliar para cálculo dos primeiros números naturais sequenciais até um número inteiro positivo fornecido.
     *
     * @param n Número limite para o qual se quer obter a soma. Obrigatoriamente maior que 1
     * @return A soma dos primeiros naturais.
     */
    public final int somaNaturais(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido fornecido: " + n);
        }

        int s = 1;
        for (int i = 2; i <= n; i++) {
            s = s + i;
        }

        return s;
    }
}
