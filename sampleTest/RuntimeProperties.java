package com.preemptive.dasho.anttask;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;

public abstract class RuntimeProperties
{
    private static Properties a;
    
    public static void main(String[] args) {
        int n = 1;
        try {

           String[] array = { "C:\\Users\\Gavin\\Downloads\\PreEmptiveProtection-DashO9.0"} ;
            if (array.length >= 1) {
                final File canonicalFile = new File(array[0]).getCanonicalFile();
                if (canonicalFile.exists()) {
                    if (canonicalFile.isDirectory()) {
                        if (new File(canonicalFile, com.preemptive.dasho.anttask.a.endsWith("Wuf~XHku5v|l", 115 + 64)).canRead()) {
                            e();
                            RuntimeProperties.a.setProperty(com.preemptive.dasho.anttask.a.endsWith("gevnh&aefi", 57 * 59), canonicalFile.getPath());
                            FileOutputStream fileOutputStream = null;
                            try {
                                fileOutputStream = new FileOutputStream(new File(com.preemptive.dasho.anttask.a.endsWith("bf{ae%mcz!bd|g}xs9hkukyojver", 838 / 134)));
                                RuntimeProperties.a.store(fileOutputStream, b.toString(91 + 70, "Swmplkb(yxd|h|{yta3rzd7\\xisS=_q4a\u0016\"7.5"));
                            }
                            finally {
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            }
                            a(b.toString(40 + 32, ",(9##c& =4"), d());
                            n = 0;
                        }
                        else {
                            System.err.println(canonicalFile.getPath() + b.toString(65 + 88, "9~tyn>qou\"`kkrfag*") + com.preemptive.dasho.anttask.a.endsWith("\u00162'=\u0019\u0007*6t1=/", 122 - 8));
                        }
                    }
                    else {
                        System.err.println(canonicalFile.getPath() + b.toString(-12 + 29, "1{`4{yc8x:\u007fuo{|tnpz"));
                    }
                }
                else {
                    System.err.println(canonicalFile.getPath() + b.toString(709 / 227, "#`jct(ge\u007f,hvfce"));
                }
                RuntimeProperties.a = null;
            }
            else {
                a(com.preemptive.dasho.anttask.a.endsWith("z~3)-m,*+\"", -52 - 14), d());
                a(b.toString(125 + 33, "z~sim-bpjk^lxxeb`"), c());
                a(com.preemptive.dasho.anttask.a.endsWith(";!2*,j3#5; %%", 41 + 54), b());
                n = 0;
            }
        }
        catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        System.exit(n);
    }
    
    private static void a(final String s, final String s2) {
        System.out.print(s);
        System.out.print('=');
        System.out.println((s2 == null) ? "" : s2);
    }
    
    private static Properties a(final String s) throws IOException {
        final Properties properties = new Properties();
        final InputStream resourceAsStream = RuntimeProperties.class.getResourceAsStream(s);
        if (resourceAsStream == null) {
            throw new IOException(com.preemptive.dasho.anttask.a.endsWith("\f1?<< u0>6=z)9.1*2\"'c\",*\"h", 25 * 39) + s);
        }
        properties.load(resourceAsStream);
        return properties;
    }
    
    private static Properties e() {
        if (RuntimeProperties.a == null) {
            com.preemptive.dasho.anttask.a.endsWith("+agt`f$jby }e\u007ffzyp8gjvj~niwzs", 915 / 225);
            try {
                RuntimeProperties.a = a(b.toString(309 / 48, ")cizbd\"l`{>cg}`|{r6ihtlxlkidq"));
            }
            catch (IOException ex) {
                try {
                    RuntimeProperties.a = a(b.toString(640 / 181, ",`duog'kex#|z~e{~q;fewi\u007fiht{l.ugntigsm"));
                }
                catch (IOException ex2) {
                    throw new RuntimeException(ex);
                }
            }
        }
        return RuntimeProperties.a;
    }
    
    public static String a() {
        return e().getProperty(com.preemptive.dasho.anttask.a.endsWith("`duog'bdah", 567 / 131));
    }
    
    public static String b() {
        return e().getProperty(b.toString(1 + 20, "qwdpv4myomvoo"));
    }
    
    public static String c() {
        return e().getProperty(b.toString(37 * 39, "gevnh&o\u007fg`[k}cx}}"));
    }
    
    public static String d() {
        String s = a();
        if (b(s)) {
            s = h.a().a(com.preemptive.dasho.anttask.a.endsWith("\t\u000f\u001c\u0018\u001e\r\u001b\u001b\u0018\u0013", 27 * 55));
            if (b(s)) {
                final String lowerCase = System.getProperty(b.toString(-47 + 46, "0s/lbi`")).toLowerCase(Locale.US);
                if (lowerCase.startsWith(b.toString(3 * 61, "`qw~tkn"))) {
                    s = com.preemptive.dasho.anttask.a.endsWith("F<(X{el~lc/Vx~vg:Fe}\\wkhthz Rmoqqohfz%[~hKb`e{eq5Fewm\u007fxhtqq`lb\u0007%6.\bh", 1386 / 243) + b() + b.toString(-16 + 17, ".cst");
                }
                else if (lowerCase.startsWith(b.toString(108 - 36, "%()"))) {
                    s = b.toString(16 + 7, "8Yijwu~\u007fkinlp+UtbMdz\u007fe{k/@c}gqvb~ww:6<Y\u007fl(\u000eb") + b() + com.preemptive.dasho.anttask.a.endsWith(";wgh6Ytri{qtr-Iesg", 49 * 37);
                }
                else if (lowerCase.contains(b.toString(1322 / 227, "ks\u007f")) || lowerCase.contains(com.preemptive.dasho.anttask.a.endsWith("ko\u007f", 598 / 119)) || lowerCase.contains(b.toString(265 / 70, "bm}")) || lowerCase.contains(b.toString(116 + 1, "&#9")) || lowerCase.contains(b.toString(37 + 14, "qgq"))) {
                    s = com.preemptive.dasho.anttask.a.endsWith("\u007f>\"'{\u0005$2\u001d4*/5+;\u0000\u00103-7!&2.''\u0015\u000f->&\u0000\u000f", -57 + 9) + b().replace('.', '_') + b.toString(43 * 45, " qab");
                }
            }
        }
        return s;
    }
    
    private static boolean b(final String s) {
        return s == null || s.length() == 0;
    }
}
