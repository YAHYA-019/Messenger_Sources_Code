package X;

/* renamed from: X.57t, reason: invalid class name */
/* loaded from: 57t.class */
public final class C57t implements 55H {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public C57t(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public boolean BVe(55H r302) {
        boolean z = false;
        if (r302.getClass() == C57t.class) {
            C57t c57t = (C57t) r302;
            if (this.A01 == c57t.A01 && this.A03 == c57t.A03 && this.A02 == c57t.A02 && this.A00 == c57t.A00) {
                z = true;
            }
        }
        return z;
    }
}
