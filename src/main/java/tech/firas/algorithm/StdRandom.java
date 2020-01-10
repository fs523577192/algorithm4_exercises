package tech.firas.algorithm;

import java.util.Random;

public final class StdRandom {

    private static Random random = new Random();

    private StdRandom() {}

    /**
     * initialize
     * @param seed a double as the seed
     */
    public static synchronized void setSeed(final long seed) {
        random.setSeed(seed);
    }

    /**
     * @return a real number between 0 and 1
     */
    public static synchronized double random() {
        return random.nextDouble();
    }

    /**
     *
     * @param n a positive integer as the higher bound (exclusive)
     * @return an integer between 0 (inclusive) and (n - 1) (inclusive)
     */
    public static synchronized int uniform(final int n) {
        return random.nextInt(n);
    }

    /**
     *
     * @param lo the lower bound (inclusive)
     * @param hi the higher bound (exclusive)
     * @return an integer between {@code lo} (inclusive) and ({@code hi} - 1) (inclusive)
     */
    public static synchronized int uniform(final int lo, final int hi) {
        return random.nextInt(hi - lo) + lo;
    }
}
