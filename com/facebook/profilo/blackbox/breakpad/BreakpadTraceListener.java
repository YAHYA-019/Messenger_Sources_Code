package com.facebook.profilo.blackbox.breakpad;

import X.0H4;
import X.0H9;
import X.1BQ;
import X.AnonymousClass001;
import X.C00i;
import X.C0il;
import X.C0ld;
import X.C0ll;
import X.C3Sn;
import com.facebook.common.build.BuildConstants;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.io.File;
import java.io.IOException;

/* loaded from: BreakpadTraceListener.class */
public class BreakpadTraceListener extends 0H9 {
    public static boolean sInitialized;
    public final C00i mDumpTraceManager = 1BQ.A02(100231);

    public BreakpadTraceListener() {
        0H4 r0 = 0H4.A0C;
        if (r0 != null) {
            for (TraceContext traceContext : r0.A0B()) {
                if (traceContext.A01 == C0ll.A00) {
                    onTraceStart(traceContext);
                }
            }
        }
    }

    public static void ensureLibInitialized() {
        synchronized (BreakpadTraceListener.class) {
            if (!sInitialized) {
                C0il.A0B("profilo_breakpad");
                sInitialized = true;
            }
        }
    }

    public static native void nativeOnTraceStart(Buffer buffer, String str, String str2, String str3, long j, long j2, int i);

    public static native void nativeOnTraceStop();

    public void onTraceAbort(TraceContext traceContext) {
        if (traceContext.A01 == C0ll.A00) {
            ensureLibInitialized();
            nativeOnTraceStop();
        }
    }

    public void onTraceStart(TraceContext traceContext) {
        if (traceContext.A01 == C0ll.A00) {
            ensureLibInitialized();
            C3Sn c3Sn = (C3Sn) this.mDumpTraceManager.get();
            long j = traceContext.A06;
            File A00 = C3Sn.A00(c3Sn);
            if (A00 != null) {
                try {
                    StringBuilder sb = new StringBuilder(A00.getCanonicalPath());
                    sb.append(File.separatorChar);
                    sb.append(j);
                    String[] strArr = {AnonymousClass001.A0d("_tmp", sb), AnonymousClass001.A0d(".pdmp", sb)};
                    Buffer buffer = traceContext.A09;
                    String str = traceContext.A0D;
                    String str2 = strArr[0];
                    String str3 = strArr[1];
                    long j2 = traceContext.A06;
                    C0ld c0ld = traceContext.A07;
                    nativeOnTraceStart(buffer, str, str2, str3, j2, c0ld == null ? 0L : c0ld.getID(), BuildConstants.A01());
                } catch (IOException unused) {
                }
            }
        }
    }

    public void onTraceStop(TraceContext traceContext) {
        if (traceContext.A01 == C0ll.A00) {
            ensureLibInitialized();
            nativeOnTraceStop();
        }
    }
}
