package X;

import android.os.Process;

/* renamed from: X.3fe, reason: invalid class name */
/* loaded from: 3fe.class */
public final /* synthetic */ class C3fe implements Runnable {
    public static final String __redex_internal_original_name = "LithoPeriodicThreadBooster$$ExternalSyntheticLambda0";
    public final /* synthetic */ C3Sv A00;

    @Override // java.lang.Runnable
    public final void run() {
        C3Sv c3Sv = this.A00;
        int i = C3Sv.A05;
        if (i < 0) {
            i = 5J5.A00("(ComponentLayout)");
            C3Sv.A05 = i;
            if (i < 0) {
                return;
            }
        }
        if (C3Sv.A06 == null) {
            C3Sv.A06 = Integer.valueOf(Process.getThreadPriority(i));
        }
        Process.setThreadPriority(i, c3Sv.A03);
    }
}
