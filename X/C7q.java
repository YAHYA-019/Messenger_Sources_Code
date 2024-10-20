package X;

/* loaded from: C7q.class */
public final class C7q {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C7q(String str, String str2, Long l, boolean z) {
        this.A01 = str;
        this.A00 = l;
        this.A03 = z;
        C1pq.A08("publicIdentityKey", str2);
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7q)) {
                return false;
            }
            C7q c7q = (C7q) obj;
            if (!11T.A0O(this.A01, c7q.A01) || !11T.A0O(this.A00, c7q.A00) || this.A03 != c7q.A03 || !11T.A0O(this.A02, c7q.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A00, C1pq.A03(this.A01)), this.A03));
    }
}
