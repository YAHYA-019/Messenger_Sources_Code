package X;

/* renamed from: X.2ov, reason: invalid class name */
/* loaded from: 2ov.class */
public final class C2ov {
    public boolean A01;
    public final C04r A02 = new 0QO(0);
    public C01i A00 = new 0Dd(C0ty.A00);

    public final void A00(Class cls, C00m c00m) {
        11T.A0F(cls, 0);
        C04r c04r = this.A02;
        if (!c04r.containsKey(cls)) {
            c04r.put(cls, C01g.A00(C03i.A03, new C2xm(c00m, 19)));
        } else {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(cls);
            throw AnonymousClass002.A0F(" was already registered previously", A0k);
        }
    }

    public final void A01(C00m c00m) {
        if (!(!this.A01)) {
            throw AnonymousClass001.A0N("withDefault was already called previously");
        }
        this.A01 = true;
        this.A00 = C01g.A00(C03i.A03, new C2xm(c00m, 20));
    }
}
