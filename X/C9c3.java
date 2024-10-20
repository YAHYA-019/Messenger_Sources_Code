package X;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* renamed from: X.9c3, reason: invalid class name */
/* loaded from: 9c3.class */
public final class C9c3 {
    public final int A00;
    public final 5vH A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C9c3(5vH r302, ImmutableList immutableList, String str, int i, boolean z, boolean z2, boolean z3) {
        this.A03 = str;
        this.A02 = immutableList;
        this.A05 = z;
        this.A04 = z2;
        this.A01 = r302;
        this.A06 = z3;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof C9c3)) {
                return false;
            }
            C9c3 c9c3 = (C9c3) obj;
            if (!11T.A0O(this.A03, c9c3.A03)) {
                return false;
            }
            ImmutableList immutableList = this.A02;
            ImmutableList immutableList2 = c9c3.A02;
            if (immutableList != null) {
                if (!immutableList.equals(immutableList2)) {
                    return false;
                }
            } else if (immutableList2 != null) {
                return false;
            }
            if (this.A05 != c9c3.A05 || this.A04 != c9c3.A04) {
                return false;
            }
            5vH r0 = this.A01;
            5vH r02 = c9c3.A01;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
            if (this.A06 != c9c3.A06 || this.A00 != c9c3.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A02, Boolean.valueOf(this.A05), Boolean.valueOf(this.A04), this.A01, Boolean.valueOf(this.A06), Integer.valueOf(this.A00), getClass()});
    }
}
