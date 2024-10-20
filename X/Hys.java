package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;

/* loaded from: Hys.class */
public final class Hys {
    public final Context A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1De A03;

    public Hys(Context context, 1De r303) {
        this.A03 = r303;
        1BY r0 = r303.A00;
        this.A01 = 1Bu.A03(r0, 16979);
        this.A02 = 1Bu.A03(r0, 67527);
        this.A00 = context;
    }

    public static final void A00(Hys hys, int i, int i2) {
        Context context = hys.A00;
        String A0u = 1BK.A0u(context, i);
        String string = context.getString(i2);
        if (1XU.A00(context)) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isFinishing()) {
            return;
        }
        1Br.A0C(hys.A02);
        DR6 A0K = AbL.A0K(context, hys.A01);
        A0K.A0J(A0u);
        A0K.A0K(true);
        A0K.A0A((DialogInterface.OnClickListener) null);
        if (string != null) {
            A0K.A03(string);
        }
        A0K.A04().show();
    }
}
