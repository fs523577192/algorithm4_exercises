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
     * @return a real number between 0 (inclusive) and 1 (exclusive)
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
        if (n <= 0) {
            throw new IllegalArgumentException("'n' should be a positive integer, n is " + n);
        }
        return random.nextInt(n);
    }

    /**
     *
     * @param lo the lower bound (inclusive)
     * @param hi the higher bound (exclusive)
     * @return an integer between {@code lo} (inclusive) and ({@code hi} - 1) (inclusive)
     */
    public static synchronized int uniform(final int lo, final int hi) {
        if (hi <= lo) {
            throw new IllegalArgumentException("'hi' should be greater than 'lo' (hi = " + hi + ", lo = " + lo + ')');
        }
        return uniform(hi - lo) + lo;
    }

    /**
     *
     * @param lo the lower bound (inclusive)
     * @param hi the higher bound (exclusive)
     * @return an integer between {@code lo} (inclusive) and {@code hi} (exclusive)
     */
    public static synchronized double uniform(final double lo, final double hi) {
        if (hi <= lo) {
            throw new IllegalArgumentException("'hi' should be greater than 'lo' (hi = " + hi + ", lo = " + lo + ')');
        }
        return random() * (hi - lo) + lo;
    }

    /**
     *
     * @param a an array of double whose entries are all non-negative and sum to 1
     * @return i with probability a[i]
     */
    public static synchronized int discrete(final double[] a) {
        double sum = 0.0;
        for (int i = a.length; i > 0; ) {
            i -= 1;
            if (a[i] < 0) {
                throw new IllegalArgumentException("All entries in the array 'a' must not be negative, " +
                        "the index of the negative entry: " + i);
            }
            sum += a[i];
        }
        double diff = sum - 1.0;
        if (diff < -1e8 || diff > 1e8) {
            throw new IllegalArgumentException("Entries in the array 'a' must sum to 1, the actual sum is " + sum);
        }

        final double r = random();
        sum = 0.0;
        for (int i = 0; i < a.length; i += 1) {
            sum += a[i];
            if (sum >= r) {
                return i;
            }
        }
        throw new IllegalStateException();
    }

    public static void shuffle(final double[] a) {
        final int length = a.length;
        for (int i = 0; i < length; i += 1) {
            // Exchange a[i] with random element in a[i .. (length - 1)]
            int r = uniform(i, length);
            if (r != i) {
                final double temp = a[i];
                a[i] = a[r];
                a[r] = temp;
            }
        }
    }
}
