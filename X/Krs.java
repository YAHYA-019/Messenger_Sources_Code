package X;

import com.google.android.exoplayer2.util.Util;

/* loaded from: Krs.class */
public final class Krs {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public Krs(String str, String str2, String str3, String str4, String str5) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = str3;
        this.A02 = str4;
        this.A01 = str5;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof Krs)) {
                return false;
            }
            Krs krs = (Krs) obj;
            if (Util.A0P(this.A04, krs.A04) && Util.A0P(this.A03, krs.A03) && Util.A0P(this.A00, krs.A00) && Util.A0P(this.A02, krs.A02) && Util.A0P(this.A01, krs.A01)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int A03 = (((((AbstractC2326GOr.A03(1BL.A06(this.A04)) + 1BL.A06(this.A03)) * 31) + 1BL.A06(this.A00)) * 31) + 1BL.A06(this.A02)) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A03 + i;
    }
}
