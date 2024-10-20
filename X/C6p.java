package X;

/* loaded from: C6p.class */
public final class C6p {
    public final C04r A00 = AbH.A06();

    public final C1333AeN A00(C96 c96, String str) {
        C1333AeN c1333AeN;
        synchronized (this) {
            11T.A0F(str, 0);
            C04r c04r = this.A00;
            StringBuilder A0n = AnonymousClass001.A0n(str);
            A0n.append(':');
            c1333AeN = (C1333AeN) c04r.get(AnonymousClass001.A0a(c96, A0n));
        }
        return c1333AeN;
    }

    public final void A01(C96 c96, C1333AeN c1333AeN, String str) {
        synchronized (this) {
            C04r c04r = this.A00;
            StringBuilder A0n = AnonymousClass001.A0n(str);
            A0n.append(':');
            c04r.put(AnonymousClass001.A0a(c96, A0n), c1333AeN);
        }
    }
}
