package com.preemptive.dasho.anttask;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class d
{
    public static Date a(final String s) {
        Date parse = null;
        if (!i.a(s)) {
            final ParsePosition parsePosition = new ParsePosition(0);
            parse = a().parse(s, parsePosition);
            if (parse != null && parsePosition.getIndex() != s.length()) {
                parse = null;
            }
        }
        return parse;
    }
    
    public static String a(final Date date) {
        return (date == null) ? null : a().format(date);
    }
    
    private static DateFormat a() {
        return new SimpleDateFormat(a.endsWith("LO,`a)~qps", 53 * 61));
    }
}
