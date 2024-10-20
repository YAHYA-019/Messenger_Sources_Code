package X;

/* renamed from: X.88F, reason: invalid class name */
/* loaded from: 88F.class */
public final class C88F extends C04v {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public C88F(float f, float f2, float f3, int i) {
        this.A03 = i;
        switch (i) {
            case 0:
                this.A00 = f;
                this.A02 = f2;
                this.A01 = f3;
                return;
            case 1:
                this.A02 = f;
                this.A01 = f2;
                this.A00 = f3;
                return;
            default:
                this.A00 = f;
                this.A01 = f2;
                this.A02 = f3;
                return;
        }
    }

    public boolean equals(Object obj) {
        float f;
        float f2;
        switch (this.A03) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C88F)) {
                    return false;
                }
                C88F c88f = (C88F) obj;
                if (c88f.A03 != 0 || Float.compare(this.A00, c88f.A00) != 0 || Float.compare(this.A02, c88f.A02) != 0) {
                    return false;
                }
                f = this.A01;
                f2 = c88f.A01;
                break;
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C88F)) {
                    return false;
                }
                C88F c88f2 = (C88F) obj;
                if (c88f2.A03 != 1 || Float.compare(this.A02, c88f2.A02) != 0 || Float.compare(this.A01, c88f2.A01) != 0) {
                    return false;
                }
                f = this.A00;
                f2 = c88f2.A00;
                break;
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C88F)) {
                    return false;
                }
                C88F c88f3 = (C88F) obj;
                if (c88f3.A03 != 2 || Float.compare(this.A00, c88f3.A00) != 0 || Float.compare(this.A01, c88f3.A01) != 0) {
                    return false;
                }
                f = this.A02;
                f2 = c88f3.A02;
                break;
                break;
        }
        return Float.compare(f, f2) == 0;
    }

    public int hashCode() {
        int A00;
        float f;
        switch (this.A03) {
            case 0:
                A00 = 1BL.A00(Float.floatToIntBits(this.A00) * 31, this.A02);
                f = this.A01;
                break;
            case 1:
                A00 = 1BL.A00(Float.floatToIntBits(this.A02) * 31, this.A01);
                f = this.A00;
                break;
            default:
                A00 = 1BL.A00(Float.floatToIntBits(this.A00) * 31, this.A01);
                f = this.A02;
                break;
        }
        return A00 + Float.floatToIntBits(f);
    }
}
