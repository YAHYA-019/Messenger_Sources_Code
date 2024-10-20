package X;

/* loaded from: Jyj.class */
public final class Jyj extends C4Nr {
    public final C4Nr A00;
    public final Object A01;

    public Jyj(C4Nr c4Nr, Object obj) {
        this.A00 = c4Nr;
        this.A01 = obj;
    }

    @Override // X.C4Nr
    public KN1 A00() {
        return this.A00.A00();
    }

    @Override // X.C4Nr
    public Kls A01(28Q r302, Kls kls) {
        kls.A03 = this.A01;
        return this.A00.A01(r302, kls);
    }

    @Override // X.C4Nr
    public Kls A02(28Q r302, Kls kls) {
        return this.A00.A02(r302, kls);
    }

    @Override // X.C4Nr
    public C4Nr A04(68U r302) {
        throw AnonymousClass001.A0p();
    }

    @Override // X.C4Nr
    public String A05() {
        return this.A00.A05();
    }
}
