package X;

/* renamed from: X.2m0, reason: invalid class name */
/* loaded from: 2m0.class */
public final class C2m0 {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C2m0(int i, int i2, Object obj) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj;
        if (i < 0) {
            throw 0Pz.A04("width must be >= 0, but was: ", i);
        }
        if (i2 < 0) {
            throw 0Pz.A04("height must be >= 0, but was: ", i2);
        }
    }

    public C2m0(Object obj, long j) {
        this(F3u.A00(j), (int) (j & 4294967295L), obj);
    }
}
