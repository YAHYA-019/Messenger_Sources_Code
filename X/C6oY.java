package X;

/* renamed from: X.6oY, reason: invalid class name */
/* loaded from: 6oY.class */
public final class C6oY extends C04v {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Integer A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C6oY(Integer num, String str, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        11T.A0F(num, 8);
        this.A01 = j;
        this.A04 = str;
        this.A02 = j2;
        this.A06 = z;
        this.A05 = z2;
        this.A08 = z3;
        this.A00 = i;
        this.A03 = num;
        this.A07 = z4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C6oY)) {
                return false;
            }
            C6oY c6oY = (C6oY) obj;
            if (this.A01 != c6oY.A01 || !11T.A0O(this.A04, c6oY.A04) || this.A02 != c6oY.A02 || this.A06 != c6oY.A06 || this.A05 != c6oY.A05 || this.A08 != c6oY.A08 || this.A00 != c6oY.A00 || this.A03 != c6oY.A03 || this.A07 != c6oY.A07) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = (((((((AnonymousClass002.A02(this.A02, AnonymousClass002.A07(this.A04, AnonymousClass002.A01(this.A01))) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A08 ? 1 : 0)) * 31) + this.A00) * 31;
        int intValue = this.A03.intValue();
        return ((A02 + (1 != intValue ? "STYLE_1" : "STYLE_2").hashCode() + intValue) * 31) + AnonymousClass002.A00(this.A07 ? 1 : 0);
    }
}
