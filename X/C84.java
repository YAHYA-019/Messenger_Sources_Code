package X;

/* loaded from: C84.class */
public final class C84 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C84(String str, String str2, int i, String str3, String str4) {
        this.A00 = i;
        this.A01 = str;
        C1pq.A08("threadId", str2);
        this.A02 = str2;
        C1pq.A08("threadImageUrl", str3);
        this.A03 = str3;
        C1pq.A08("threadName", str4);
        this.A04 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C84)) {
                return false;
            }
            C84 c84 = (C84) obj;
            if (this.A00 != c84.A00 || !11T.A0O(this.A01, c84.A01) || !11T.A0O(this.A02, c84.A02) || !11T.A0O(this.A03, c84.A03) || !11T.A0O(this.A04, c84.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, this.A00 + 31))));
    }
}
