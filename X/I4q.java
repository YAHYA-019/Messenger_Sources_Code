package X;

import com.google.common.base.MoreObjects;
import java.util.Arrays;

/* loaded from: I4q.class */
public final class I4q {
    public final HAE A00;
    public final HAq A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public I4q(HAE hae, HAq hAq, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        11T.A0F(hae, 1);
        this.A00 = hae;
        this.A01 = hAq;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A06 = z5;
        this.A02 = z6;
    }

    public static boolean A00(I4q i4q) {
        return i4q.A00.equals(HAE.A05);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            I4q i4q = (I4q) obj;
            if (this.A00 != i4q.A00 || this.A01 != i4q.A01 || this.A03 != i4q.A03 || this.A04 != i4q.A04 || this.A05 != i4q.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, Boolean.valueOf(this.A03)});
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("visibility", this.A00);
        stringHelper.add("mode", this.A01);
        stringHelper.add("isDoodlePresent", this.A03);
        stringHelper.add("isEditingPresent", this.A04);
        stringHelper.add("isEffectApplied", this.A05);
        return 11T.A02(stringHelper);
    }
}
