package X;

/* loaded from: EzP.class */
public final class EzP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final boolean A08;

    public EzP(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.A05 = i;
        this.A04 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A01 = i5;
        this.A00 = i6;
        this.A07 = i7;
        this.A06 = i8;
        this.A08 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EzP)) {
                return false;
            }
            EzP ezP = (EzP) obj;
            if (this.A05 != ezP.A05 || this.A04 != ezP.A04 || this.A02 != ezP.A02 || this.A03 != ezP.A03 || this.A01 != ezP.A01 || this.A00 != ezP.A00 || this.A07 != ezP.A07 || this.A06 != ezP.A06 || this.A08 != ezP.A08) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((this.A05 * 31) + this.A04) * 31) + this.A02) * 31) + this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + this.A07) * 31) + this.A06) * 31) + AnonymousClass002.A00(this.A08 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("OnComputePositionInfo(screenWidth=");
        A0k.append(this.A05);
        A0k.append(", screenHeight=");
        A0k.append(this.A04);
        A0k.append(", anchorX=");
        A0k.append(this.A02);
        A0k.append(", anchorY=");
        A0k.append(this.A03);
        A0k.append(", anchorWidth=");
        A0k.append(this.A01);
        A0k.append(", anchorHeight=");
        A0k.append(this.A00);
        A0k.append(", tooltipIntrinsicWidth=");
        A0k.append(this.A07);
        A0k.append(", tooltipIntrinsicHeight=");
        A0k.append(this.A06);
        A0k.append(", isRtl=");
        return DKH.A0q(A0k, this.A08);
    }
}
