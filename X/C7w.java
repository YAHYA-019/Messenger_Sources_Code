package X;

/* loaded from: C7w.class */
public final class C7w {
    public final Boolean A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C7w(Boolean bool, Long l, String str, String str2, String str3) {
        C1pq.A08("deviceId", str);
        this.A04 = str;
        this.A02 = str2;
        C1pq.A08("firstSeenTimestampMs", l);
        this.A01 = l;
        C1pq.A08("isCurrentDevice", bool);
        this.A00 = bool;
        C1pq.A08("publicIdentityKey", str3);
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7w)) {
                return false;
            }
            C7w c7w = (C7w) obj;
            if (!11T.A0O(this.A04, c7w.A04) || !11T.A0O(this.A02, c7w.A02) || !11T.A0O(this.A01, c7w.A01) || !11T.A0O(this.A00, c7w.A00) || !11T.A0O(this.A03, c7w.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A00, C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A03(this.A04)))));
    }
}
