package X;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: I4o.class */
public final class I4o {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final HBJ A04;
    public final boolean A05;

    public I4o(HBJ hbj, int i, int i2, boolean z, boolean z2) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = hbj;
        this.A05 = z;
        this.A01 = z2;
    }

    public static I4o A00(String str) {
        int i;
        if ("high".equalsIgnoreCase(str)) {
            i = 8;
        } else if ("main".equalsIgnoreCase(str)) {
            i = 2;
        } else {
            if (!"baseline".equalsIgnoreCase(str)) {
                return null;
            }
            i = 1;
        }
        return new I4o(HBJ.A0A, i, 256, false, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            I4o i4o = (I4o) obj;
            if (this.A04 != i4o.A04 || this.A03 != i4o.A03 || this.A02 != i4o.A02 || this.A05 != i4o.A05 || this.A01 != i4o.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, Integer.valueOf(this.A03), Integer.valueOf(this.A02), Boolean.valueOf(this.A05), Boolean.valueOf(this.A01)});
    }

    public String toString() {
        HashMap A0u = AnonymousClass001.A0u();
        A0u.put("codec", this.A04);
        A0u.put("profile", Integer.valueOf(this.A03));
        A0u.put("level", Integer.valueOf(this.A02));
        A0u.put("useBframe", Boolean.valueOf(this.A05));
        return IFX.A03(I4o.class, A0u);
    }
}
