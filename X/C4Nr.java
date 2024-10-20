package X;

/* renamed from: X.4Nr, reason: invalid class name */
/* loaded from: 4Nr.class */
public abstract class C4Nr {
    public abstract KN1 A00();

    public abstract Kls A01(28Q r1, Kls kls);

    public abstract Kls A02(28Q r1, Kls kls);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Kls, java.lang.Object] */
    public Kls A03(C42h c42h, Object obj) {
        Integer num;
        Integer num2;
        ?? obj2 = new Object();
        obj2.A03 = obj;
        obj2.A04 = null;
        obj2.A00 = c42h;
        int ordinal = A00().ordinal();
        if (ordinal == 4) {
            num = 0S2.A0N;
        } else if (ordinal == 3) {
            num = 0S2.A0Y;
        } else {
            if (ordinal != 0) {
                if (ordinal == 2) {
                    num2 = 0S2.A00;
                } else {
                    if (ordinal != 1) {
                        throw AnonymousClass001.A0T("Internal error: this code path should never get executed");
                    }
                    num2 = 0S2.A01;
                }
                obj2.A02 = num2;
                return obj2;
            }
            num = 0S2.A0C;
        }
        obj2.A02 = num;
        obj2.A05 = A05();
        return obj2;
    }

    public abstract C4Nr A04(68U r1);

    public abstract String A05();
}
