package X;

/* renamed from: X.9bh, reason: invalid class name */
/* loaded from: 9bh.class */
public final class C9bh {
    public final String A00;
    public final String A01;
    public final Integer A02;
    public final String A03;

    public C9bh(Integer num, String str, String str2, String str3) {
        this.A02 = num;
        this.A03 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9bh)) {
                return false;
            }
            C9bh c9bh = (C9bh) obj;
            if (!11T.A0O(this.A02, c9bh.A02) || !11T.A0O(this.A03, c9bh.A03) || !11T.A0O(this.A00, c9bh.A00) || !11T.A0O(this.A01, c9bh.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A03(this.A02))));
    }
}
