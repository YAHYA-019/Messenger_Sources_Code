package X;

/* renamed from: X.7f2, reason: invalid class name */
/* loaded from: 7f2.class */
public final class C7f2 extends C04v {
    public float A00;
    public float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7f2)) {
                return false;
            }
            C7f2 c7f2 = (C7f2) obj;
            if (Float.compare(this.A00, c7f2.A00) != 0 || Float.compare(this.A01, c7f2.A01) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
    }
}
