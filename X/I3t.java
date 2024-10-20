package X;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* loaded from: I3t.class */
public final class I3t {
    public final HAD A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public I3t(HAD had, ImmutableList immutableList, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = had;
        this.A02 = str;
        this.A07 = z3;
        this.A04 = z;
        this.A08 = z4;
        this.A05 = true;
        this.A06 = z2;
        this.A01 = immutableList;
        this.A03 = str2;
    }

    public I3t(HeC heC) {
        this.A00 = heC.A00;
        this.A02 = "MONTAGE";
        this.A07 = false;
        this.A04 = false;
        this.A08 = false;
        this.A05 = false;
        this.A06 = heC.A02;
        this.A01 = heC.A01;
        this.A03 = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            I3t i3t = (I3t) obj;
            if (this.A07 != i3t.A07 || this.A04 != i3t.A04 || this.A08 != i3t.A08 || this.A05 != i3t.A05 || this.A06 != i3t.A06 || this.A00 != i3t.A00 || !Objects.equal(this.A02, i3t.A02) || !Objects.equal(this.A01, i3t.A01) || !Objects.equal(this.A03, i3t.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, Boolean.valueOf(this.A07), Boolean.valueOf(this.A04), Boolean.valueOf(this.A08), Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), this.A01, this.A03});
    }
}
