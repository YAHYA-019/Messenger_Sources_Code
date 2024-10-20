package X;

import com.facebook.profilo.ipc.TraceContext;

/* renamed from: X.0lq, reason: invalid class name */
/* loaded from: 0lq.class */
public abstract class C0lq {
    public static void A00(0H4 r301) {
        for (TraceContext traceContext : r301.A0B()) {
            if ((traceContext.A03 & 2) == 0) {
                0H4.A07(r301, traceContext.A0B, traceContext.A01, 0, 5, traceContext.A05);
            }
        }
    }
}
