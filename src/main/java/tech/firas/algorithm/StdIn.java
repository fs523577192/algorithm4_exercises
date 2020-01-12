package tech.firas.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Scanner;

public final class StdIn {

    private static final Scanner scanner = new Scanner(System.in);

    private StdIn() {}

    /**
     *
     * @return true if no more values, false otherwise
     */
    public static boolean isEmpty() {
        return scanner.hasNext();
    }

    /**
     * read a value of type int
     * @return the int value read
     */
    public static int readInt() {
        return scanner.nextInt();
    }

    /**
     * read a value of type double
     * @return the double value read
     */
    public static double readDouble() {
        return scanner.nextDouble();
    }

    /**
     * read a value of type float
     * @return the float value read
     */
    public static float readFloat() {
        return scanner.nextFloat();
    }

    /**
     * read a value of type long
     * @return the long value read
     */
    public static long readLong() {
        return scanner.nextLong();
    }

    /**
     * read a value of type boolean
     * @return the boolean value read
     */
    public static boolean readBoolean() {
        return scanner.nextBoolean();
    }

    /**
     * read a value of type byte
     * @return the byte value read
     */
    public static byte readByte() {
        return scanner.nextByte();
    }

    /**
     *
     * @return whether there is another line in the standard input stream
     */
    public static boolean hasNextLine() {
        return scanner.hasNextLine();
    }

    /**
     * read the rest of the line (not include '\n' or '\r')
     * @return the rest of the line currently read
     */
    public static String readLine() {
        return scanner.nextLine();
    }

    /**
     * read the rest of the input stream
     */
    public static String readAll() throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final StringWriter stringWriter = new StringWriter();
        final char[] buffer = new char[2048];
        int charsRead;
        while ((charsRead = bufferedReader.read(buffer)) > 0) {
            stringWriter.write(buffer, 0, charsRead);
        }
        // We do not close the readers because we do not want to close System.in now
        return stringWriter.toString();
    }
}
