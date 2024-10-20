package X;

/* loaded from: Kso.class */
public final class Kso {
    public final String A00;
    public final String A01;

    public Kso(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Kso)) {
                return false;
            }
            Kso kso = (Kso) obj;
            if (!11T.A0O(this.A00, kso.A00) || !11T.A0O(this.A01, kso.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 4YV.A02(this.A00));
    }

    public String toString() {
        return JQz.A0r("GenerateRecoveryCodeAndVirtualDeviceIdResponse(recoveryCode=", this.A00, ", virtualDeviceId=", this.A01);
    }
}
