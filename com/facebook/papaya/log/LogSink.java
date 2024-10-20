package com.facebook.papaya.log;

import X.C0il;
import java.util.Map;

/* loaded from: LogSink.class */
public abstract class LogSink {
    static {
        C0il.A0B("papaya-log");
    }

    public abstract void event(long j, long j2, long j3, int i, Map map, String str);

    public abstract void log(long j, long j2, long j3, int i, String str, int i2, String str2);
}
