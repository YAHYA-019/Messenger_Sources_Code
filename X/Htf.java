package X;

import android.util.SizeF;
import java.util.Set;

/* loaded from: Htf.class */
public final class Htf {
    public final float A00;
    public final Hto A01;
    public final Set A02;

    public Htf(Set set, float f, float f2) {
        11T.A0F(set, 4);
        float f3 = 2.0f * f;
        Hto hto = new Hto(new SizeF(f3, f3), f);
        this.A02 = set;
        this.A00 = f2;
        this.A01 = hto;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Htf)) {
                return false;
            }
            Htf htf = (Htf) obj;
            if (!11T.A0O(this.A02, htf.A02) || Float.compare(this.A00, htf.A00) != 0 || !11T.A0O(this.A01, htf.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 1BL.A00(AnonymousClass002.A05(this.A02, 620), this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ParticleRing(particleCount=");
        A0k.append(20);
        A0k.append(", starIndices=");
        A0k.append(this.A02);
        A0k.append(", particleScaleFactor=");
        A0k.append(this.A00);
        A0k.append(", roundedRect=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
