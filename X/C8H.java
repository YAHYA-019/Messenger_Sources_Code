package X;

import com.google.common.collect.ImmutableList;

/* loaded from: C8H.class */
public final class C8H {
    public final BKZ A00;
    public final ImmutableList A01;
    public final long A02;
    public final long A03;
    public final Float A04;
    public final String A05;

    public C8H(BKZ bkz, ImmutableList immutableList, Float f, String str, long j, long j2) {
        this.A00 = bkz;
        this.A02 = j;
        this.A03 = j2;
        this.A01 = immutableList;
        this.A04 = f;
        this.A05 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C8H)) {
                return false;
            }
            C8H c8h = (C8H) obj;
            if (!11T.A0O(this.A00, c8h.A00) || this.A02 != c8h.A02 || this.A03 != c8h.A03 || !11T.A0O(this.A01, c8h.A01) || !11T.A0O(this.A04, c8h.A04) || !11T.A0O(this.A05, c8h.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A01, C1pq.A01(C1pq.A01(C1pq.A03(this.A00), this.A02), this.A03))));
    }
}
