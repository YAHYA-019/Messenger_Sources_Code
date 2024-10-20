package X;

import com.google.common.base.MoreObjects;

/* loaded from: C8z.class */
public final class C8z {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public C8z(long j, String str, long j2, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = j;
        this.A01 = j2;
    }

    public boolean equals(Object obj) {
        C8z c8z;
        return this == obj || (obj != null && 1BL.A1V(this, obj) && (obj instanceof C8z) && (c8z = (C8z) obj) != null && this.A00 == c8z.A00 && 11T.A0O(this.A02, c8z.A02) && 11T.A0O(this.A03, c8z.A03));
    }

    public int hashCode() {
        return 4YU.A04(this.A02, this.A03, Long.valueOf(this.A00));
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("messageId", this.A02);
        stringHelper.add("reactionEmoji", this.A03);
        stringHelper.add("offsetMs", this.A00);
        stringHelper.add("timestampMs", this.A01);
        return 11T.A02(stringHelper);
    }
}
