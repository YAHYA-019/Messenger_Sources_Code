package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.9b0, reason: invalid class name */
/* loaded from: 9b0.class */
public final class C9b0 {
    public final ImmutableList A00;
    public final String A01;

    public C9b0(ImmutableList immutableList, String str) {
        this.A01 = str;
        this.A00 = immutableList;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9b0)) {
                return false;
            }
            C9b0 c9b0 = (C9b0) obj;
            if (!11T.A0O(this.A01, c9b0.A01)) {
                return false;
            }
            ImmutableList immutableList = this.A00;
            ImmutableList immutableList2 = c9b0.A00;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zS.A04(this, this.A01, this.A00);
    }
}
