package com.preemptive.dasho.anttask;

import org.apache.tools.ant.BuildException;

import java.io.File;

public final class ObfuscateTask extends DashOProJarTask
{
    private boolean a;
    private File b;
    
    public ObfuscateTask() {
        this.b = null;
    }
    
    public void setForce(final boolean a) {
        this.a = a;
    }
    
    public void setProject(final File b) {
        this.b = b;
    }
    
    @Override
    public final void b() {
        if (this.b == null) {
            throw new BuildException(com.preemptive.dasho.anttask.b.toString(970 / 147, "Rom)zycgkld1sg`g\u007fumm\u007f;un>mepwjv`b'gg*7cohzcrsgq+6cyjq <~qq&(%66$2.''j$*m\n.#9\u001ds&0'\"1+?(|<~q$.:c\",*\"h $k8%'<p'7!'<99x6<{(5;\u007fAov#mkrbo{k\u007feb`!"));
        }
        super.b();
    }
    
    @Override
    public void c() {
        super.c();
        if (this.a) {
            this.a(com.preemptive.dasho.anttask.b.toString(61 + 31, "qp802\"'"));
        }
        this.a(this.b.getAbsolutePath());
    }
}
