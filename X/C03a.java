package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.multiprocess.ProfiloMultiProcessTraceServiceImpl;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* renamed from: X.03a, reason: invalid class name */
/* loaded from: 03a.class */
public abstract class C03a {
    public static void A00(Context context, String str, boolean z) {
        C03c c03c;
        synchronized (C03c.class) {
            if (C03c.A00 != null) {
                throw AnonymousClass001.A0N("MultiProcessTraceManager already initialized");
            }
            if (z) {
                new C03c() { // from class: X.03d
                    public final C03j A00;
                    public final ProfiloMultiProcessTraceServiceImpl A01;

                    /* JADX WARN: Type inference failed for: r0v4, types: [X.03j, android.content.BroadcastReceiver] */
                    {
                        ProfiloMultiProcessTraceServiceImpl profiloMultiProcessTraceServiceImpl = new ProfiloMultiProcessTraceServiceImpl();
                        this.A01 = profiloMultiProcessTraceServiceImpl;
                        ?? broadcastReceiver = new BroadcastReceiver();
                        broadcastReceiver.A00 = profiloMultiProcessTraceServiceImpl;
                        this.A00 = broadcastReceiver;
                    }

                    @Override // X.C03c
                    public C03k A00() {
                        return this.A00;
                    }

                    public void onTraceAbort(TraceContext traceContext) {
                        if ((traceContext.A02 & ExternalProviders.A06.A01) != 0) {
                            this.A01.onTraceAbort(traceContext);
                        }
                    }

                    public void onTraceStart(TraceContext traceContext) {
                        if ((traceContext.A02 & ExternalProviders.A06.A01) != 0) {
                            ProfiloMultiProcessTraceServiceImpl profiloMultiProcessTraceServiceImpl = this.A01;
                            profiloMultiProcessTraceServiceImpl.CRG(traceContext);
                            profiloMultiProcessTraceServiceImpl.CRF(traceContext);
                        }
                    }

                    public void onTraceStop(TraceContext traceContext) {
                        if ((traceContext.A02 & ExternalProviders.A06.A01) != 0) {
                            this.A01.onTraceStop(traceContext);
                        }
                    }
                };
            } else {
                new 0U0(str);
            }
            C03c.A00 = c03c;
        }
        C03k A00 = c03c.A00();
        AnonymousClass023.A03(A00, context, new IntentFilter(A00.A01()), false);
        A00.A03(context, str);
        0Gw.A00().A07.A00.add(c03c);
    }
}
