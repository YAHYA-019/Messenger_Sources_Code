package X;

/* renamed from: X.5nf, reason: invalid class name */
/* loaded from: 5nf.class */
public final class C5nf {
    public final Object A00;
    public final Object A01;

    public C5nf(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C5nf) {
            C5nf c5nf = (C5nf) obj;
            if (0Ig.A00(c5nf.A00, this.A00) && 0Ig.A00(c5nf.A01, this.A01)) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00) ^ 4YU.A03(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Pair{");
        A0k.append(this.A00);
        A0k.append(" ");
        A0k.append(this.A01);
        return 1BL.A0v(A0k);
    }
}
