package X;

/* loaded from: Jyt.class */
public class Jyt extends Jyi {
    @Override // X.C4Nr
    public KN1 A00() {
        return this instanceof Jyr ? ((Jyr) this) instanceof Jyq ? KN1.EXISTING_PROPERTY : KN1.PROPERTY : KN1.WRAPPER_ARRAY;
    }

    @Override // X.C4Nr
    public /* bridge */ /* synthetic */ C4Nr A04(68U r302) {
        if (!(this instanceof Jyr)) {
            return this.A00 == r302 ? this : new Jyi(r302, this.A01);
        }
        Jyr jyr = (Jyr) this;
        boolean z = jyr instanceof Jyq;
        68U r0 = ((Jyi) jyr).A00;
        if (z) {
            if (r0 != r302) {
                jyr = new Jyr(r302, jyr.A01, jyr.A00);
            }
        } else if (r0 != r302) {
            return new Jyr(r302, jyr.A01, jyr.A00);
        }
        return jyr;
    }
}
