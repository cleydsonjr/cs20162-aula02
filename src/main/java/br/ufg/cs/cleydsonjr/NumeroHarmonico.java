package br.ufg.cs.cleydsonjr;

public class NumeroHarmonico {

    /**
     * Método auxiliar para obter o n-ésimo número harmônico
     *
     * @param n Índice final para a série harmônica
     * @return o n-ésimo número harmônico
     */
    public double nesimoHarmonico(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido fornecido: " + n);
        }
        double s = 1;
        for (int i = 2; i <= n; i++) {
            s = s + (1d / i);
        }
        return s;
    }
}
