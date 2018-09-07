package com.preemptive.dasho.anttask;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;

import java.io.File;

public abstract class DashOTask extends BaseJavaTask
{
    public boolean a;
    private boolean b;
    private boolean c;
    private String d;
    private String e;
    private String f;
    
    public DashOTask() {
        this.setFailonerror(true);
    }
    
    public final void setVerbose(final boolean a) {
        this.a = a;
    }
    
    public final void setQuiet(final boolean b) {
        this.b = b;
    }
    
    public final void setPrintstacktraces(final boolean c) {
        this.c = c;
    }
    
    public void setDashOHome(final String d) {
        this.d = d;
    }
    
    private void d() {
        if (i.a(this.d)) {
            this.d = this.getProject().getProperty(com.preemptive.dasho.anttask.a.endsWith("bf{ae%dbcj", 1670 / 254));
            if (i.a(this.d)) {
                this.d = RuntimeProperties.d();
            }
        }
        if (i.a(this.d)) {
            throw new BuildException(com.preemptive.dasho.anttask.b.toString(25 * 49, "\u0019&.->+o#!70=3/w/1?)9}\u001a>3)\rc-6f.&:>* !++"));
        }
        final File absoluteFile = new File(this.d, com.preemptive.dasho.anttask.a.endsWith("X|mw\u000f\u00110,j/'5", -12 - 56)).getAbsoluteFile();
        if (!absoluteFile.exists()) {
            throw new BuildException(com.preemptive.dasho.anttask.b.toString(-6 + 16, "Ijbca{0w{}p5") + absoluteFile.getPath());
        }
        if (!absoluteFile.canRead()) {
            throw new BuildException(com.preemptive.dasho.anttask.a.endsWith("Gdhig}*jonk|c1", 776 / 180) + absoluteFile.getPath());
        }
        try {
            this.a(absoluteFile);
        }
        catch (Exception ex) {
            throw new BuildException((Throwable)ex);
        }
    }
    
    public abstract void a(final File p0);
    
    @Override
    public final void execute() {
        final Project project = this.getProject();
        try {
            final boolean b = i.a(this.e) || project.getProperty(project.replaceProperties(this.e)) != null;
            final boolean b2 = i.a(this.f) || project.getProperty(project.replaceProperties(this.f)) == null;
            if (b && b2) {
                this.b();
            }
            else {
                project.log((Task)this, com.preemptive.dasho.anttask.b.toString(21 * 53, "\n12,-;;`#' %05\"h98$<(<;)qu") + (b ? project.replaceProperties(this.e) : project.replaceProperties(this.f)) + "'" + (b ? "" : com.preemptive.dasho.anttask.a.endsWith("%hh|", 28 - 23)) + com.preemptive.dasho.anttask.b.toString(15 * 59, "u%2,w"), 3);
            }
        }
        catch (BuildException ex) {
            this.a(ex, project.getElementName((Object)this));
            throw ex;
        }
    }
    
    public void b() {
        this.setFork(true);
        this.d();
        this.c();
        super.execute();
    }
    
    public void c() {
        if (this.a) {
            this.a(com.preemptive.dasho.anttask.a.endsWith(")(pbzkexi", 1140 / 252));
        }
        if (this.b) {
            this.a(com.preemptive.dasho.anttask.b.toString(848 / 206, ")(wral~"));
        }
        if (this.c) {
            this.a(com.preemptive.dasho.anttask.b.toString(51 - 46, "(+wz`d\u007f_yol{E`rwpe"));
        }
    }
    public void setJar(final File jar){

    }
    public void setIf(final String e) {
        this.e = e;
    }
    
    public void setUnless(final String f) {
        this.f = f;
    }
}
