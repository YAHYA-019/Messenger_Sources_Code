package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function1;

/* loaded from: Dvn.class */
public final class Dvn extends 1LH {
    public final Drawable A01;
    public final C00m A02;
    public final Function1 A03;
    public final long A05;
    public final 2lO A06;
    public final boolean A04 = true;
    public final int A00 = 200;

    public Dvn(Drawable drawable, 2lO r303, C00m c00m, Function1 function1, long j) {
        this.A01 = drawable;
        this.A05 = j;
        this.A02 = c00m;
        this.A06 = r303;
        this.A03 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        long j = this.A05;
        2lQ r0 = 2lO.A02;
        DvD dvD = new DvD(r0.A00(this.A06), new GAX(this, 14), j);
        return this.A02 != null ? new DvW(dvD, r0, new ACE(0S2.A01, 0S2.A00, 0S2.A0C), new GAX(this, 13), (C00m) null) : dvD;
    }
}
