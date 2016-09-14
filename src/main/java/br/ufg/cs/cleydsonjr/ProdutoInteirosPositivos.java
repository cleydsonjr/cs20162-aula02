package br.ufg.cs.cleydsonjr;

public class ProdutoInteirosPositivos {

    public int produtoInteirosPositivos(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Números informados inválidos: " + a + ", " + b);
        }

        int totalParcelas = a < b ? a : b;
        int parcela = a > b ? a : b;

        int s = 0;
        for (int i = 1; i <= totalParcelas; i++) {
            s = s + parcela;
        }

        return s;
    }
}
