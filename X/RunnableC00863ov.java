package X;

import com.facebook.location.foreground.ForegroundLocationFrameworkController;

/* renamed from: X.3ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ov.class */
public final class RunnableC00863ov implements Runnable {
    public static final String __redex_internal_original_name = "ForegroundLocationFrameworkController$onPause$1";
    public final /* synthetic */ ForegroundLocationFrameworkController A00;

    public RunnableC00863ov(ForegroundLocationFrameworkController foregroundLocationFrameworkController) {
        this.A00 = foregroundLocationFrameworkController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ForegroundLocationFrameworkController foregroundLocationFrameworkController = this.A00;
        if (((1Od) foregroundLocationFrameworkController.A0B.A00.get()).A0F()) {
            return;
        }
        0fH.A0j("ForegroundLocationFrameworkController", "calling onAppBackground: LifetimeActivityListener");
        ForegroundLocationFrameworkController.A05(foregroundLocationFrameworkController);
    }
}
