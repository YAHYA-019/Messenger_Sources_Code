package X;

/* renamed from: X.AsK, reason: case insensitive filesystem */
/* loaded from: AsK.class */
public final class C1786AsK extends C04v {
    public String A00;
    public String A01;
    public String A02;
    public final int A03 = 0;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C1786AsK(9Di r302, Integer num, String str, String str2, String str3, String str4) {
        this.A05 = num;
        this.A02 = str;
        this.A01 = str2;
        this.A06 = str3;
        this.A00 = str4;
        this.A04 = r302;
    }

    public C1786AsK(String str) {
        11T.A0F(str, 1);
        this.A06 = str;
        this.A04 = AnonymousClass001.A0v();
        this.A05 = AnonymousClass001.A0v();
    }

    public boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A03 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1786AsK)) {
                return false;
            }
            C1786AsK c1786AsK = (C1786AsK) obj;
            if (c1786AsK.A03 != 1) {
                return false;
            }
            obj2 = this.A06;
            obj3 = c1786AsK.A06;
        } else {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1786AsK)) {
                return false;
            }
            C1786AsK c1786AsK2 = (C1786AsK) obj;
            if (c1786AsK2.A03 != 0 || this.A05 != c1786AsK2.A05 || !11T.A0O(this.A02, c1786AsK2.A02) || !11T.A0O(this.A01, c1786AsK2.A01) || !11T.A0O(this.A06, c1786AsK2.A06) || !11T.A0O(this.A00, c1786AsK2.A00)) {
                return false;
            }
            obj2 = this.A04;
            obj3 = c1786AsK2.A04;
        }
        return 11T.A0O(obj2, obj3);
    }

    public int hashCode() {
        return this.A03 != 0 ? this.A06.hashCode() : (((((((((9BK.A00((Integer) this.A05) * 31) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A01)) * 31) + 1BL.A05(this.A06)) * 31) + 1BL.A05(this.A00)) * 31) + 4YU.A03(this.A04);
    }
}
