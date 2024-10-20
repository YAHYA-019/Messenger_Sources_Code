package X;

/* loaded from: Dq1.class */
public final class Dq1 extends C04v {
    public final 8JZ A00;
    public final String A01;
    public final boolean A02;

    public Dq1(8JZ r302, String str, boolean z) {
        this.A01 = str;
        this.A00 = r302;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dq1)) {
                return false;
            }
            Dq1 dq1 = (Dq1) obj;
            if (!11T.A0O(this.A01, dq1.A01) || !11T.A0O(this.A00, dq1.A00) || this.A02 != dq1.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((1BL.A05(this.A01) * 31) + 4YU.A03(this.A00)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0);
    }
}
