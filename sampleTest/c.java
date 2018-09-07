package com.preemptive.dasho.anttask;

import java.util.Properties;

public class c
{
    private String a;
    private String b;
    
    public boolean a(final Properties properties) {
        boolean b = false;
        if (this.a != null && this.a.length() != 0) {
            if (properties.containsKey(this.a)) {
                if (this.b == null) {
                    properties.remove(this.a);
                    b = true;
                }
                else if (!properties.getProperty(this.a).equals(this.b)) {
                    properties.setProperty(this.a, this.b);
                    b = true;
                }
            }
            else if (this.b != null) {
                properties.setProperty(this.a, this.b);
                b = true;
            }
        }
        return b;
    }
}
