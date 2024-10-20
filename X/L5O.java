package X;

/* loaded from: L5O.class */
public final class L5O {
    public L5O() {
        this(0);
    }

    public L5O(int i) {
    }

    public final /* synthetic */ int A00(Object obj) {
        return ((LDV) obj).A05();
    }

    public final /* synthetic */ int A01(Object obj) {
        return ((LDV) obj).A06();
    }

    public final /* synthetic */ LDV A02(Object obj) {
        return ((K7f) obj).zzc;
    }

    public final /* bridge */ /* synthetic */ LDV A03(Object obj) {
        K7f k7f = (K7f) obj;
        LDV ldv = k7f.zzc;
        if (ldv == LDV.A00()) {
            ldv = LDV.A01();
            k7f.zzc = ldv;
        }
        return ldv;
    }

    public final /* bridge */ /* synthetic */ Object A04(Object obj, Object obj2) {
        LDV A00 = LDV.A00();
        if (!A00.equals(obj2)) {
            boolean equals = A00.equals(obj);
            LDV ldv = (LDV) obj2;
            if (!equals) {
                ((LDV) obj).A09(ldv);
                return obj;
            }
            obj = LDV.A02((LDV) obj, ldv);
        }
        return obj;
    }

    public final /* synthetic */ void A05(MLI mli, Object obj) {
        ((LDV) obj).A0A(mli);
    }

    public final void A06(Object obj) {
        ((K7f) obj).zzc.A07();
    }

    public final /* bridge */ /* synthetic */ void A07(Object obj, long j, int i) {
        ((LDV) obj).A08(i << 3, Long.valueOf(j));
    }

    public final /* synthetic */ void A08(Object obj, Object obj2) {
        ((K7f) obj).zzc = (LDV) obj2;
    }
}
