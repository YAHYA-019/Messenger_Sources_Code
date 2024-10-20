package X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;

/* renamed from: X.0lu, reason: invalid class name */
/* loaded from: 0lu.class */
public abstract class C0lu {
    public TraceContext A00;
    public String A01;
    public boolean A02;
    public int A03;
    public MultiBufferLogger A04;
    public volatile boolean A05;

    public C0lu(String str) {
        this.A01 = str;
        this.A02 = str == null;
    }

    private void A02(TraceContext traceContext) {
        int supportedProviders = getSupportedProviders() & TraceEvents.sProviders;
        int i = this.A03;
        if (i != 0) {
            int i2 = TraceEvents.sProviders & i;
            i = this.A03;
            if (i2 == i) {
                return;
            }
        }
        if (i != 0) {
            disable();
            this.A00 = null;
        }
        if (supportedProviders != 0) {
            this.A00 = traceContext;
            enable();
        }
        this.A03 = supportedProviders;
    }

    public static void A03(StringBuilder sb, int i, int i2) {
        sb.append(i);
        sb.append(',');
        sb.append(i2);
        sb.append(',');
    }

    public static boolean A04(boolean z) {
        boolean z2 = false;
        if (z) {
            z2 = true;
        }
        return z2;
    }

    public final MultiBufferLogger A05() {
        if (!this.A05) {
            synchronized (this) {
                if (!this.A05) {
                    this.A04 = new MultiBufferLogger();
                    this.A05 = true;
                }
            }
        }
        return this.A04;
    }

    public final void A06() {
        if (this.A02) {
            return;
        }
        synchronized (this) {
            if (!this.A02) {
                MultiBufferLogger A05 = A05();
                try {
                    int writeStandardEntry = A05.writeStandardEntry(6, 21, 0L, 0, 0, 0, 0L);
                    String str = this.A01;
                    A05.writeBytesEntry(0, 83, writeStandardEntry, 0Pz.A0W("ensureSoLibLoaded: ", str));
                    C0il.A0B(str);
                    this.A02 = true;
                    A05.writeStandardEntry(6, 22, 0L, 0, 0, 0, 0L);
                } catch (Throwable th) {
                    A05.writeStandardEntry(6, 22, 0L, 0, 0, 0, 0L);
                    throw th;
                }
            }
        }
    }

    public final void A07(TraceContext traceContext, 0Gw r303) {
        int i;
        int A03 = 0FI.A03(565695267);
        if (this.A03 == 0 || (traceContext.A02 & getSupportedProviders()) == 0) {
            i = 1976702663;
        } else {
            A06();
            onTraceEnded(traceContext, r303);
            A02(traceContext);
            A05().removeBuffer(traceContext.A09);
            i = -886804755;
        }
        0FI.A09(i, A03);
    }

    public final void A08(TraceContext traceContext, 0Gw r303) {
        int i;
        int A03 = 0FI.A03(-968538987);
        if ((traceContext.A02 & getSupportedProviders()) == 0) {
            i = 1275317900;
        } else {
            A05().addBuffer(traceContext.A09);
            A06();
            A02(traceContext);
            onTraceStarted(traceContext, r303);
            i = 1881992226;
        }
        0FI.A09(i, A03);
    }

    public boolean A09() {
        return false;
    }

    public abstract void disable();

    public abstract void enable();

    public abstract int getSupportedProviders();

    public abstract int getTracingProviders();

    public void onTraceEnded(TraceContext traceContext, 0Gw r303) {
        0FI.A09(1865772379, 0FI.A03(1938718220));
    }

    public void onTraceStarted(TraceContext traceContext, 0Gw r303) {
        0FI.A09(-1160728573, 0FI.A03(-1179025468));
    }
}
