package X;

/* loaded from: Jyv.class */
public final class Jyv extends Jyi {
    public final String A00;

    public Jyv(68U r302, MKA mka, String str) {
        super(r302, mka);
        this.A00 = str;
    }

    @Override // X.C4Nr
    public KN1 A00() {
        return KN1.EXTERNAL_PROPERTY;
    }

    @Override // X.C4Nr
    public /* bridge */ /* synthetic */ C4Nr A04(68U r302) {
        return super.A00 == r302 ? this : new Jyv(r302, this.A01, this.A00);
    }
}
