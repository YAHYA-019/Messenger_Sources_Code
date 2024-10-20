package X;

/* loaded from: Ksp.class */
public final class Ksp {
    public final String A00;
    public final String A01;

    public Ksp(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ksp)) {
                return false;
            }
            Ksp ksp = (Ksp) obj;
            if (!11T.A0O(this.A00, ksp.A00) || !11T.A0O(this.A01, ksp.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 4YV.A02(this.A00));
    }

    public String toString() {
        return JQz.A0r("NaiveParseRecoveryCodeResponse(virtualDeviceId=", this.A00, ", blobDecryptionKey=", this.A01);
    }
}
