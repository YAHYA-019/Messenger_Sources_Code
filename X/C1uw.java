package X;

/* renamed from: X.1uw, reason: invalid class name */
/* loaded from: 1uw.class */
public final class C1uw {
    public static final C03v A02 = new C03v(4);
    public int A00;
    public int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !11T.A0O(getClass(), obj.getClass())) {
                return false;
            }
            C1uw c1uw = (C1uw) obj;
            if (this.A01 != c1uw.A01 || this.A00 != c1uw.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
