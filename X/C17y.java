package X;

/* renamed from: X.17y, reason: invalid class name */
/* loaded from: 17y.class */
public enum C17y implements C16z {
    A04("sc", 0),
    A03("ca", 1),
    A02("ce", 2),
    A01("tr", 3),
    A05("fr", 4),
    A06("dr", 5);

    public final String mJsonKey;
    public final Class mType;

    C17y(String str, int i) {
        this.mJsonKey = str;
        this.mType = r302;
    }

    @Override // X.C16z
    public String Asm() {
        return this.mJsonKey;
    }

    @Override // X.C16z
    public Class BIx() {
        return this.mType;
    }
}
