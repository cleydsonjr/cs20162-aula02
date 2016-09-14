package br.ufg.cs.cleydsonjr;

public class Propriedade3025 {

    /**
     * Método auxiliar para verificar se um número fornecido apresenta a propriedade 3025
     *
     * @param n O numero para se verificar
     * @return O resultado da verificação
     */
    boolean verifique(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("Número inválido fornecido: " + n);
        }
        int i = n / 100;
        int j = n % 100;

        int potencia = (int) Math.pow(i + j, 2);

        return potencia == n;
    }
}
