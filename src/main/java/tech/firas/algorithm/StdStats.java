package tech.firas.algorithm;

public final class StdStats {

    private StdStats() {}

    public static double max(final double[] a) {
        double result = a[0];
        for (int i = 1; i < a.length; i += 1) {
            if (a[i] > result) {
                result = a[i];
            }
        }
        return result;
    }

    public static double min(final double[] a) {
        double result = a[0];
        for (int i = 1; i < a.length; i += 1) {
            if (a[i] < result) {
                result = a[i];
            }
        }
        return result;
    }

    /**
     * @param a an array of double
     * @return the average of the input array
     */
    public static double mean(final double[] a) {
        double sum = a[0];
        for (int i = 1; i < a.length; i += 1) {
            sum += a[i];
        }
        return sum / a.length;
    }
}
