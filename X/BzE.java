package X;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: BzE.class */
public final class BzE {
    public final C8e A00(Context context, CLd cLd) {
        String str;
        int i;
        boolean A1W = 1BL.A1W(context, cLd);
        Object A03 = 1Bi.A03(82117);
        if (!1BL.A0Q().AZk(36326768965146436L) || Build.VERSION.SDK_INT < 31) {
            str = null;
        } else {
            Object systemService = context.getSystemService("notification");
            11T.A0I(systemService, 1BJ.A00(18));
            int bubblePreference = ((NotificationManager) systemService).getBubblePreference();
            if (bubblePreference != A1W) {
                i = 2131963624;
                if (bubblePreference != 2) {
                    i = 2131963623;
                }
            } else {
                i = 2131963622;
            }
            str = context.getString(i);
        }
        String string = context.getString(2131963625);
        2MQ r0 = 2MQ.A0m;
        C1td c1td = C1td.A08;
        11T.A0F(A03, A1W ? 1 : 0);
        Intent A00 = CLj.A00(context);
        Integer num = 0S2.A0C;
        CQ0 A002 = CQ0.A00();
        A002.A04(string);
        A002.A00 = r0;
        A002.A03 = c1td;
        A002.A04 = null;
        A002.A01 = new CvN(24, A00, num, (Object) null);
        if (str != null) {
            A002.A08 = str;
        }
        return new C8e(A002);
    }
}
