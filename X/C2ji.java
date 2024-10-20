package X;

/* renamed from: X.2ji, reason: invalid class name */
/* loaded from: 2ji.class */
public final class C2ji {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final Object A03;

    public C2ji() {
        this.A01 = 0;
        this.A00 = 0;
        this.A03 = null;
        this.A02 = true;
    }

    public C2ji(int i, int i2, Object obj) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = false;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MeasureResult:[width ");
        A0k.append(this.A01);
        A0k.append(" height ");
        A0k.append(this.A00);
        A0k.append(" layoutData ");
        A0k.append(this.A03);
        A0k.append(" hadExceptions ");
        A0k.append(this.A02);
        return AnonymousClass001.A0g(A0k, ']');
    }
}
