package tech.firas.algorithm;

public final class StdOut {

    private StdOut() {}

    public static void print(final String s) {
        System.out.print(s);
    }

    /**
     * print a new line
     */
    public static void println() {
        System.out.println();
    }

    public static void println(final char c) {
        System.out.println(c);
    }

    public static void println(final int n) {
        System.out.println(n);
    }

    public static void println(final double d) {
        System.out.println(d);
    }

    public static void println(final boolean b) {
        System.out.println(b);
    }

    /**
     * print {@code str}, followed by a new line
     */
    public static void println(final String str) {
        System.out.println(str);
    }

    /**
     * formatted print
     * @param format the specified output format
     * @param args the arguments to output
     */
    public static void printf(final String format, final Object... args) {
        System.out.printf(format, args);
    }
}
