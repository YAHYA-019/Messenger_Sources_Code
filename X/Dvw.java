package X;

import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.jvm.functions.Function1;

/* loaded from: Dvw.class */
public final class Dvw extends 1LH {
    public final 5BO A00;
    public final 1LI A01;
    public final AXM A02;
    public final 9sO A03;
    public final Integer A04;
    public final C00m A05;
    public final C00m A06;
    public final C00m A07;
    public final Function1 A08;
    public final long A09;
    public final 2lO A0A;

    public Dvw(5BO r302, 1LI r303, 2lO r304, AXM axm, 9sO r306, Integer num, C00m c00m, C00m c00m2, C00m c00m3, Function1 function1, long j) {
        11T.A0F(axm, 3);
        this.A00 = r302;
        this.A09 = j;
        this.A02 = axm;
        this.A0A = r304;
        this.A04 = num;
        this.A05 = c00m;
        this.A06 = c00m2;
        this.A07 = c00m3;
        this.A01 = r303;
        this.A03 = r306;
        this.A08 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        boolean z = true;
        int i = 0;
        Drawable A00 = EZ3.A00(c2k5, new GAX(c2k5, 12), new Object[]{04S.A00});
        if ((this.A05 == null && this.A06 == null) || !(this.A02 instanceof ACU)) {
            z = false;
        }
        5X3 A002 = C3s9.A00(C3s9.A04, "image_fade_in_transition");
        A002.A03(C2jm.A00);
        A002.A01(0.0f);
        Integer num = this.A04;
        if (num != null) {
            i = num.intValue();
        }
        7zN.A12(new AccelerateDecelerateInterpolator(), A002, i);
        5XC.A00(c2k5, A002);
        long j = this.A09;
        2lQ r0 = 2lO.A02;
        DvD dvD = new DvD(r0.A00(this.A0A), new G9J(37, A00, c2k5, this), j);
        return z ? new DvW(dvD, r0, new ACE(0S2.A01, 0S2.A00, 0S2.A0C), new GAX(this, 10), new GAX(this, 11)) : dvD;
    }
}
