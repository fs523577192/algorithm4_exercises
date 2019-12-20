package tech.firas.algorithm;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import org.junit.Test;
import org.junit.Assert;

public final class Exercises1_1 {

    @Test
    public void problem1() {
        // 1.1.1. Give the value of each of the following expressions:
        Assert.assertEquals( 7, (0 + 15) / 2 ); // a. (0 + 15) / 2 = 15 / 2 = 7  (15 = 2 * 7 + 1)

        Assert.assertEquals(200.0000002, 2.0e-6 * 100000000.1, 1e-7);
        // b. 2.0e-6 * 100000000.1 = 2.0 / (10 ^ 6) * 100 000 000.1
        // 200 000 000.2 / (10 ^ 6) = 200.000 000 2

        Assert.assertTrue(true && false || true && true); // c. The priority of "&&" is higher than "||"
        // true && false || true && true = (true && false) || (true && true) = false || true = true
    }

    @Test
    public void problem2() {
        // 1.1.2. Give the type and value of each of the following expressions:
        final Object a = (1 + 2.236) / 2; // 1 and 2 are considered as int and 2.236 is considered as a double.
        // The int "1" is converted to a double before it is added with a double,
        // and the summation result will also be a double (3.236)
        // The int "2" is also converted to a double before it divide a double,
        // and the division result is a double 1.618
        Assert.assertEquals(Double.class, a.getClass());
        Assert.assertEquals(1.618, (Double) a, 1e-6);

        final Object b = 1 + 2 + 3 + 4.0; // ((1 + 2) + 3) + 4.0 = (3 + 3) + 4.0 = 6 + 4.0 = 6.0 + 4.0 = 10.0
        //                                                                 The int 6 is converted to a double
        Assert.assertEquals(Double.class, b.getClass());
        Assert.assertEquals(10.0, (Double) b, 1e-6);

        final Object c = 4.1 >= 4; // The int 4 is converted to a double 4.0 before it is compared with
        // another double 4.1, and the result of the comparison operator >= is a boolean true
        Assert.assertEquals(Boolean.class, c.getClass());
        Assert.assertTrue((Boolean) c);

        final Object d = 1 + 2 + "3"; // (1 + 2) + "3" = 3 + "3" = "3" + "3" = "33"
        // The int 3 is converted to a String before it is concatenated with another String
        // The result of the concatenation is also a String
        Assert.assertEquals(String.class, d.getClass());
        Assert.assertEquals("33", d);
    }

    @Test
    public void problem3() throws UnsupportedEncodingException {
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos, true, "UTF-8"));
        Exercise1_1_3.main(new String[] {"1", "1", "1"});
        Exercise1_1_3.main(new String[] {"1", "1", "2"});
        Exercise1_1_3.main(new String[] {"1", "2", "1"});
        Exercise1_1_3.main(new String[] {"1", "2", "2"});
        Exercise1_1_3.main(new String[] {"1", "2", "3"});
        Assert.assertEquals("equal\nnot equal\nnot equal\nnot equal\nnot equal\n",
                new String(bos.toByteArray(), StandardCharsets.UTF_8).replace("\r\n", "\n"));
    }

    @Test
    public void problem4() {
        // 1.1.4. What (if anything) is wrong with each of the following statement?
        // a. if (a > b) then c = 0;
        // "then" is not a keyword in Java

        // b. if a > b { c = 0; }
        // The condition of the if statement should be in a pair of parentheses

        int a = 1, b = 0, c;
        // c.
        if (a > b) c = 0;
        // Nothing wrong. If there is only one single statement to be executed when the if condition is met,
        // the brackets can be ignored.

        // d.
        if (a > b) c = 0; else b = 0;
        // Nothing wrong as well
    }

    @Test
    public void problem5() {

    }

    @Test
    public void problem6() {
        // 1.1.6. What does the following program print?
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g; // (original f + original g) - original g = original f
            // after the first loop (i = 0), f becomes 1 and g becomes 0
            // after the second loop (i = 1), f is still 1 and g becomes 1
            // after the third loop (i = 2), f becomes
        }
    }

    @Test
    public void problem12() throws UnsupportedEncodingException {
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos, true, "UTF-8"));

        // 1.1.12 What does the following code fragment print?
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        // Now a[0] to a[9] are 9 to 0

        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        // i from 0 to 4, a[0] to a[4] are 9 to 5, a[a[0]] is a[9] = 0, a[a[1]] is a[8] = 1, ...
        // i from 5 to 9, a[0] to a[4] have become 0 to 4, a[a[5]] is a[4] = 4, a[a[6]] is a[3] = 3, ...
        // Now a[0] to a[4] are 0 to 4 and a[5] to a[9] are 4 to 0
        for (int i = 0; i < 10; i++)
            System.out.println(i); // Notice: it prints i instead of a[i]

        Assert.assertEquals("0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n",
                new String(bos.toByteArray(), StandardCharsets.UTF_8).replace("\r\n", "\n"));
    }

    @Test
    public void problem14() {
        Assert.assertEquals(0, Exercise1_1_14.lg(1));
        Assert.assertEquals(1, Exercise1_1_14.lg(2));
        Assert.assertEquals(1, Exercise1_1_14.lg(3));
        Assert.assertEquals(2, Exercise1_1_14.lg(4));
        Assert.assertEquals(30, Exercise1_1_14.lg(0x40000000));
        Assert.assertEquals(30, Exercise1_1_14.lg(0x7FFFFFFF));
    }
}
