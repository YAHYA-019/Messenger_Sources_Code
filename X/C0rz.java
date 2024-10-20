package X;

import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextLifecycleCallbacks;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;

/* renamed from: X.0rz, reason: invalid class name */
/* loaded from: 0rz.class */
public final class C0rz extends C0lu implements ReqContextLifecycleCallbacks, C0jx {
    public static final int A00 = ProvidersRegistry.A00.A02("frameworks");
    public static final C0rz A01 = new C0lu(null);

    public C0rz() {
        super(null);
    }

    @Override // X.C0jx
    public C0jw BGo() {
        return TraceEvents.isEnabled(A00) ? C0jw.FINE : C0jw.NONE;
    }

    @Override // X.C0lu
    public void disable() {
        0FI.A09(1367702729, 0FI.A03(490300291));
    }

    @Override // X.C0lu
    public void enable() {
        0FI.A09(-121883827, 0FI.A03(-369493429));
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return A00;
    }

    @Override // X.C0lu
    public int getTracingProviders() {
        return A00 & TraceEvents.sProviders;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x009f, code lost:
    
        if (r313 != null) goto L11;
     */
    @Override // com.facebook.fury.context.ReqContextLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivate(com.facebook.fury.context.ReqContext r302) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0rz.onActivate(com.facebook.fury.context.ReqContext):void");
    }

    @Override // com.facebook.fury.context.ReqContextLifecycleCallbacks
    public void onDeactivate(ReqContext reqContext) {
        A05().writeStandardEntry(7, 22, 0L, 0, 0, 0, 0L);
    }
}
