package tech.firas.algorithm;

public final class Exercise1_1_16 {

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
