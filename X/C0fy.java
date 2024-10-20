package X;

import java.util.RandomAccess;

/* renamed from: X.0fy, reason: invalid class name */
/* loaded from: 0fy.class */
public final class C0fy extends C00v implements RandomAccess {
    public int A00;
    public final int A01;
    public final C00v A02;

    public C0fy(C00v c00v, int i, int i2) {
        this.A02 = c00v;
        this.A01 = i;
        C0A7.A03(i, i2, c00v.size());
        this.A00 = i2 - i;
    }

    @Override // X.C00w
    public int A08() {
        return this.A00;
    }

    @Override // X.C00v, java.util.List
    public Object get(int i) {
        C0A7.A01(i, this.A00);
        return this.A02.get(this.A01 + i);
    }
}
