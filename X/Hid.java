package X;

import android.content.Context;

/* loaded from: Hid.class */
public final class Hid {
    public final Context A00;
    public final Fcf A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final HFs A05;
    public final String A06;

    public Hid(Context context, Fcf fcf, String str) {
        11T.A0F(str, 2);
        this.A00 = context;
        this.A06 = str;
        this.A01 = fcf;
        this.A02 = 1BK.A0E();
        this.A04 = 1Bq.A00(116220);
        this.A03 = 1Bu.A00(116235);
        this.A05 = new Gs3(this, 0);
    }
}
