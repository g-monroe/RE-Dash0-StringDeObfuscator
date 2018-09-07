package com.preemptive.dasho.anttask;

public final class f extends e
{
    private String a;
    private int b;
    private int[] c;
    
    public f(final String s, final String s2, final int n, final String a) {
        super(s, s2, n);
        this.c = new int[256];
        this.a = a;
        this.b = (int)Math.ceil(Math.log(a.length()) / Math.log(2.0));
        for (int i = 0; i < a.length(); ++i) {
            this.c[a.charAt(i)] = i;
        }
    }
    
    @Override
    public String b() {
        return this.a;
    }
    
    @Override
    public int b(final String s) {
        for (int length = s.length(), i = 0; i < length; ++i) {
            if (this.a.indexOf(s.charAt(i)) == -1) {
                return i;
            }
        }
        return -1;
    }
}
