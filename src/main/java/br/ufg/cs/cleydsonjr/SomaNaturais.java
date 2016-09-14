package br.ufg.cs.cleydsonjr;

public class SomaNaturais {

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
