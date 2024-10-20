package X;

import android.content.Context;

/* loaded from: E3q.class */
public final class E3q extends FIJ {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final GL7 A04;

    public E3q(GL7 gl7, FyG fyG) {
        super(gl7, fyG);
        this.A04 = gl7;
        Context A01 = FyG.A01(fyG);
        this.A03 = 1Bu.A01(A01, 68366);
        this.A01 = 1HG.A00(A01, 98361);
        this.A02 = 1HG.A00(A01, 98368);
        this.A00 = 1BK.A0D();
    }

    public static final void A00(2R2 r301, EQI eqi, E3q e3q, String str, Throwable th) {
        if (4YU.A1X(r301)) {
            Boolean A0K = AnonymousClass001.A0K();
            r301.A0B("client_enable_e2ee", A0K);
            r301.A0E("custom_update_event", "message_send_failure");
            C00i c00i = e3q.A01.A00;
            String str2 = null;
            Er6 er6 = FIJ.A04(c00i).A05.A03;
            if (er6 != null) {
                str2 = er6.A0g;
            }
            r301.A0E("game_id", str2);
            r301.A0B("is_e2ee", A0K);
            FIJ.A05(r301, c00i);
            DKI.A0U(eqi, r301, th);
        }
        FIT fit = (FIT) 1Br.A0B(e3q.A02);
        if (str == null) {
            str = th.getMessage();
            if (str == null) {
                str = AnonymousClass000.A00(41);
            }
        }
        fit.A0I("armadillo_custom_update_error", str, th);
    }
}
