package X;

/* renamed from: X.3Oa, reason: invalid class name */
/* loaded from: 3Oa.class */
public final class C3Oa {
    public final String A00;
    public final String A01;

    public C3Oa(String str, String str2) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C3Oa)) {
                return false;
            }
            C3Oa c3Oa = (C3Oa) obj;
            if (!11T.A0O(this.A01, c3Oa.A01) || !11T.A0O(this.A00, c3Oa.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A01.hashCode() * 31) + 1BL.A05(this.A00);
    }

    public String toString() {
        return 0Pz.A0w("PrefetcherKey(stringKey=", this.A01, ", imageType=", this.A00, ')');
    }
}
