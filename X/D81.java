package X;

import com.facebook.messaging.threadview.params.ThreadViewParams;

/* loaded from: D81.class */
public final class D81 implements Runnable {
    public static final String __redex_internal_original_name = "ArmadilloThreadViewLauncher$launchThreadView$1$1$onSuccess$1";
    public final /* synthetic */ 2M6 A00;
    public final /* synthetic */ ThreadViewParams A01;

    public D81(2M6 r302, ThreadViewParams threadViewParams) {
        this.A00 = r302;
        this.A01 = threadViewParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2M6 r0 = this.A00;
        2Lz.A06(r0.A00, this.A01);
    }
}
