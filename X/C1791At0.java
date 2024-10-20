package X;

/* renamed from: X.At0, reason: case insensitive filesystem */
/* loaded from: At0.class */
public final class C1791At0 extends C04v implements DEC {
    public final long A00;
    public final String A01;

    public C1791At0(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1791At0)) {
                return false;
            }
            C1791At0 c1791At0 = (C1791At0) obj;
            if (this.A00 != c1791At0.A00 || !11T.A0O(this.A01, c1791At0.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 7zQ.A02(this.A00));
    }
}
