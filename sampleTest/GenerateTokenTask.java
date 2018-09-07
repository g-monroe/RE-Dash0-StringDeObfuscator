package com.preemptive.dasho.anttask;

import org.apache.tools.ant.BuildException;

import java.io.File;
import java.util.*;

public class GenerateTokenTask extends SecondaryDashOTask
{
    private String a;
    private String b;
    private Date c;
    private Date d;
    private int e;
    private int f;
    private final List<c> g;
    
    public GenerateTokenTask() {
        super(com.preemptive.dasho.anttask.a.endsWith("\b25:.\u0006'-!7'3';", 97 - 5));
        this.g = new ArrayList<c>();
    }
    
    public void setKey(final File file) {
        this.a = ((file == null) ? null : file.getAbsolutePath());
    }
    
    public void setFile(final File file) {
        this.b = ((file == null) ? null : file.getAbsolutePath());
    }
    
    public void setDate(final String s) {
        if (i.a(s)) {
            this.c = null;
        }
        else {
            this.c = com.preemptive.dasho.anttask.d.a(s);
            if (this.c == null) {
                throw new BuildException(com.preemptive.dasho.anttask.b.toString(-17 - 37, "\u0003%:,\"&4q$28 3w>6({8<*:za") + s);
            }
        }
    }

    public void setWarningdate(final String s) {
        if (i.a(s)) {
            this.d = null;
        }
        else {
            this.d = com.preemptive.dasho.anttask.d.a(s);
            if (this.d == null) {
                throw new BuildException(com.preemptive.dasho.anttask.a.endsWith("\u001c8!953?|+?35$b%+7f0);$\"\"**.$4hs", -64 + 21) + s);
            }
        }
    }
    
    public void setPeriod(final int e) {
        this.e = e;
    }
    
    public void setWarningperiod(final int f) {
        this.f = f;
    }
    
    public c createProperty() {
        final c c = new c();
        this.g.add(c);
        return c;
    }
    
    @Override
    public void b() {
        if (this.a == null) {
            throw new BuildException(com.preemptive.dasho.anttask.a.endsWith("\f+07,( h\"/2l+'#5", 15 * 47));
        }
        if (this.b == null) {
            throw new BuildException(com.preemptive.dasho.anttask.a.endsWith("\u001e=&%>6>z=51;", 2 - 47));
        }
        if (this.c == null && this.e <= 0) {
            throw new BuildException(com.preemptive.dasho.anttask.a.endsWith("[vtigq$agsm)ey,}k}y~v3y`ec8{\u007f;om{|)'+& ", -32 + 62));
        }
        if (this.c != null && this.e > 0) {
            throw new BuildException(com.preemptive.dasho.anttask.b.toString(25 - 55, "&\"0 f&&-j;)?' 4q3!1u;\",,;70$~:xbnvwlpb"));
        }
        if (this.d != null && this.f > 0) {
            throw new BuildException(com.preemptive.dasho.anttask.a.endsWith("pi{dbbjjndt2rzq6`yktrrznzrhmg$dtb(d\u007f\u007fylbci1wkwycdqo\u007f", 9 * 15));
        }
        super.b();
    }
    
    @Override
    public void c() {
        super.c();
        this.a(com.preemptive.dasho.anttask.a.endsWith("+*cls", 543 / 81));
        this.a(this.a);
        if (this.c != null) {
            this.a(com.preemptive.dasho.anttask.b.toString(51 - 48, ".)agsm"));
            this.a(com.preemptive.dasho.anttask.d.a(this.c));
        }
        if (this.e > 0) {
            this.a(com.preemptive.dasho.anttask.a.endsWith("54j~ntq{", 64 + 88));
            this.a(Integer.toString(this.e));
        }
        if (this.d != null) {
            this.a(com.preemptive.dasho.anttask.b.toString(66 - 21, " #xqc|zzrrvl|"));
            this.a(com.preemptive.dasho.anttask.d.a(this.d));
        }
        if (this.f > 0) {
            this.a(com.preemptive.dasho.anttask.a.endsWith(".)rguf`dl|h|f\u007fu", 778 / 207));
            this.a(Integer.toString(this.f));
        }
        this.a(com.preemptive.dasho.anttask.b.toString(9 * 23, "b}7;?1"));
        this.a(this.b);
        final Properties properties = new Properties();
        final Iterator<c> iterator = this.g.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(properties);
        }
        for (final Map.Entry<Object, Object> entry : properties.entrySet()) {
            this.a(com.preemptive.dasho.anttask.b.toString(1131 / 185, "+*x{e{i\u007fzv"));
            this.a(entry.getKey() + "=" + entry.getValue());
        }
    }
}
