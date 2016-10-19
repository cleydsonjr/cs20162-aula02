/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr;

/**
 * Obtenção do produto entre dois inteiro positivos.
 */
public class ProdutoInteirosPositivos {

    /**
     * Método auxiliar para obtenção do produto entre dois inteiro positivos.
     *
     * @param a Primeiro fator para o produto. Obrigatoriamente maior que 0.
     * @param b Segundo fator para o produto. Obrigatoriamente maior que 0.
     * @return O produto dos dois números fornecidos
     */
    public final int produtoInteirosPositivos(final int a, final int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Números informados inválidos: " + a + ", " + b);
        }

        int totalParcelas;
        if (a < b) {
            totalParcelas = a;
        } else {
            totalParcelas = b;
        }

        int parcela;
        if (a > b) {
            parcela = a;
        } else {
            parcela = b;
        }

        int s = 0;
        for (int i = 1; i <= totalParcelas; i++) {
            s = s + parcela;
        }

        return s;
    }
}
