package X;

import com.google.android.exoplayer2.util.Util;

/* loaded from: Krd.class */
public final class Krd {
    public final String A00;
    public final String A01;
    public final String A02;

    public Krd(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Krd krd = (Krd) obj;
            if (!Util.A0P(this.A01, krd.A01) || !Util.A0P(this.A02, krd.A02) || !Util.A0P(this.A00, krd.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A02 = (4YV.A02(this.A01) + 1BL.A06(this.A02)) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return A02 + i;
    }
}
