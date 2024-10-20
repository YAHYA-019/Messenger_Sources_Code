package X;

import android.content.Context;

/* loaded from: Fy7.class */
public final class Fy7 implements GOg {
    public final C97i A00;
    public final Integer A01;

    public Fy7(C97i c97i, Integer num) {
        1BL.A1F(num, c97i);
        this.A01 = num;
        this.A00 = c97i;
    }

    public /* bridge */ /* synthetic */ Object Ci8(Context context, C6tP c6tP) {
        boolean A1X = 1BL.A1X(context, c6tP);
        Aaq A00 = C9kH.A00(c6tP);
        int Chy = A00.Chy(this.A00, c6tP.BRa());
        2KP CiA = A00.CiA(this.A01);
        return F2e.A01(CiA, ((2KM) CiA.A04).getValue(), A1X ? 1 : 0, Chy);
    }
}
