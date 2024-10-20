package X;

/* renamed from: X.5uw, reason: invalid class name */
/* loaded from: 5uw.class */
public final class C5uw implements 5PP {
    public final String A00;
    public final String A01;

    public C5uw(String str, String str2) {
        C1pq.A08("lastMessageId", str);
        this.A00 = str;
        C1pq.A08("nextMessageId", str2);
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5uw)) {
                return false;
            }
            C5uw c5uw = (C5uw) obj;
            if (!11T.A0O(this.A00, c5uw.A00) || !11T.A0O(this.A01, c5uw.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A00, 1));
    }
}
