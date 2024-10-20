package X;

/* loaded from: Fyu.class */
public final class Fyu implements GDv {
    public final String A00;
    public final String A01;

    public Fyu(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fyu)) {
                return false;
            }
            Fyu fyu = (Fyu) obj;
            if (!11T.A0O(this.A00, fyu.A00) || !11T.A0O(this.A01, fyu.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 4YV.A02(this.A00));
    }

    public String toString() {
        return 0Pz.A0w("FBCaptionsCreationInput(composerType=", this.A00, ", mediaUrl=", this.A01, ')');
    }
}
