package com.facebook.papaya.log;

import X.C0il;

/* loaded from: Log.class */
public class Log {
    static {
        C0il.A0B("papaya-log");
    }

    public static native void nativeAddLogSink(String str, int i, LogSink logSink);

    public static native void nativeRemoveLogSink(String str);
}
