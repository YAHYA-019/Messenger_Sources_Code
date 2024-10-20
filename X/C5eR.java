package X;

/* renamed from: X.5eR, reason: invalid class name */
/* loaded from: 5eR.class */
public final class C5eR extends C04v {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public C5eR(float f, float f2, float f3, float f4) {
        this.A03 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A01 = f4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5eR)) {
                return false;
            }
            C5eR c5eR = (C5eR) obj;
            if (Float.compare(this.A03, c5eR.A03) != 0 || Float.compare(this.A02, c5eR.A02) != 0 || Float.compare(this.A00, c5eR.A00) != 0 || Float.compare(this.A01, c5eR.A01) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A00(1BL.A00(Float.floatToIntBits(this.A03) * 31, this.A02), this.A00) + Float.floatToIntBits(this.A01);
    }
}
