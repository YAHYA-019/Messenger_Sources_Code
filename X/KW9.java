package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: KW9.class */
public abstract class KW9 {
    public static void A00(Context context) {
        Intent A05 = AbF.A05();
        A05.setClassName(context, DKB.A00(13));
        A05.addFlags(268435456);
        A05.putExtra("activity_resource", "browser_settings");
        1BK.A0W().A0A(context, A05);
    }
}
