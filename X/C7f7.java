package X;

/* renamed from: X.7f7, reason: invalid class name */
/* loaded from: 7f7.class */
public final class C7f7 extends C04v {
    public final int A00;
    public final boolean A01;

    public C7f7() {
        this(false, 0);
    }

    public C7f7(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7f7)) {
                return false;
            }
            C7f7 c7f7 = (C7f7) obj;
            if (this.A01 != c7f7.A01 || this.A00 != c7f7.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + this.A00;
    }
}
