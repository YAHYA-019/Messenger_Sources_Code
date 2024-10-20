package X;

import android.os.Process;

/* renamed from: X.3ff, reason: invalid class name */
/* loaded from: 3ff.class */
public final class C3ff implements Runnable {
    public static final String __redex_internal_original_name = "LithoPeriodicThreadBooster$1";
    public final /* synthetic */ C3Sv A00;

    public C3ff(C3Sv c3Sv) {
        this.A00 = c3Sv;
    }

    @Override // java.lang.Runnable
    public void run() {
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
        Process.setThreadPriority(i, this.A00.A03);
        C3Sv.A07.postDelayed(this, r0.A04);
    }
}
