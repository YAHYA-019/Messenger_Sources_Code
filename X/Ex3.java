package X;

/* loaded from: Ex3.class */
public final class Ex3 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public Ex3(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ex3)) {
                return false;
            }
            Ex3 ex3 = (Ex3) obj;
            if (!11T.A0O(this.A00, ex3.A00) || !11T.A0O(this.A01, ex3.A01) || !11T.A0O(this.A02, ex3.A02) || !11T.A0O(this.A03, ex3.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }
}
