/*
 * Copyright (c) 2016. Cleydson José de Figueiredo Júnior
 * Creative Commons Attribution 4.0 International License.
 */
package br.ufg.cs.cleydsonjr;

/**
 * Implementação para calcular o maior divisor comum.
 */
public class MaiorDivisorComum {

    /**
     * Método auxiliar usado para calcular o maior divisor comum de dois números fornecidos.
     * Exige que o segundo termo seja maior que o primeiro.
     *
     * @param a Primeiro termo
     * @param b Segundo termo
     * @return o valor do maior divisor comum
     */
    public final int mdc(final int a, final int b) {
        valideTermos(a, b);
        int na = a;
        int nb = b;

        while (nb != 0) {
            int m = na % nb;
            na = nb;
            nb = m;
        }

        return na;
    }

    /**
     * Método auxiliar usado para calcular o maior divisor comum de dois números fornecidos, usando subtrações.
     * Exige que o segundo termo seja maior que o primeiro.
     *
     * @param a Primeiro termo
     * @param b Segundo termo
     * @return o valor do maior divisor comum
     * @see MaiorDivisorComum#mdc(int, int)
     */
    public final int mdcSubTracoes(final int a, final int b) {
        valideTermos(a, b);
        int na = a;
        int nb = b;

        while (na != nb) {
            if (na > nb) {
                na -= nb;
            } else {
                nb -= na;
            }
        }
        return na;
    }

    /**
     * Validação dos números.
     *
     * @param a Primeiro termo
     * @param b Segundo termo
     */
    private void valideTermos(final int a, final int b) {
        if (a < b) {
            throw new IllegalArgumentException("Primeiro termo deve ser maior que o segundo");
        }

        if (b < 0) {
            throw new IllegalArgumentException("Segundo termo inválido: " + b);
        }
    }
}
