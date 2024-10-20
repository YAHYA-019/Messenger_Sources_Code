package X;

/* renamed from: X.1d5, reason: invalid class name */
/* loaded from: 1d5.class */
public final class C1d5 {
    public final boolean A00;
    public final Class A01;

    public C1d5(Class cls, boolean z) {
        this.A01 = cls;
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C1d5) {
            C1d5 c1d5 = (C1d5) obj;
            if (c1d5.A01.equals(this.A01) && c1d5.A00 == this.A00) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return ((this.A01.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.A00).hashCode();
    }
}
