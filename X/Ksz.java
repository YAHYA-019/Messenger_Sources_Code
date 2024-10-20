package X;

/* loaded from: Ksz.class */
public final class Ksz {
    public final String A00;
    public final String A01;

    public Ksz(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ksz)) {
                return false;
            }
            Ksz ksz = (Ksz) obj;
            if (!11T.A0O(this.A00, ksz.A00) || !11T.A0O(this.A01, ksz.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 4YV.A02(this.A00));
    }

    public String toString() {
        return JQz.A0r("ECPInitDataKey(productId=", this.A00, ", receiverId=", this.A01);
    }
}
