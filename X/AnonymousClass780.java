package X;

/* renamed from: X.780, reason: invalid class name */
/* loaded from: 780.class */
public final class AnonymousClass780 implements C6xq {
    public final boolean A00;
    public final boolean A01;

    public AnonymousClass780() {
        this.A00 = false;
        this.A01 = false;
    }

    public AnonymousClass780(C7qN c7qN) {
        this.A00 = c7qN.A00;
        this.A01 = c7qN.A01;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass780)) {
                return false;
            }
            AnonymousClass780 anonymousClass780 = (AnonymousClass780) obj;
            if (this.A00 != anonymousClass780.A00 || this.A01 != anonymousClass780.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A05(this.A00), this.A01);
    }
}
