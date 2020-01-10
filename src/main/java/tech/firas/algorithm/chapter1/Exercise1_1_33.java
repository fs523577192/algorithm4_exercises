package tech.firas.algorithm.chapter1;

public final class Exercise1_1_33 {

    private Exercise1_1_33() {}

    public static final class Matrix {
        public static double dot(final double[] x, final double[] y) {
            if (x == null || y == null || x.length <= 0 || y.length <= 0) {
                throw new IllegalArgumentException("Empty input");
            }
            if (x.length != y.length) {
                throw new IllegalArgumentException("The length of the two input vectors are different");
            }
            double sum = 0.0;
            for (int i = x.length; i > 0; ) {
                i -= 1;
                sum += x[i] * y[i];
            }
            return sum;
        }

        public static double[][] transpose(final double[][] matrix) {
            if (matrix == null || matrix.length <= 0 || matrix[0].length <= 0) {
                throw new IllegalArgumentException("Empty input");
            }
            final double[][] result = new double[matrix[0].length][matrix.length];
            for (int i = matrix.length; i > 0; ) {
                final double[] row = matrix[--i];
                for (int j = row.length; j > 0; ) {
                    j -= 1;
                    result[j][i] = row[j];
                }
            }
            return result;
        }
    }
}
