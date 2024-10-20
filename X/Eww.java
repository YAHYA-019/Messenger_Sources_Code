package X;

import android.os.SystemClock;

/* loaded from: Eww.class */
public final class Eww {
    public final C00i A00 = AbH.A0N();
    public final C00i A01 = AbH.A0S();
    public final C00i A02 = AbH.A0T();
    public final String A03 = 1BK.A0t();

    public void A00(long j, long j2, String str) {
        1UG A08 = 1BK.A08(1BK.A07(this.A00), "fos_headwind_side_effects_result");
        if (A08.isSampled()) {
            A08.A6H(1BJ.A00(22), Long.valueOf(j2));
            DKD.A1D(A08, j);
            A08.A7R("extra", str);
            A08.BZL();
        }
    }

    public void A01(String str) {
        String A3a = 1BK.A0R(this.A01).A3a(DKC.A0b(1Ky.A11), "");
        1UG A08 = 1BK.A08(1BK.A07(this.A00), "fos_headwind_loganon");
        if (A08.isSampled()) {
            A08.A7R("log", str);
            A08.A7R("session_id", this.A03);
            A08.A6H(4YT.A00(279), Long.valueOf(SystemClock.elapsedRealtime()));
            A08.A7R("dogfood_id", A3a);
            A08.A7R("device_id", AbJ.A0z(this.A02));
            A08.BZL();
        }
    }
}
