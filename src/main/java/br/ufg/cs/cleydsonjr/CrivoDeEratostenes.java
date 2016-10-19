/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr;

/**
 * Implementação do algorítmo do Crivo de Erastotenes.
 */
public class CrivoDeEratostenes {

    /**
     * Método auxiliar para validar as posições do array como sendo números primos ou não.
     * Marcará a posição com valor 1 para números primos e 0 pra não primos.
     *
     * @param a O array a ser validado, inicialmente com todas as posições com valor 0
     * @param n Índice final do array a
     * @return o Array a modificado
     */
    final int[] realizeCrivo(final int[] a, final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido fornecido: " + n);
        }

        for (int i = 1; i < n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException("Array inválido fornecido");
            }
        }

        // Inicialmente assumindo todos inteiros como números primos
        for (int i = 2; i <= n; i++) {
            a[i] = 1;
        }

        // Marcando os "não primos" <= n usando o Crivo de Eratostenes
        for (int num = 2; num * num <= n; num++) {

            // Se o número atual é primo então marque seus múltiplos como "não primos"
            if (a[num] == 1) {
                for (int c = num; num * c <= n; c++) {
                    a[num * c] = 0;
                }
            }
        }

        return a;
    }
}
