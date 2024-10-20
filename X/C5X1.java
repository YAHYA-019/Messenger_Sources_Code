package X;

/* renamed from: X.5X1, reason: invalid class name */
/* loaded from: 5X1.class */
public final class C5X1 implements 5X2 {
    public final float A00;
    public final Integer A01;

    public C5X1(Integer num, float f) {
        this.A01 = num;
        this.A00 = f;
    }

    public float Chv(C5ht c5ht, 5XS r303) {
        float f;
        float Afw = r303.Afw(c5ht);
        int intValue = this.A01.intValue();
        if (intValue != 1) {
            f = (this.A00 / 100.0f) * r303.Afw(new C5ht(c5ht.A00, intValue != 2 ? C2jm.A01 : C2jm.A07));
        } else {
            f = this.A00;
        }
        return f + Afw;
    }
}
