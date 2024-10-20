package X;

/* loaded from: Htu.class */
public final class Htu {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    public Htu(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A00 = f;
        this.A03 = f2;
        this.A01 = f3;
        this.A04 = f4;
        this.A02 = f5;
        this.A05 = f6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Htu)) {
                return false;
            }
            Htu htu = (Htu) obj;
            if (Float.compare(this.A00, htu.A00) != 0 || Float.compare(this.A03, htu.A03) != 0 || Float.compare(this.A01, htu.A01) != 0 || Float.compare(this.A04, htu.A04) != 0 || Float.compare(this.A02, htu.A02) != 0 || Float.compare(this.A05, htu.A05) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A00(1BL.A00(1BL.A00(1BL.A00(Float.floatToIntBits(this.A00) * 31, this.A03), this.A01), this.A04), this.A02) + Float.floatToIntBits(this.A05);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PathCubicCommandArgs(x1=");
        A0k.append(this.A00);
        A0k.append(", y1=");
        A0k.append(this.A03);
        A0k.append(", x2=");
        A0k.append(this.A01);
        A0k.append(", y2=");
        A0k.append(this.A04);
        A0k.append(", x3=");
        A0k.append(this.A02);
        A0k.append(", y3=");
        A0k.append(this.A05);
        return 4YV.A0x(A0k);
    }
}
