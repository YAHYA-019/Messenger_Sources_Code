package X;

/* renamed from: X.785, reason: invalid class name */
/* loaded from: 785.class */
public final class AnonymousClass785 implements C6xq {
    public final boolean A00;
    public final boolean A01;

    public AnonymousClass785() {
        this.A00 = false;
        this.A01 = false;
    }

    public AnonymousClass785(7qM r302) {
        this.A00 = r302.A00;
        this.A01 = r302.A01;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass785)) {
                return false;
            }
            AnonymousClass785 anonymousClass785 = (AnonymousClass785) obj;
            if (this.A00 != anonymousClass785.A00 || this.A01 != anonymousClass785.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A05(this.A00), this.A01);
    }
}
