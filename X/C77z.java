package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.77z, reason: invalid class name */
/* loaded from: 77z.class */
public final class C77z implements C6xq {
    public final int A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C77z(ImmutableList immutableList, ImmutableList immutableList2, int i, boolean z, boolean z2, boolean z3) {
        C1pq.A08("emojiSets", immutableList);
        this.A01 = immutableList;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A00 = i;
        C1pq.A08("topEmojiList", immutableList2);
        this.A02 = immutableList2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C77z)) {
                return false;
            }
            C77z c77z = (C77z) obj;
            if (!11T.A0O(this.A01, c77z.A01) || this.A03 != c77z.A03 || this.A04 != c77z.A04 || this.A05 != c77z.A05 || this.A00 != c77z.A00 || !11T.A0O(this.A02, c77z.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, (C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A03(this.A01), this.A03), this.A04), this.A05) * 31) + this.A00);
    }
}
