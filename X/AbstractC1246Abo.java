package X;

/* renamed from: X.Abo, reason: case insensitive filesystem */
/* loaded from: Abo.class */
public abstract class AbstractC1246Abo {
    public static final Boolean A00() {
        C03h c03h = (C03h) 1Bi.A03(115118);
        boolean A09 = ((1Rv) 1Bi.A03(67262)).A09(48U.A00);
        Boolean A0d = 1BK.A0d();
        if (A09) {
            long A06 = c03h.A06(0S2.A01);
            if (A06 != 0) {
                if (A06 >= 52428800) {
                    return AnonymousClass001.A0K();
                }
                0fH.A07(R3W.class, Long.valueOf(A06), "not enough external storage: %d");
                return A0d;
            }
            0fH.A0A(R3W.class, "external storage unavailable");
        }
        return A0d;
    }
}
