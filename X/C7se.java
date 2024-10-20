package X;

/* renamed from: X.7se, reason: invalid class name */
/* loaded from: 7se.class */
public final class C7se {
    public final long A00;
    public final long A01;

    public C7se(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof C7se)) {
                return false;
            }
            C7se c7se = (C7se) obj;
            if (this.A01 == c7se.A01 && this.A00 == c7se.A00) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
