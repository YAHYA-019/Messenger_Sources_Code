package X;

import android.content.Context;

/* loaded from: Eul.class */
public final class Eul {
    public GJ2 A00;
    public java.util.Map A01;
    public java.util.Map A02;
    public final String A03;

    public Eul(String str) {
        this.A03 = str;
    }

    public final void A00(Context context, GJ1 gj1) {
        boolean A1W = 1BL.A1W(context, gj1);
        String str = this.A03;
        03W r306 = this.A02;
        Emi emi = new Emi(context, this, gj1);
        if (!(gj1 instanceof Fwk)) {
            throw AnonymousClass001.A0L("Host instance must be an instance of MSGBloksHost");
        }
        if (r306 == null) {
            r306 = 04R.A0G();
        }
        ((F8z) 1Bi.A03(98521)).A01(context, 4YV.A0E(context), new Fb5(emi), new DqI(str, (java.util.Map) r306, A1W));
    }
}
