package X;

/* loaded from: Ksy.class */
public final class Ksy {
    public final String A00;
    public final String A01;

    public Ksy(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ksy)) {
                return false;
            }
            Ksy ksy = (Ksy) obj;
            if (!11T.A0O(this.A01, ksy.A01) || !11T.A0O(this.A00, ksy.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A00, 4YV.A02(this.A01));
    }

    public String toString() {
        return JQz.A0r("UpdateContactIdParams(oldId=", this.A01, ", newId=", this.A00);
    }
}
