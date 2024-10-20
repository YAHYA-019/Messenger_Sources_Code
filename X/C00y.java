package X;

/* renamed from: X.00y, reason: invalid class name */
/* loaded from: 00y.class */
public final class C00y implements C00i {
    public Object A00;
    public C15h A01;

    public C00y(C15h c15h) {
        this.A01 = c15h;
    }

    @Override // X.C00i, X.C15h
    public Object get() {
        if (this.A01 != null) {
            synchronized (this) {
                C15h c15h = this.A01;
                if (c15h != null) {
                    this.A00 = c15h.get();
                    this.A01 = null;
                }
            }
        }
        return this.A00;
    }
}
