package br.ufg.cs.cleydsonjr;

public class Propriedade153 {

    /**
     * Método auxiliar para verificar se um número fornecido apresenta a propriedade 153
     *
     * @param n O numero para se verificar
     * @return O resultado da verificação
     */
    boolean verifique(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("Número inválido fornecido: " + n);
        }

        int i = n / 100;
        int aux = n - 100 * i;
        int j = aux / 10;
        int k = n % 10;

        int somaDosCubos = (int) (Math.pow(i, 3) + Math.pow(j, 3) + Math.pow(k, 3));

        return somaDosCubos == n;
    }
}
