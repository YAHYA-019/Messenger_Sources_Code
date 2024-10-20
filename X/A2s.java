package X;

/* loaded from: A2s.class */
public final class A2s implements C2lr {
    public static final 1Br A00;
    public static final A2s A01 = new Object();
    public static final int A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.A2s, java.lang.Object] */
    static {
        1Br A0a = 7zM.A0a();
        A00 = A0a;
        A02 = 2yD.A00(4YV.A0V(A0a.A00), 36604271108233790L);
    }

    @Override // X.C2lr
    public boolean BSE(C2lr c2lr) {
        return 7zR.A1Z(c2lr, this);
    }

    public /* bridge */ /* synthetic */ boolean BSF(Object obj) {
        return 7zR.A1Z(obj, this);
    }

    @Override // X.C2lr
    public C2m0 BY9(C2ly c2ly, long j) {
        int A012;
        11T.A0F(c2ly, 0);
        int i = A02;
        if (i > 1) {
            A012 = C2lu.A01(c2ly.B7k(), 3yH.A06(c2ly, 2132279361)) * i;
        } else {
            A012 = C2lu.A01(c2ly.B7k(), 3yH.A06(c2ly, 2132279363));
        }
        return new C2m0(C26P.A01(j), A012, null);
    }
}
