package X;

/* renamed from: X.8rq, reason: invalid class name */
/* loaded from: 8rq.class */
public final class C8rq extends 99K {
    public final int A01 = 2131957184;
    public final int A00 = 2131957183;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C8rq)) {
                return false;
            }
            C8rq c8rq = (C8rq) obj;
            if (this.A01 != c8rq.A01 || this.A00 != c8rq.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
