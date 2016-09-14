package br.ufg.cs.cleydsonjr;

public class PotenciaUsandoSomas {

    /**
     * Método auxiliar para cálculo de potências usando apenas somas
     *
     * @param x Número que se deseja elevar a potência
     * @param y Grau da potência
     * @return O resultado do cálculo da potência
     */
    public int potenciaUsandoSomas(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Números informados inválidos: " + x + ", " + y);
        }
        int potencia = 1;

        ProdutoInteirosPositivos produto = new ProdutoInteirosPositivos();

        for (int i = 1; i <= y; i++) {
            potencia = produto.produtoInteirosPositivos(potencia, x);
        }

        return potencia;
    }
}
