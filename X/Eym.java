package X;

/* loaded from: Eym.class */
public final class Eym {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public Eym(float f, float f2, float f3, int i) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eym)) {
                return false;
            }
            Eym eym = (Eym) obj;
            if (this.A03 != eym.A03 || Float.compare(this.A00, eym.A00) != 0 || Float.compare(this.A01, eym.A01) != 0 || Float.compare(this.A02, eym.A02) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A00(1BL.A00(this.A03 * 31, this.A00), this.A01) + Float.floatToIntBits(this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Shadow(color=");
        A0k.append(this.A03);
        A0k.append(", offsetX=");
        A0k.append(this.A00);
        A0k.append(", offsetY=");
        A0k.append(this.A01);
        A0k.append(GOm.A00(33));
        A0k.append(this.A02);
        return 4YV.A0x(A0k);
    }
}
