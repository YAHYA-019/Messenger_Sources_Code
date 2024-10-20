package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.5uu, reason: invalid class name */
/* loaded from: 5uu.class */
public final class C5uu extends C04v implements 5PP {
    public final int A00;
    public final long A01;
    public final ImmutableList A02;
    public final Long A03;
    public final boolean A04;

    public C5uu(ImmutableList immutableList, Long l, int i, long j, boolean z) {
        this.A00 = i;
        this.A04 = z;
        this.A01 = j;
        this.A03 = l;
        this.A02 = immutableList;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5uu)) {
                return false;
            }
            C5uu c5uu = (C5uu) obj;
            if (this.A00 != c5uu.A00 || this.A04 != c5uu.A04 || this.A01 != c5uu.A01 || !11T.A0O(this.A03, c5uu.A03) || !11T.A0O(this.A02, c5uu.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00 * 31;
        int i2 = 1237;
        if (this.A04) {
            i2 = 1231;
        }
        int i3 = (i + i2) * 31;
        long j = this.A01;
        int i4 = (i3 + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.A03;
        int i5 = 0;
        int hashCode = (i4 + (l == null ? 0 : l.hashCode())) * 31;
        ImmutableList immutableList = this.A02;
        if (immutableList != null) {
            i5 = immutableList.hashCode();
        }
        return hashCode + i5;
    }
}
