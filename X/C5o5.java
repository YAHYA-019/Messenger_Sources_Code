package X;

/* renamed from: X.5o5, reason: invalid class name */
/* loaded from: 5o5.class */
public final class C5o5 extends C04v {
    public static final C5o5 A02 = new C5o5(0, false);
    public final long A00;
    public final boolean A01;

    public C5o5(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5o5)) {
                return false;
            }
            C5o5 c5o5 = (C5o5) obj;
            if (this.A00 != c5o5.A00 || this.A01 != c5o5.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (1BL.A01(this.A00) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }
}
