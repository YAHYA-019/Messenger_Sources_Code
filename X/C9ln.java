package X;

/* renamed from: X.9ln, reason: invalid class name */
/* loaded from: 9ln.class */
public final class C9ln {
    public final 1Br A01 = 7zM.A0W();
    public final 1Br A02 = 1Bu.A00(66524);
    public final 1Br A00 = 7zM.A0d();

    public static final boolean A00(C9ln c9ln) {
        C1ud A0a = 7zP.A0a(c9ln.A01);
        long A07 = 7zS.A07(A0a, C1ud.A00(A0a), 36597901669961522L);
        Long A0D = 7zP.A0Z(c9ln.A02).A0D();
        boolean z = false;
        if (A0D != null) {
            if (A0D.longValue() + A07 >= 1Br.A00(c9ln.A00)) {
                0fH.A0j("GDriveTouchPointProvider", "Not Pass the cooldown time for leakage nux");
                return false;
            }
            0fH.A0j("GDriveTouchPointProvider", "Pass the cooldown time for leakage nux");
            z = true;
        }
        return z;
    }

    public static final boolean A01(C9ln c9ln) {
        boolean z = false;
        if (7zP.A0Z(c9ln.A02).A09() < C1ud.A00(7zP.A0a(c9ln.A01)).Auy(36597901662687008L)) {
            z = true;
        }
        return z;
    }

    public static final boolean A02(C9ln c9ln, long j) {
        C1wk A0Z = 7zP.A0Z(c9ln.A02);
        if (1BL.A0A(C1wk.A03(A0Z), C1wg.A00(A0Z, 1NK.A5u)) + j < 1Br.A00(c9ln.A00)) {
            0fH.A0j("GDriveTouchPointProvider", "Pass the cooldown time");
            return true;
        }
        0fH.A0j("GDriveTouchPointProvider", "Not Pass the cooldown time");
        return false;
    }
}
