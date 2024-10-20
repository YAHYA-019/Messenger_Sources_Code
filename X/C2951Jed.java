package X;

import android.graphics.Typeface;

/* renamed from: X.Jed, reason: case insensitive filesystem */
/* loaded from: Jed.class */
public final class C2951Jed extends 0Qs {
    public final /* synthetic */ LBK A00;
    public final /* synthetic */ KTJ A01;

    public C2951Jed(LBK lbk, KTJ ktj) {
        this.A00 = lbk;
        this.A01 = ktj;
    }

    public void A01(int i) {
        this.A00.A02 = true;
        this.A01.A01(i);
    }

    public void A03(Typeface typeface) {
        LBK lbk = this.A00;
        Typeface create = Typeface.create(typeface, lbk.A07);
        lbk.A01 = create;
        lbk.A02 = true;
        this.A01.A02(create, false);
    }
}
