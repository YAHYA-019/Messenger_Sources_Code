package X;

import java.util.Arrays;

/* renamed from: X.9bu, reason: invalid class name */
/* loaded from: 9bu.class */
public final class C9bu {
    public final int A00;
    public final int A01;
    public final 5SA A02;
    public final String A03;
    public final boolean A04;

    public C9bu(5SA r302, String str, int i, int i2, boolean z) {
        this.A03 = str;
        this.A04 = z;
        this.A02 = r302;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9bu)) {
                return false;
            }
            C9bu c9bu = (C9bu) obj;
            if (!11T.A0O(this.A03, c9bu.A03) || this.A04 != c9bu.A04) {
                return false;
            }
            5SA r0 = this.A02;
            5SA r02 = c9bu.A02;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            if (this.A00 != c9bu.A00 || this.A01 != c9bu.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Boolean.valueOf(this.A04), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01), getClass()});
    }
}
