package X;

/* renamed from: X.93U, reason: invalid class name */
/* loaded from: 93U.class */
public final class C93U extends C6ys {
    public final boolean A00;

    public C93U(93P r302) {
        super(r302);
        this.A00 = r302.A00;
    }

    @Override // X.C6ys
    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof C93U) && super.equals(obj) && this.A00 == ((C93U) obj).A00) {
            z = true;
        }
        return z;
    }

    @Override // X.C6ys
    public int hashCode() {
        return (super.hashCode() * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0);
    }
}
