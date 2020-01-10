package tech.firas.algorithm.chapter1;

public final class Exercise1_1_16 {

    /*
     * Give the value of exR1(6)
     *
     * exR1(6) = exR1(3) + 6 + exR1(4) + 6
     *         = ( exR1(0) + 3 + exR1(1) + 3 ) + 6 + ( exR1(1) + 4 + exR1(2) + 4 ) + 6
     *         = ( "" + 3 + exR1(1) + 3 ) + 6 + ( exR1(1) + 4 + exR1(2) + 4 ) + 6
     * exR1(1) = exR1(-2) + 1 + exR1(-1) + 1
     *         = "" + 1 + "" + 1
     *         = "11"
     * exR1(2) = exR1(-1) + 2 + exR1(0) + 2
     *         = "" + 2 + "" + 2
     *         = "22"
     * exR1(6) = ( "" + 3 + exR1(1) + 3 ) + 6 + ( exR1(1) + 4 + exR1(2) + 4 ) + 6
     *         = ( "" + 3 + "11" + 3 ) + 6 + ( "11" + 4 + "22" + 4 ) + 6
     *         = "311361142246"
     */
    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
