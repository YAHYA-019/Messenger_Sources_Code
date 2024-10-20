package X;

import com.facebook.profilo.ipc.TraceContext;

/* renamed from: X.0T5, reason: invalid class name */
/* loaded from: 0T5.class */
public abstract class C0T5 extends C0lu {
    public void A0A(TraceContext traceContext, 0Gw r303) {
    }

    @Override // X.C0lu
    public void disable() {
        0FI.A09(-1885709404, 0FI.A03(-507039351));
    }

    @Override // X.C0lu
    public void enable() {
        0FI.A09(286608778, 0FI.A03(1361811259));
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return -1;
    }

    @Override // X.C0lu
    public int getTracingProviders() {
        return 0;
    }

    public void logOnTraceEnd(TraceContext traceContext, 0Gw r303) {
    }

    @Override // X.C0lu
    public void onTraceEnded(TraceContext traceContext, 0Gw r303) {
        int i;
        int A03 = 0FI.A03(1828791527);
        if (traceContext.A00 == 2) {
            i = -1558000179;
        } else {
            logOnTraceEnd(traceContext, r303);
            i = -1998389700;
        }
        0FI.A09(i, A03);
    }

    @Override // X.C0lu
    public void onTraceStarted(TraceContext traceContext, 0Gw r303) {
        int A03 = 0FI.A03(202722663);
        A0A(traceContext, r303);
        0FI.A09(355906801, A03);
    }
}
