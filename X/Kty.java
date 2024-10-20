package X;

/* loaded from: Kty.class */
public final class Kty {
    public final float A00;
    public final float A01;

    public Kty(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public final float[] A00() {
        float f = this.A00;
        float f2 = this.A01;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Kty)) {
                return false;
            }
            Kty kty = (Kty) obj;
            if (Float.compare(this.A00, kty.A00) != 0 || Float.compare(this.A01, kty.A01) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return JQz.A07(JQz.A04(this.A00), this.A01);
    }

    public String toString() {
        return 0Pz.A0a("WhitePoint(x=", ", y=", ')', this.A00, this.A01);
    }
}
