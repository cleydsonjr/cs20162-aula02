package br.ufg.cs.cleydsonjr;

public class SomaNaturais {

    /**
     * Método auxiliar para cálculo dos primeiros números naturais sequenciais até um número inteiro positivo fornecido
     *
     * @param n Número limite para o qual se quer obter a soma. Obrigatoriamente maior que 1
     * @return A soma dos primeiros naturais.
     */
    public int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido fornecido: " + n);
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }
}
