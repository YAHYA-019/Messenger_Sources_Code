package X;

import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: AFl.class */
public final class AFl implements Runnable {
    public static final String __redex_internal_original_name = "MessageStreamMetadataChangeTracker$onDataRendered$1";
    public final /* synthetic */ HeterogeneousMap A00;
    public final /* synthetic */ 7GY A01;

    public AFl(HeterogeneousMap heterogeneousMap, 7GY r303) {
        this.A01 = r303;
        this.A00 = heterogeneousMap;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.1Q5, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        7GY r0 = this.A01;
        if (this.A00.A00(C9ek.A00) != null) {
            r0.A01.CZm((1Q5) new Object());
        }
    }
}
