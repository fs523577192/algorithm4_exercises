package tech.firas.algorithm.chapter1;

public final class Exercise1_1_14 {

    private Exercise1_1_14() {}

    /**
     * Write a static method lg() that takes an {@code int} value {@code N} as arugment and
     * returns the largest int not larger than the base-2 logarithm of N.
     * <b>Do not use </b>{@link Math}.
     */
    public static int lg(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("log(" + N + ") is invalid");
        }
        int result = 0;
        while (N > 1) {
            N >>>= 1;
            result += 1;
        }
        return result;
    }
}
