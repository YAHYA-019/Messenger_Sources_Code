package X;

/* loaded from: H3v.class */
public final class H3v extends I5Z {
    public final /* synthetic */ JH2 A00;
    public final /* synthetic */ JH3 A01;
    public final /* synthetic */ java.util.Map A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H3v(JH2 jh2, JH3 jh3, I9e i9e, java.util.Map map, java.util.Map map2) {
        super(i9e, map, 0L);
        this.A02 = map2;
        this.A00 = jh2;
        this.A01 = jh3;
    }

    @Override // X.I5Z
    public void A02(String str) {
        RM6 rm6 = (RM6) DKC.A12(str, this.A02);
        this.A00.C5u(rm6.A02, rm6.A01);
    }

    @Override // X.I5Z
    public void A03(String str) {
        RM6 rm6 = (RM6) DKC.A12(str, this.A02);
        this.A01.C5v(rm6.A02, rm6.A01);
    }
}
