package X;

/* loaded from: L48.class */
public final class L48 {
    public static final L48 A02 = new L48(2, false);
    public static final L48 A03 = new L48(1, true);
    public final int A00;
    public final boolean A01;

    public L48(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L48)) {
                return false;
            }
            L48 l48 = (L48) obj;
            if (this.A00 != l48.A00 || this.A01 != l48.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }

    public String toString() {
        return equals(A02) ? "TextMotion.Static" : equals(A03) ? "TextMotion.Animated" : "Invalid";
    }
}
