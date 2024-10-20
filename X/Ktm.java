package X;

/* loaded from: Ktm.class */
public final class Ktm {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public Ktm(int i, int i2, boolean z, int i3, boolean z2, int i4, boolean z3, int i5, boolean z4) {
        this.A08 = z;
        this.A07 = z2;
        this.A04 = i;
        this.A05 = z3;
        this.A06 = z4;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof Ktm)) {
                return false;
            }
            Ktm ktm = (Ktm) obj;
            if (this.A08 != ktm.A08 || this.A07 != ktm.A07 || this.A04 != ktm.A04 || this.A05 != ktm.A05 || this.A06 != ktm.A06 || this.A00 != ktm.A00 || this.A01 != ktm.A01 || this.A02 != ktm.A02 || this.A03 != ktm.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((this.A08 ? 1 : 0) * 31) + (this.A07 ? 1 : 0)) * 31) + this.A04) * 31 * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03;
    }

    public String toString() {
        StringBuilder A10 = JR1.A10(this);
        A10.append("(");
        if (this.A08) {
            A10.append("launchSingleTop ");
        }
        if (this.A07) {
            A10.append("restoreState ");
        }
        int i = this.A00;
        if (i != -1 || this.A01 != -1 || this.A02 != -1 || this.A03 != -1) {
            A10.append("anim(enterAnim=0x");
            JQz.A1Q(A10, i);
            A10.append(" exitAnim=0x");
            JQz.A1Q(A10, this.A01);
            A10.append(" popEnterAnim=0x");
            JQz.A1Q(A10, this.A02);
            A10.append(" popExitAnim=0x");
            JQz.A1Q(A10, this.A03);
            A10.append(")");
        }
        return 11T.A02(A10);
    }
}
