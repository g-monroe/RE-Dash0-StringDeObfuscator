package com.preemptive.dasho.anttask;

import java.util.HashMap;

public abstract class e
{
    public static final int a;
    public static final e[] b;
    public static final HashMap<String, e> c;
    public final String d;
    public final String e;
    public final int f;
    
    public static e a(final String s) {
        return com.preemptive.dasho.anttask.e.c.get(s);
    }
    
    public e(final String d, final String e, final int f) {
        this.d = d;
        this.f = f;
        this.e = e;
    }
    
    public final String a() {
        return this.d;
    }
    
    public abstract String b();
    
    public abstract int b(final String p0);
    
    static {
        c = new HashMap<String, e>();
        com.preemptive.dasho.anttask.e.b[3] = new f(com.preemptive.dasho.anttask.b.toString(45 * 47, "suwus}\u007f}su\f\f\f\u0014\u0014\u0014"));
        com.preemptive.dasho.anttask.e.b[4] = new g(4);
        a = com.preemptive.dasho.anttask.e.b.length - 1;
        for (final e e : com.preemptive.dasho.anttask.e.b) {
            e.c.put(e.a(), e);
        }
    }
}
