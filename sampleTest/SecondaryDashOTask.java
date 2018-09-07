package com.preemptive.dasho.anttask;

import org.apache.tools.ant.types.Path;

import java.io.File;

public class SecondaryDashOTask extends DashOTask
{
    public SecondaryDashOTask(final String classname) {
        //super.a.setClassname(classname);
    }
    
    @Override
    public void a(final File location) {
        final Path classpath = new Path(this.getProject());
        classpath.setLocation(location);
        //super.a.setClasspath(classpath);
    }
}
