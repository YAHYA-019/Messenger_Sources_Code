package X;

/* loaded from: K6T.class */
public final class K6T extends Lip {
    public final String A00;

    public K6T(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Lip lip = (Lip) obj;
        int A02 = lip.A02();
        int i = 3;
        if (3 == A02) {
            K6T k6t = (K6T) lip;
            String str = this.A00;
            String str2 = k6t.A00;
            A02 = str2.length();
            i = str.length();
            if (i == A02) {
                return str.compareTo(str2);
            }
        }
        return i - A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((K6T) obj).A00);
    }

    public final int hashCode() {
        return AbM.A05(3, this.A00);
    }

    public final String toString() {
        return 0Pz.A0j("\"", this.A00, "\"");
    }
}
