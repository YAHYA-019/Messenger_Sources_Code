package X;

/* renamed from: X.78d, reason: invalid class name */
/* loaded from: 78d.class */
public final class C78d extends C04v implements C6xq {
    public final boolean A00;
    public final boolean A01;

    public C78d() {
        this(false, false);
    }

    public C78d(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C78d)) {
                return false;
            }
            C78d c78d = (C78d) obj;
            if (this.A01 != c78d.A01 || this.A00 != c78d.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0);
    }
}
