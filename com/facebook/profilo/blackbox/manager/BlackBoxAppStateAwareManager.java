package com.facebook.profilo.blackbox.manager;

import X.0Gw;
import X.0H4;
import X.0H9;
import X.0HB;
import X.1BQ;
import X.1Bi;
import X.1Od;
import X.C00i;
import X.C0ll;
import X.C0mc;
import com.facebook.profilo.ipc.TraceContext;

/* loaded from: BlackBoxAppStateAwareManager.class */
public final class BlackBoxAppStateAwareManager extends 0H9 {
    public final C00i A00 = new 1BQ(16520);
    public volatile TraceContext A01;
    public volatile boolean A02;

    public BlackBoxAppStateAwareManager() {
        if (0Gw.A06()) {
            this.A02 = ((1Od) 1Bi.A03(16616)).A0E();
            0H4 r0 = 0H4.A0C;
            if (r0 != null) {
                TraceContext A09 = r0.A09(C0ll.A00, 0L);
                this.A01 = A09;
                if (A09 != null && this.A02 && A09.A08.A02("trace_config.should_pause_in_background", false)) {
                    C0mc.A01().A04("BlackBoxAppStateAwareManager", "Abort as app is in background");
                    0HB.A06();
                }
            }
        }
    }

    public void BqR() {
        C0mc.A01().A04("BlackBoxAppStateAwareManager", "Start after config update");
        0HB.A09();
    }

    public void onTraceAbort(TraceContext traceContext) {
        if ((traceContext.A03 & 2) != 0) {
            this.A01 = null;
        }
    }

    public void onTraceStart(TraceContext traceContext) {
        if ((traceContext.A03 & 2) != 0) {
            this.A01 = traceContext;
            traceContext.A09.setForegroundState(!this.A02);
            if (traceContext.A08.A02("trace_config.should_pause_in_background", false) && this.A02) {
                0HB.A06();
            }
        }
    }

    public void onTraceStop(TraceContext traceContext) {
        if ((traceContext.A03 & 2) != 0) {
            this.A01 = null;
        }
    }
}
