package com.preemptive.dasho.anttask;

import org.apache.tools.ant.*;
import org.apache.tools.ant.taskdefs.Java;
import org.apache.tools.ant.types.Commandline;
import org.apache.tools.ant.types.Environment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public abstract class BaseJavaTask extends Task
{
    public final Java a;
    private File b;
    private File c;
    private boolean d;
    private boolean e;
    private boolean f;
    private static final String g;
    private static final String h;
    
    public BaseJavaTask() {
        this.d = false;
        this.e = false;
        this.f = false;
        this.a = new Java();
        final Environment.Variable sysproperty = this.createSysproperty();
        sysproperty.setKey(BaseJavaTask.g);
        sysproperty.setValue(BaseJavaTask.h);
        this.a.addSysproperty(sysproperty);
    }
    
    public void a(final BuildException ex, final String s) {
        if (this.c == null || this.f) {
            return;
        }
        final Date date = new Date();
        try {
            final boolean exists = this.c.exists();
            final FileWriter fileWriter = new FileWriter(this.c, exists);
            final PrintWriter printWriter = new PrintWriter(fileWriter);
            if (exists) {
                printWriter.println(com.preemptive.dasho.anttask.a.endsWith("(+*", 401 / 73));
            }
            printWriter.printf(com.preemptive.dasho.anttask.b.toString(26 - 29, "\u001f+6leG{g`vsafd+cnmzbcww4qceqw};loq|erqjjb&hn)Kex-zncz211f47ym:>o=$:."), s, date);
            ex.printStackTrace(printWriter);
            printWriter.close();
            fileWriter.close();
            System.out.printf(com.preemptive.dasho.anttask.a.endsWith("]uhngA}ebx}cdb7.|ut211f47~vh;xxj~)-1ma+", 23 * 57), this.c.getCanonicalPath());
        }
        catch (IOException ex2) {
            System.out.printf(com.preemptive.dasho.anttask.b.toString(-54 - 53, "Pdewk:zlm{qdhld$GsndmOsoh~{y~|3}{pxjt{ourp?4.baa6db&"), this.c.getName());
            ex2.printStackTrace();
        }
    }
    
    public final void setDescription(final String s) {
        super.setDescription(s);
        this.a.setDescription(s);
    }
    
    public final void setLocation(final Location location) {
        super.setLocation(location);
        this.a.setLocation(location);
    }
    
    public final void setOwningTarget(final Target target) {
        super.setOwningTarget(target);
        this.a.setOwningTarget(target);
    }
    
    public final void setProject(final Project project) {
        super.setProject(project);
        this.a.setProject(project);
    }
    
    public final void setTaskName(final String s) {
        super.setTaskName(s);
        this.a.setTaskName(s);
    }
    
    public void execute() {
        this.f = true;
        this.a.execute();
    }
    
    public final void setJvm(final String jvm) {
        this.a.setJvm(jvm);
    }
    
    public final void setMaxmemory(final String maxmemory) {
        this.a.setMaxmemory(maxmemory);
    }
    
    public final void setFork(final boolean fork) {
        this.a.setFork(fork);
    }
    
    public final void setFailonerror(final boolean failonerror) {
        this.a.setFailonerror(failonerror);
    }
    
    public final void setDir(final File file) {
        this.b = file;
        this.a.setDir(file);
    }
    
    public final void setOutput(final File file) {
        if (this.c == null) {
            this.c = file;
        }
        this.a.setOutput(file);
    }
    
    public final void a() {
        if (this.c != null && !this.e && !this.d) {
            this.e = this.c.delete();
        }
    }
    
    public final void setAppend(final boolean b) {
        this.d = b;
        this.a.setAppend(b);
    }
    
    public final void setTimeout(final Long timeout) {
        this.a.setTimeout(timeout);
    }
    
    public final void setNewenvironment(final boolean newenvironment) {
        this.a.setNewenvironment(newenvironment);
    }
    
    public final void setResultProperty(final String resultProperty) {
        this.a.setResultProperty(resultProperty);
    }
    
    public final void setError(final File file) {
        this.c = file;
        this.a.setError(file);
    }
    
    public final void setOutputproperty(final String outputproperty) {
        this.a.setOutputproperty(outputproperty);
    }
    
    public final void setErrorProperty(final String errorProperty) {
        this.a.setErrorProperty(errorProperty);
    }
    
    public final Commandline.Argument createArg() {
        this.a();
        return this.a.createArg();
    }
    
    public final Commandline.Argument createJvmarg() {
        this.a();
        return this.a.createJvmarg();
    }
    
    public final Environment.Variable createEnv() {
        this.a();
        final Environment.Variable variable = new Environment.Variable();
        this.a.addEnv(variable);
        return variable;
    }
    
    public final Environment.Variable createSysproperty() {
        this.a();
        final Environment.Variable variable = new Environment.Variable();
        this.a.addSysproperty(variable);
        return variable;
    }
    public void setJar(final File jar){

    }
    public final void a(final String value) {
        this.createArg().setValue(value);
    }
    
    static {
        g = com.preemptive.dasho.anttask.a.endsWith("gevnhWyf~kd`", 142 / 38);
        h = com.preemptive.dasho.anttask.a.endsWith("Dhs", 280 / 56);
    }
}
