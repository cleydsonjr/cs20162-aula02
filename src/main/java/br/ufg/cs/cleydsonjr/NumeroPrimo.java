package br.ufg.cs.cleydsonjr;

public class NumeroPrimo {

    /**
     * Método auxiliar para verificar se um número fornecido é primo
     *
     * @param n O numero para se verificar
     * @return O resultado da verificação
     */
    boolean verifique(int n) {
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
