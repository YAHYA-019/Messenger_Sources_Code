package X;

/* renamed from: X.0Av, reason: invalid class name */
/* loaded from: 0Av.class */
public final class C0Av {
    public int A00;
    public int A01;
    public int A02;
    public Object[] A03;

    public C0Av() {
        this(8);
    }

    public C0Av(int i) {
        if (i > 1073741824) {
            KTq.A00("capacity must be <= 2^30");
            throw 0Q8.createAndThrow();
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.A00 = i - 1;
        this.A03 = new Object[i];
    }

    public final Object A00() {
        int i = this.A01;
        if (i == this.A02) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object[] objArr = this.A03;
        Object obj = objArr[i];
        objArr[i] = null;
        this.A01 = (i + 1) & this.A00;
        return obj;
    }
}
