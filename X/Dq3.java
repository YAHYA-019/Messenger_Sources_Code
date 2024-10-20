package X;

/* loaded from: Dq3.class */
public final class Dq3 extends C04v {
    public final float A00;
    public final float A01;
    public final 2MR A02;

    public Dq3(2MR r302, float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = r302;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dq3)) {
                return false;
            }
            Dq3 dq3 = (Dq3) obj;
            if (Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.A01, dq3.A01) != 0 || Float.compare(this.A00, dq3.A00) != 0 || this.A02 != dq3.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A02, 1BL.A00(1BL.A00(Float.floatToIntBits(0.0f) * 31, this.A01), this.A00));
    }
}
