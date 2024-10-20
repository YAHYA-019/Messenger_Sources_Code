package X;

/* loaded from: Lev.class */
public final class Lev implements MGT {
    public static final Lev A01 = new Lev(null);
    public final Object A00;

    public Lev(Object obj) {
        this.A00 = obj;
    }

    @Override // X.MGT
    public final Object A3b() {
        return this.A00;
    }
}
