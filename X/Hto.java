package X;

import android.util.SizeF;

/* loaded from: Hto.class */
public final class Hto {
    public final float A00;
    public final float A01;
    public final float A02;
    public final SizeF A03;
    public final SizeF A04;

    public Hto(SizeF sizeF, float f) {
        this.A03 = sizeF;
        this.A00 = f;
        float f2 = 6.2831855f * f;
        float f3 = f * 2.0f;
        this.A04 = new SizeF(sizeF.getWidth() - f3, sizeF.getHeight() - f3);
        this.A02 = (((sizeF.getWidth() * 2.0f) + (sizeF.getHeight() * 2.0f)) - (f * 8.0f)) + f2;
        this.A01 = f2 / 4.0f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Hto)) {
                return false;
            }
            Hto hto = (Hto) obj;
            if (!11T.A0O(this.A03, hto.A03) || Float.compare(this.A00, hto.A00) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BL.A03(this.A03) + Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RoundedRect(size=");
        A0k.append(this.A03);
        A0k.append(", radius=");
        A0k.append(this.A00);
        return 4YV.A0x(A0k);
    }
}
