package X;

/* loaded from: C8p.class */
public final class C8p {
    public final String A00;
    public final String A01;

    public C8p(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C8p)) {
                return false;
            }
            C8p c8p = (C8p) obj;
            if (!11T.A0O(this.A00, c8p.A00) || !11T.A0O(this.A01, c8p.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YV.A02(this.A00) + 1BL.A05(this.A01);
    }

    public String toString() {
        return 0Pz.A0w("RecoveryCodeResult(recoveryCode=", this.A00, ", source=", this.A01, ')');
    }
}
