package X;

/* renamed from: X.71z, reason: invalid class name */
/* loaded from: 71z.class */
public final class C71z extends C04v implements AnonymousClass720 {
    public final 8Lu A00;
    public final 97N A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C71z(8Lu r302, 97N r303, String str, String str2, String str3) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = r302;
        this.A01 = r303;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C71z)) {
                return false;
            }
            C71z c71z = (C71z) obj;
            if (!11T.A0O(this.A04, c71z.A04) || !11T.A0O(this.A03, c71z.A03) || !11T.A0O(this.A02, c71z.A02) || !11T.A0O(this.A00, c71z.A00) || this.A01 != c71z.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, (((((4YV.A02(this.A04) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A02)) * 31) + 4YU.A03(this.A00)) * 31);
    }
}
