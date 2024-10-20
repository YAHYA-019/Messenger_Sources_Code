package X;

import com.facebook.messaging.screentime.M4AScreenTimeSyncAppJob;

/* renamed from: X.548, reason: invalid class name */
/* loaded from: 548.class */
public final class AnonymousClass548 implements Runnable {
    public static final String __redex_internal_original_name = "ScreenTimeAppJob$onResume$1";
    public final /* synthetic */ M4AScreenTimeSyncAppJob A00;

    public AnonymousClass548(M4AScreenTimeSyncAppJob m4AScreenTimeSyncAppJob) {
        this.A00 = m4AScreenTimeSyncAppJob;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M4AScreenTimeSyncAppJob m4AScreenTimeSyncAppJob = this.A00;
        0fH.A0l("M4AScreenTimeSyncAppJob", "onResume backgrounded");
        AnonymousClass549 A04 = m4AScreenTimeSyncAppJob.A04();
        if (A04 != null) {
            M4AScreenTimeSyncAppJob.A02(A04, true, true);
            M4AScreenTimeSyncAppJob.A01(A04, m4AScreenTimeSyncAppJob);
            m4AScreenTimeSyncAppJob.A06(A04);
            54G A00 = A04.A00();
            if (A00 == null || !A00.A04) {
                m4AScreenTimeSyncAppJob.A07(A04, "FOREGROUND");
            }
        }
    }
}
