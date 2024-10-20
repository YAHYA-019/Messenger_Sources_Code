package X;

import com.google.common.base.MoreObjects;

/* renamed from: X.6nt, reason: invalid class name */
/* loaded from: 6nt.class */
public final class C6nt {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final boolean A04;

    public C6nt(int i, int i2, String str, boolean z, long j) {
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
        this.A02 = j;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("messageId", this.A03);
        stringHelper.add("position", this.A00);
        stringHelper.add("totalItemCount", this.A01);
        stringHelper.add("isScrolling", this.A04);
        stringHelper.add(1BJ.A00(2082), this.A02);
        return stringHelper.toString();
    }
}
