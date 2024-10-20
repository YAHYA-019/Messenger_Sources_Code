package X;

/* renamed from: X.1i2, reason: invalid class name */
/* loaded from: 1i2.class */
public abstract class C1i2 {
    public int A00(C1hr c1hr) {
        int i;
        synchronized (c1hr) {
            C1i2 c1i2 = C1hr.A00;
            i = c1hr.remaining - 1;
            c1hr.remaining = i;
        }
        return i;
    }
}
