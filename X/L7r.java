package X;

import android.os.Bundle;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.messaging.service.model.SetSettingsParams;

/* loaded from: L7r.class */
public final class L7r {
    public int A00;
    public long A01;
    public 1IC A02;
    public SetSettingsParams A03;
    public Kha A04;
    public final 1Ex A05 = (1Ex) 1Bi.A03(83426);
    public final C00i A0A = 1BV.A00(33031);
    public final C00i A06 = AbH.A0S();
    public final C00i A07 = 1BV.A00(83266);
    public final C12024yg A09 = (C12024yg) 1Bi.A03(49411);
    public final C00i A0B = 1BQ.A02(16772);
    public final C00i A08 = 1BQ.A02(16464);

    /* JADX WARN: Type inference failed for: r0v17, types: [com.facebook.messaging.service.model.SetSettingsParams, java.lang.Object] */
    public static void A00(L7r l7r) {
        synchronized (l7r) {
            if (l7r.A04 != null && l7r.A05.BTw() && l7r.A02 == null) {
                Kha kha = l7r.A04;
                ?? obj = new Object();
                obj.A01 = kha.A01;
                obj.A00 = kha.A00;
                l7r.A03 = obj;
                l7r.A04 = null;
                0fH.A0A(L7r.class, "Starting update");
                Bundle A05 = 1BK.A05();
                A05.putParcelable(1BJ.A00(550), l7r.A03);
                1IB A00 = 1Ho.A00(((BlueServiceOperationFactory) l7r.A0A.get()).newInstance_DEPRECATED(1BJ.A00(2123), A05), true);
                l7r.A02 = A00;
                LfN.A00(A00, l7r, 15);
            }
        }
    }

    public static void A01(L7r l7r, Integer num, Throwable th) {
        String str;
        2Jy r0 = new 2Jy("android_messenger_notif_pref");
        r0.A0D("pref", l7r.A03.A00.toString());
        switch (num.intValue()) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "RETRY";
                break;
            default:
                str = "FINAL_ERROR";
                break;
        }
        r0.A0D("status", str);
        r0.A0B("retry", l7r.A00);
        r0.A09(th, "error");
        C1kw c1kw = (C1kw) l7r.A0B.get();
        if (JkM.A00 == null) {
            synchronized (JkM.class) {
                if (JkM.A00 == null) {
                    JkM.A00 = new C2J3(c1kw);
                }
            }
        }
        JkM.A00.A03(r0);
    }
}
