package X;

import com.facebook.exoplayer.monitor.VpsEventCallback;

/* loaded from: Lpl.class */
public final class Lpl implements Runnable {
    public static final String __redex_internal_original_name = "UnifiedPrefetchManager$9";
    public final /* synthetic */ VpsEventCallback A00;
    public final /* synthetic */ 6Ck A01;
    public final /* synthetic */ 5Mo A02;

    public Lpl(VpsEventCallback vpsEventCallback, 6Ck r303, 5Mo r304) {
        this.A02 = r304;
        this.A01 = r303;
        this.A00 = vpsEventCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        5Mo r0 = this.A02;
        5Mo.A09(this.A00, this.A01, r0);
    }
}
