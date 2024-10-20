package X;

/* renamed from: X.3Qw, reason: invalid class name */
/* loaded from: 3Qw.class */
public final class C3Qw {
    public volatile boolean A02;
    public volatile boolean A03;
    public volatile boolean A04;
    public final 1Br A01 = 1BK.A0C();
    public final 1Br A00 = 1Bq.A00(83869);

    public static final boolean A00(C3Qw c3Qw) {
        if (c3Qw.A04) {
            android.util.Log.d("MibUserSegUtils", 0Pz.A1C("Use isUserInSegmentACachedValue: ", c3Qw.A03));
            return c3Qw.A03;
        }
        boolean A1T = AnonymousClass001.A1T(((C0B5) 1Br.A0B(((BnR) 1Br.A0B(c3Qw.A00)).A00)).A01("com.facebook.orca", 0));
        boolean z = !A1T;
        c3Qw.A02 = A1T;
        c3Qw.A03 = z;
        c3Qw.A04 = true;
        android.util.Log.d("MibUserSegUtils", 0Pz.A1C("Set isUserInSegmentACachedValue: ", c3Qw.A03));
        return z;
    }

    public final boolean A01() {
        if (1Br.A07(this.A01).AZk(36311204007315988L)) {
            return true;
        }
        return A00(this);
    }
}
