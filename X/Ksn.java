package X;

/* loaded from: Ksn.class */
public final class Ksn {
    public final KNf A00;
    public final String A01;

    public Ksn(KNf kNf, String str) {
        this.A01 = str;
        this.A00 = kNf;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ksn)) {
                return false;
            }
            Ksn ksn = (Ksn) obj;
            if (!11T.A0O(this.A01, ksn.A01) || this.A00 != ksn.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, 4YV.A02(this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FetchHSMVirtualDeviceInfoResponse(virtualDeviceId=");
        A0k.append(this.A01);
        A0k.append(", pinNormalizationStatus=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
