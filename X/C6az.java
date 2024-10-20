package X;

import android.text.TextUtils;

/* renamed from: X.6az, reason: invalid class name */
/* loaded from: 6az.class */
public final class C6az {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public C6az(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != C6az.class) {
                return false;
            }
            C6az c6az = (C6az) obj;
            if (!TextUtils.equals(this.A00, c6az.A00) || this.A01 != c6az.A01 || this.A02 != c6az.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.A00.hashCode() + 31) * 31;
        int i = 1231;
        int i2 = 1237;
        if (this.A01) {
            i2 = 1231;
        }
        int i3 = (hashCode + i2) * 31;
        if (!this.A02) {
            i = 1237;
        }
        return i3 + i;
    }
}
