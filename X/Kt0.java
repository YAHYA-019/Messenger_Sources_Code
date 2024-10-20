package X;

/* loaded from: Kt0.class */
public final class Kt0 {
    public final String A00;
    public final String A01;

    public Kt0(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Kt0)) {
                return false;
            }
            Kt0 kt0 = (Kt0) obj;
            if (!11T.A0O(this.A00, kt0.A00) || !11T.A0O(this.A01, kt0.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 4YV.A02(this.A00));
    }

    public String toString() {
        return JQz.A0r("ProductConfigKey(productId=", this.A00, ", receiverId=", this.A01);
    }
}
