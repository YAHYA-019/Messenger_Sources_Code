package com.facebook.acra.util;

import X.AnonymousClass001;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;

/* loaded from: SimpleTraceLogger.class */
public class SimpleTraceLogger {
    public static final int NO_LIMIT = 0;
    public static final String TAG = "SimpleTraceLogger";
    public Queue mTrace;
    public final int mTraceCountLimit;

    /* loaded from: SimpleTraceLogger$TraceLogLine.class */
    public class TraceLogLine {
        public final long time;
        public final String trace;

        public TraceLogLine(String str, long j) {
            this.trace = str;
            this.time = j;
        }

        public String toString() {
            return String.format(Locale.US, "[%d] %s", Long.valueOf(this.time), this.trace);
        }
    }

    public SimpleTraceLogger(int i) {
        this.mTraceCountLimit = i;
        clear();
    }

    public void append(String str) {
        synchronized (this) {
            if (this.mTraceCountLimit > 0 && this.mTrace.size() == this.mTraceCountLimit) {
                this.mTrace.remove();
            }
            this.mTrace.offer(new TraceLogLine(str, SystemClock.uptimeMillis()));
        }
    }

    public void append(String str, Object... objArr) {
        append(String.format(str, objArr));
    }

    public void clear() {
        synchronized (this) {
            this.mTrace = new LinkedList();
        }
    }

    public String toString() {
        String simpleTraceLogger;
        synchronized (this) {
            simpleTraceLogger = toString(0);
        }
        return simpleTraceLogger;
    }

    public String toString(int i) {
        String obj;
        synchronized (this) {
            StringBuilder A0k = AnonymousClass001.A0k();
            int i2 = 0;
            int max = i <= 0 ? 0 : Math.max(this.mTrace.size() - i, 0);
            for (TraceLogLine traceLogLine : this.mTrace) {
                if (i2 >= max) {
                    A0k.append(traceLogLine.toString());
                    A0k.append('\n');
                }
                i2++;
            }
            obj = A0k.toString();
        }
        return obj;
    }
}
