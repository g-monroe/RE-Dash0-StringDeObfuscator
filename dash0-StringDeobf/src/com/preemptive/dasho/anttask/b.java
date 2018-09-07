package com.preemptive.dasho.anttask;

public class b
{
    public static String toString(int n, final String s) {
        //System.out.println("\n\n\nInput: " + n + " :: " + s);
        final int n2 = 4;
        final int n3 = n2 + 1;
        final boolean b = false;
        final char[] charArray = s.toCharArray();
        final int length = charArray.length;
        final char[] array = charArray;
        int n4 = b ? 1 : 0;
        final int n5 = (n2 << n3) - 1 ^ 0x20;
        char[] array2;
        while (true) {
            array2 = array;
            if (n4 == length) {
                break;
            }
            final int n6 = n4;
            final int n7 = array2[n6] ^ (n & n5);
            ++n;
            ++n4;
            array2[n6] = (char)n7;
           // System.out.println("\nPosition: " + n6 + " :: " + (char)n7);
        }
        //System.out.println(String.valueOf(array2, 0, length).intern());
        return String.valueOf(array2, 0, length).intern();
    }
}
