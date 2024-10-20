package X;

/* renamed from: X.03v, reason: invalid class name */
/* loaded from: 03v.class */
public final class C03v extends C03x {
    public final Object A00;

    public C03v(int i) {
        super(i);
        this.A00 = new Object();
    }

    @Override // X.C03x, X.C03y
    public Object A3p() {
        Object A3p;
        synchronized (this.A00) {
            A3p = super.A3p();
        }
        return A3p;
    }

    @Override // X.C03x, X.C03y
    public boolean Ccj(Object obj) {
        boolean Ccj;
        11T.A0F(obj, 0);
        synchronized (this.A00) {
            Ccj = super.Ccj(obj);
        }
        return Ccj;
    }
}
