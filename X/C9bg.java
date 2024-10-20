package X;

/* renamed from: X.9bg, reason: invalid class name */
/* loaded from: 9bg.class */
public final class C9bg {
    public final String A00;
    public final String A01;
    public final long A02;
    public final long A03;

    public C9bg(long j, String str, long j2, String str2) {
        C1pq.A08("messageId", str);
        this.A00 = str;
        C1pq.A08("optimisticThreadingId", str2);
        this.A01 = str2;
        this.A02 = j;
        this.A03 = j2;
        if (str2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (this.A00 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9bg)) {
                return false;
            }
            C9bg c9bg = (C9bg) obj;
            if (!11T.A0O(this.A00, c9bg.A00) || !11T.A0O(this.A01, c9bg.A01) || this.A02 != c9bg.A02 || this.A03 != c9bg.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A01(C1pq.A04(this.A01, C1pq.A03(this.A00)), this.A02), this.A03);
    }
}
