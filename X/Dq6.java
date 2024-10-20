package X;

/* loaded from: Dq6.class */
public final class Dq6 extends C04v {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;

    public Dq6(float f, float f2, float f3, int i, int i2) {
        this.A03 = i2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A04 = i;
    }

    public boolean equals(Object obj) {
        int i;
        if (this.A03 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else {
            if (this == obj) {
                return true;
            }
            i = 0;
        }
        if (!(obj instanceof Dq6)) {
            return false;
        }
        Dq6 dq6 = (Dq6) obj;
        return dq6.A03 == i && Float.compare(this.A00, dq6.A00) == 0 && Float.compare(this.A01, dq6.A01) == 0 && Float.compare(this.A02, dq6.A02) == 0 && this.A04 == dq6.A04;
    }

    public int hashCode() {
        return 1BL.A00(1BL.A00(Float.floatToIntBits(this.A00) * 31, this.A01), this.A02) + this.A04;
    }
}
