package com.preemptive.dasho.anttask;

public class a
{
    public static String endsWith(final String s, int n) {
        final int n2 = 2;
        final int n3 = n2 + n2;
        final int n4 = n3 + 1;
        final int n5 = 0;
        final char[] charArray = s.toCharArray();
        final int length = charArray.length;
        final char[] array = charArray;
        int n6 = n5;
        final int n7 = (n3 << n4) - 1 ^ 0x20;
        char[] array2;
        while (true) {
            array2 = array;
            if (n6 == length) {
                break;
            }
            final int n8 = n6;
            final int n9 = array2[n8] ^ (n & n7);
            ++n;
            ++n6;
            array2[n8] = (char)n9;
        }
        System.out.println(String.valueOf(array2, 0, length).intern());
        return String.valueOf(array2, 0, length).intern();
    }
}
