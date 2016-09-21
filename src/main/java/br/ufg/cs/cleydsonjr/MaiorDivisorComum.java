package br.ufg.cs.cleydsonjr;

public class MaiorDivisorComum {

    /**
     * Método auxiliar usado para calcular o maior divisor comum de dois números fornecidos
     * Exige que o segundo termo seja maior que o primeiro.
     *
     * @param a Primeiro termo
     * @param b Segundo termo
     * @return o valor do maior divisor comum
     */
    public int mdc(int a, int b) {
        valideTermos(a, b);

        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }

        return a;
    }

    /**
     * Método auxiliar usado para calcular o maior divisor comum de dois números fornecidos, usando subtrações
     * Exige que o segundo termo seja maior que o primeiro.
     *
     * @param a Primeiro termo
     * @param b Segundo termo
     * @return o valor do maior divisor comum
     * @see MaiorDivisorComum#mdc(int, int)
     */
    public int mdcSubTracoes(int a, int b) {
        valideTermos(a, b);

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    private void valideTermos(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("Primeiro termo deve ser maior que o segundo");
        }

        if (b < 0) {
            throw new IllegalArgumentException("Segundo termo inválido: " + b);
        }
    }
}
