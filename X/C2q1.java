package X;

/* renamed from: X.2q1, reason: invalid class name */
/* loaded from: 2q1.class */
public final class C2q1 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;

    public C2q1(float f, float f2, float f3, float f4, float f5, int i, int i2, int i3, int i4, int i5) {
        this.A00 = f;
        this.A01 = f2;
        this.A05 = i;
        this.A06 = i2;
        this.A02 = f3;
        this.A03 = f4;
        this.A07 = i3;
        this.A04 = f5;
        this.A08 = i4;
        this.A09 = i5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2q1)) {
                return false;
            }
            C2q1 c2q1 = (C2q1) obj;
            if (this.A00 != c2q1.A00 || this.A01 != c2q1.A01 || this.A05 != c2q1.A05 || this.A06 != c2q1.A06 || this.A02 != c2q1.A02 || this.A03 != c2q1.A03 || this.A07 != c2q1.A07 || this.A04 != c2q1.A04 || this.A08 != c2q1.A08 || this.A09 != c2q1.A09) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int floatToIntBits = (((((((((((((((((((Float.floatToIntBits(this.A00) + 31) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A05) * 31) + this.A06) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A03)) * 31) + this.A07) * 31) + Float.floatToIntBits(this.A04)) * 31) + this.A08) * 31) + this.A09) * 31;
        int floatToIntBits2 = Float.floatToIntBits(0.0f);
        return (((floatToIntBits + floatToIntBits2) * 31) + floatToIntBits2) * 31;
    }
}
