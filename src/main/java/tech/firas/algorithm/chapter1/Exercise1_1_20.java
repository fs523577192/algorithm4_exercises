package tech.firas.algorithm.chapter1;

public final class Exercise1_1_20 {

    private Exercise1_1_20() {}

    /**
     * Write a recursive static method that computes the value of {@code ln(N!)}
     */
    public static double lnFactorial(int N) {
        if (N < 0) {
            throw new IllegalArgumentException(N + "! is invalid");
        }
        if (N == 0) {
            return 0; // ln(0!) = ln(1) = 0
        }
        // N >= 1
        // ln(N!) = ln(N * (N - 1)!) = ln(N) + ln((N - 1)!)
        return Math.log(N) + lnFactorial(N - 1);
    }
}
