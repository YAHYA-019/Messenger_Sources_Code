package X;

/* loaded from: Dq2.class */
public final class Dq2 extends C04v {
    public final float A00;
    public final Object A01;
    public final Object A02;

    public Dq2(Object obj, Object obj2, float f) {
        this.A00 = f;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dq2)) {
                return false;
            }
            Dq2 dq2 = (Dq2) obj;
            if (Float.compare(this.A00, dq2.A00) != 0 || !11T.A0O(this.A01, dq2.A01) || !11T.A0O(this.A02, dq2.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.A00) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 4YU.A03(this.A02);
    }
}
