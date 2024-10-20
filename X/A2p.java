package X;

/* loaded from: A2p.class */
public final class A2p implements C2lr {
    public static final A2p A00 = new Object();

    @Override // X.C2lr
    public boolean BSE(C2lr c2lr) {
        return 7zR.A1Z(c2lr, this);
    }

    public /* bridge */ /* synthetic */ boolean BSF(Object obj) {
        return 7zR.A1Z(obj, this);
    }

    @Override // X.C2lr
    public C2m0 BY9(C2ly c2ly, long j) {
        11T.A0F(c2ly, 0);
        int A002 = C0A8.A00(c2ly.A00.A04, 60.0f);
        int i = A002;
        if (C26P.A08(j)) {
            i = C26P.A01(j);
        } else if (C26P.A06(j)) {
            i = Math.min(C26P.A01(j), A002);
        }
        if (C26P.A07(j)) {
            A002 = C26P.A00(j);
        } else if (C26P.A05(j)) {
            A002 = Math.min(C26P.A00(j), A002);
        }
        return new C2m0(null, F2G.A00(i, A002));
    }
}
