package X;

/* renamed from: X.Giz, reason: case insensitive filesystem */
/* loaded from: Giz.class */
public final class C2610Giz extends C04v {
    public long A00;
    public final long A01;
    public final String A02;

    public C2610Giz(long j, String str) {
        this.A01 = j;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2610Giz)) {
                return false;
            }
            C2610Giz c2610Giz = (C2610Giz) obj;
            if (this.A01 != c2610Giz.A01 || !11T.A0O(this.A02, c2610Giz.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A02, 7zQ.A02(this.A01));
    }
}
