package tech.firas.algorithm;

public final class Exercise1_1_3 {

    private Exercise1_1_3() {}

    /**
     * Write a program that takes 3 integer command-line arguments and prints {@code equal}
     * if all 3 are equal, and {@code not equal} otherwise.
     */
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Please input 3 integers");
            System.exit(-1);
        }

        int[] arguments = new int[] {
                Integer.parseInt(args[0]),
                Integer.parseInt(args[1]),
                Integer.parseInt(args[2])
        }; // may throw NumberFormatException if the first 3 command-line arguments are not all integers

        StdOut.println(arguments[0] == arguments[1] && arguments[1] == arguments[2] ? "equal" : "not equal");
    }
}
