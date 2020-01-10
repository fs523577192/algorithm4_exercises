package tech.firas.algorithm.chapter1;

import tech.firas.algorithm.StdOut;

public final class Exercise1_1_5 {

    private Exercise1_1_5() {}

    /**
     * Write a code fragment that prints {@code true} if the double variables {@code x} and {@code y}
     * are both strictly between 0 and 1 and {@code false} otherwise.
     */
    public static void test(final double x, final double y) {
        if (0.0 < x && x < 1.0 && 0.0< y && y < 1.0) {
            StdOut.println("true");
        } else {
            StdOut.println("false");
        }
    }
}
