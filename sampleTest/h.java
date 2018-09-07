package com.preemptive.dasho.anttask;

public class h
{
    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static h f;
    
    public static synchronized h a() {
        if (h.f == null) {
            h.f = new h();
        }
        return h.f;
    }
    
    public String a(final String s) {
        String s2 = null;
        try {
            s2 = System.getenv(s);
            if (s2 != null) {
                s2 = s2.trim();
                if (s2.length() == 0) {
                    s2 = null;
                }
            }
        }
        catch (Throwable t) {}
        return s2;
    }
    
    static {
        a = com.preemptive.dasho.anttask.b.toString(37 * 33, "*5i&('.");
        b = com.preemptive.dasho.anttask.a.endsWith("|g;`rjjstr", 27 - 8);
        d = com.preemptive.dasho.anttask.b.toString(483 / 76, "qnfme|\u007f");
        e = com.preemptive.dasho.anttask.a.endsWith("6=>~0s!z", 22 + 101);
        c = com.preemptive.dasho.anttask.a.endsWith("2&", 9 * 15);
    }
}
