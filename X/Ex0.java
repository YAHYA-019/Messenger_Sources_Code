package X;

/* loaded from: Ex0.class */
public final class Ex0 {
    public final float A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public Ex0(String str, String str2, String str3, float f) {
        this.A00 = f;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ex0)) {
                return false;
            }
            Ex0 ex0 = (Ex0) obj;
            if (this.A00 != ex0.A00 || !11T.A0O(this.A01, ex0.A01) || !11T.A0O(this.A02, ex0.A02) || !11T.A0O(this.A03, ex0.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, (Float.floatToIntBits(this.A00) + 31) * 31)));
    }
}
