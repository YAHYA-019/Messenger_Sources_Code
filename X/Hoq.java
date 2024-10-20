package X;

import android.content.Context;
import android.content.DialogInterface;

/* loaded from: Hoq.class */
public final class Hoq {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    public Hoq(1De r302) {
        this.A03 = r302;
        1BY r0 = r302.A00;
        this.A00 = 1Bu.A03(r0, 16430);
        this.A02 = 1Bu.A03(r0, 115460);
        this.A01 = 1Bu.A03(r0, 16980);
    }

    public final void A00(Context context, Runnable runnable) {
        1Bn.A0E((Context) null, this.A03.A00, 67527);
        DR6 A0K = AbL.A0K(context, this.A01);
        A0K.A00(2131967506);
        A0K.A06(2131967505);
        A0K.A0D(new IGR(runnable, this, 1), 2131967504);
        A0K.A0B((DialogInterface.OnClickListener) null, 2131967503);
        A0K.A0C(new IGR(context, this, 2), 2131967507);
        A0K.A05();
    }
}
