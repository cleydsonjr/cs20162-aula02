package br.ufg.cs.cleydsonjr;

public class CrivoDeEratostenes {

    int[] realizeCrivo(int[] a, int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido fornecido: " + n);
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException("Array inválido fornecido");
            }
        }

        for (int i = 2; i <= n / 2; i++) {
            if (a[i] == 0) {
                int c = i + i;
                while (c < n) {
                    a[c] = 1;
                    c = c + i;
                }
            }
        }

        return a;
    }
}
