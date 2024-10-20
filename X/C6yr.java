package X;

/* renamed from: X.6yr, reason: invalid class name */
/* loaded from: 6yr.class */
public final class C6yr extends C6ys {
    public final boolean A00;

    public C6yr(C6ym c6ym) {
        super(c6ym);
        this.A00 = c6ym.A00;
    }

    @Override // X.C6ys
    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof C6yr) && super.equals(obj) && this.A00 == ((C6yr) obj).A00) {
            z = true;
        }
        return z;
    }

    @Override // X.C6ys
    public int hashCode() {
        return (super.hashCode() * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0);
    }
}
