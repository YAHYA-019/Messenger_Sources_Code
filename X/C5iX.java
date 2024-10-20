package X;

/* renamed from: X.5iX, reason: invalid class name */
/* loaded from: 5iX.class */
public abstract class C5iX {
    public static long A00(5TY r301) {
        Object A03 = r301.A03("PRENAV_DATA_TTL_MIILLI");
        if (A03 != null) {
            return AnonymousClass001.A05(A03);
        }
        long j = 300000;
        Object A032 = r301.A03("DATA_TTL_MIILLI");
        if (A032 != null) {
            j = AnonymousClass001.A05(A032);
        }
        return j;
    }

    public static long A01(5TY r301, long j) {
        Object A03 = r301.A03("POSTNAV_DATA_TTL_MIILLI");
        if (A03 != null) {
            return AnonymousClass001.A05(A03);
        }
        Object A032 = r301.A03("DATA_TTL_MIILLI");
        if (A032 != null) {
            j = AnonymousClass001.A05(A032);
        }
        return j;
    }
}
