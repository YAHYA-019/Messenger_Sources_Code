package X;

/* renamed from: X.1it, reason: invalid class name */
/* loaded from: 1it.class */
public final class C1it {
    public long A00 = System.currentTimeMillis();
    public Object A01;

    public C1it(Object obj) {
        this.A01 = obj;
    }

    public Object A00() {
        if (System.currentTimeMillis() - this.A00 < 10000) {
            return this.A01;
        }
        return null;
    }
}
