package X;

/* loaded from: L0q.class */
public final class L0q {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;

    public L0q(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.A00 = f;
        this.A01 = f4;
        this.A02 = f7;
        this.A03 = f2;
        this.A04 = f5;
        this.A05 = f8;
        this.A06 = f3;
        this.A07 = f6;
        this.A08 = f9;
    }

    public static L0q A00(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new L0q(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f, 1.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float A01 = JQz.A01(f11, f14, f12, f13);
        float A012 = JQz.A01(f14, f9, f12, f10) / A01;
        float A013 = JQz.A01(f11, f10, f9, f13) / A01;
        return new L0q((A012 * f3) + (f3 - f), (A013 * f7) + (f7 - f), f, (f4 - f2) + (A012 * f4), (f8 - f2) + (A013 * f8), f2, A012, A013, 1.0f);
    }
}
