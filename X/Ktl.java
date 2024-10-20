package X;

import android.util.Property;
import android.view.View;

/* loaded from: Ktl.class */
public final class Ktl {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;

    public Ktl(View view) {
        this.A05 = view.getTranslationX();
        this.A06 = view.getTranslationY();
        this.A07 = view.getTranslationZ();
        this.A03 = view.getScaleX();
        this.A04 = view.getScaleY();
        this.A00 = view.getRotationX();
        this.A01 = view.getRotationY();
        this.A02 = view.getRotation();
    }

    public void A00(View view) {
        float f = this.A05;
        float f2 = this.A06;
        float f3 = this.A07;
        float f4 = this.A03;
        float f5 = this.A04;
        float f6 = this.A00;
        float f7 = this.A01;
        float f8 = this.A02;
        Property property = JiT.A01;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        view.setTranslationZ(f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Ktl) {
            Ktl ktl = (Ktl) obj;
            if (ktl.A05 == this.A05 && ktl.A06 == this.A06 && ktl.A07 == this.A07 && ktl.A03 == this.A03 && ktl.A04 == this.A04 && ktl.A00 == this.A00 && ktl.A01 == this.A01 && ktl.A02 == this.A02) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        float f = this.A05;
        int i = 0;
        int A06 = JR1.A06((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)), f) * 31;
        float f2 = this.A06;
        int A062 = (A06 + JR1.A06((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)), f2)) * 31;
        float f3 = this.A07;
        int A063 = (A062 + JR1.A06((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)), f3)) * 31;
        float f4 = this.A03;
        int A064 = (A063 + JR1.A06((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)), f4)) * 31;
        float f5 = this.A04;
        int A065 = (A064 + JR1.A06((f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1)), f5)) * 31;
        float f6 = this.A00;
        int A066 = (A065 + JR1.A06((f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1)), f6)) * 31;
        float f7 = this.A01;
        int A067 = (A066 + JR1.A06((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)), f7)) * 31;
        float f8 = this.A02;
        if (f8 != 0.0f) {
            i = Float.floatToIntBits(f8);
        }
        return A067 + i;
    }
}
