package com.facebook.simplejni;

import X.C0il;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: CoreFunctions.class */
public class CoreFunctions {
    static {
        C0il.A0B("simplejni");
    }

    public static String getErrorDescription(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static native void runWithClassLoader(long j, long j2);
}
