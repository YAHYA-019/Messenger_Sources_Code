package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: Fj5.class */
public final class Fj5 implements MIS {
    public Context A00;
    public 1BY A01;
    public final 1I7 A02;
    public final F6F A03 = (F6F) 1Bi.A03(100034);

    public Fj5(1BO r302) {
        Context A0J = 7zP.A0J();
        this.A00 = A0J;
        this.A02 = DKD.A0H(A0J);
        this.A01 = 7zL.A0Q(r302);
    }

    public String Awg() {
        return "MESSENGER_SPONSORED_MESSAGES_REPORT";
    }

    public void BMD(Context context, Bundle bundle, java.util.Map map) {
        String string = bundle != null ? bundle.getString("tracking_codes") : null;
        Intent A0A = 4YU.A0A(AbE.A00(607));
        A0A.putExtra("messenger_sponsored_messages_ad_token", string);
        this.A02.CkS(A0A);
        L5x.A01(context, F6F.A00(this.A03), "ACTION_CLOSE_BROWSER", true, false);
    }
}
