package oving6.oppgave3;
import java.util.Arrays;

public final class Matrise {
    private final double[][] m;

    Matrise(double[][] n) {
        m = new double[n.length][n[0].length];
        for (int i = 0; i < n.length; i++) {
            System.arraycopy(n[i], 0, m[i], 0, n[i].length);
        }
    }

    public static Matrise addereMatriser(Matrise a, Matrise b) {
        //Dimensjon sjekk
        if (a.m.length != b.m.length || a.m[0].length != b.m[0].length) {
            throw new IllegalArgumentException("Matrisene har ikke samme dimensjoner");
        }

        double[][] sum = new double[a.m.length][a.m[0].length];
        for (int i = 0; i < a.m.length; i++) {
            for (int j = 0; j < a.m[i].length; j++) {
                sum[i][j] = a.m[i][j] + b.m[i][j];
            }
        }

        return new Matrise(sum);
    }

    public static Matrise multiplisereMatrise(Matrise a, Matrise b) {
        //dimensjonsjekk
        if (a.m[0].length != b.m.length) {
            throw new IllegalArgumentException("Matrisene har ikke kompatible dimensjoner");
        }
        double[][] multiplisert = new double[a.m.length][b.m[0].length];
        for(int i = 0; i < a.m.length; i++){
            for(int j = 0; j < b.m[0].length; j++){
                for(int k = 0; k < a.m[0].length; k++){
                    multiplisert[i][j] += a.m[i][k] * b.m[k][j];
                }
            }
        }

        return new Matrise(multiplisert);
    }

    public static Matrise transponereMatrise(Matrise a) {
        double[][] transponert = new double[a.m[0].length][a.m.length];
        for (int i = 0; i < a.m.length; i++) {
            for (int j = 0; j < a.m[i].length; j++) {
                transponert[j][i] = a.m[i][j];
            }
        }

        return new Matrise(transponert);


    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (double[] row : m) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return sb.toString();
    }

}




