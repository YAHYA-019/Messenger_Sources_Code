package X;

/* renamed from: X.9lm, reason: invalid class name */
/* loaded from: 9lm.class */
public final class C9lm {
    public final 1Br A01 = 7zM.A0W();
    public final 1Br A02 = 1Bu.A00(66524);
    public final 1Br A00 = 7zM.A0d();

    public static final boolean A00(C9lm c9lm) {
        C1ud A0a = 7zP.A0a(c9lm.A01);
        long A07 = 7zS.A07(A0a, C1ud.A00(A0a), 36597901669961522L);
        Long A0D = 7zP.A0Z(c9lm.A02).A0D();
        boolean z = false;
        if (A0D != null) {
            if (A0D.longValue() + A07 >= 1Br.A00(c9lm.A00)) {
                0fH.A0j("BaseTouchPointProvider", "Not Pass the cooldown time for leakage nux");
                return false;
            }
            0fH.A0j("BaseTouchPointProvider", "Pass the cooldown time for leakage nux");
            z = true;
        }
        return z;
    }

    public static final boolean A01(C9lm c9lm) {
        boolean z = false;
        if (7zP.A0Z(c9lm.A02).A09() < C1ud.A00(7zP.A0a(c9lm.A01)).Auy(36597901662687008L)) {
            z = true;
        }
        return z;
    }

    public static final boolean A02(C9lm c9lm, Integer num, long j) {
        int intValue = num.intValue();
        C1wk A0Z = 7zP.A0Z(c9lm.A02);
        if (1BL.A0A(C1wk.A03(A0Z), C1wg.A01(A0Z, intValue != 0 ? 1NK.A5m : 1NK.A5u, 1)) + j < 1Br.A00(c9lm.A00)) {
            0fH.A0j("BaseTouchPointProvider", "Pass the cooldown time");
            return true;
        }
        0fH.A0j("BaseTouchPointProvider", "Not Pass the cooldown time");
        return false;
    }
}
