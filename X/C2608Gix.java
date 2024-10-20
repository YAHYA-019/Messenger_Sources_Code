package X;

/* renamed from: X.Gix, reason: case insensitive filesystem */
/* loaded from: Gix.class */
public final class C2608Gix extends C04v {
    public final float A00;
    public final int A01;
    public final int A02;

    public C2608Gix(int i, int i2, float f) {
        this.A01 = i2;
        this.A00 = f;
        this.A02 = i;
    }

    public boolean equals(Object obj) {
        if (this.A01 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2608Gix)) {
                return false;
            }
            C2608Gix c2608Gix = (C2608Gix) obj;
            return c2608Gix.A01 == 1 && Float.compare(this.A00, c2608Gix.A00) == 0 && this.A02 == c2608Gix.A02;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2608Gix)) {
            return false;
        }
        C2608Gix c2608Gix2 = (C2608Gix) obj;
        return c2608Gix2.A01 == 0 && this.A02 == c2608Gix2.A02 && Float.compare(this.A00, c2608Gix2.A00) == 0;
    }

    public int hashCode() {
        int i;
        int floatToIntBits;
        if (this.A01 != 0) {
            i = Float.floatToIntBits(this.A00) * 31;
            floatToIntBits = this.A02;
        } else {
            i = this.A02 * 31;
            floatToIntBits = Float.floatToIntBits(this.A00);
        }
        return i + floatToIntBits;
    }
}
