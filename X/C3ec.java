package X;

import android.os.Process;

/* renamed from: X.3ec, reason: invalid class name */
/* loaded from: 3ec.class */
public final /* synthetic */ class C3ec implements Runnable {
    public static final String __redex_internal_original_name = "LithoPeriodicThreadBooster$$ExternalSyntheticLambda1";

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(C3Sv.A05, C3Sv.A06.intValue());
    }
}
