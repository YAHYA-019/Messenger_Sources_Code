package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.77u, reason: invalid class name */
/* loaded from: 77u.class */
public final class C77u implements C6xq {
    public final int A00;
    public final ImmutableList A01;
    public final boolean A02;

    public C77u(ImmutableList immutableList, int i, boolean z) {
        this.A02 = z;
        C1pq.A08("options", immutableList);
        this.A01 = immutableList;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C77u)) {
                return false;
            }
            C77u c77u = (C77u) obj;
            if (this.A02 != c77u.A02 || !11T.A0O(this.A01, c77u.A01) || this.A00 != c77u.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A01, C1pq.A05(this.A02)) * 31) + this.A00;
    }
}
