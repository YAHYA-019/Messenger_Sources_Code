package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import java.util.Arrays;
import java.util.List;

/* loaded from: F6p.class */
public final class F6p {
    public Context A00;
    public FbUserSession A01;
    public DMV A02;
    public 1BY A03;
    public Eq9 A04;
    public FKD A05;
    public final C00i A08;
    public final C00i A0B;
    public final C00i A0C;
    public final C00i A0E;
    public final List A09 = Arrays.asList("frx_flow_show_loading_indicator", "frx_flow_hide_loading_indicator", "frx_flow_close", "frx_flow_feedback_submitted", "frx_flow_done", "frx_send_message_action", "frx_flow_show_error_state", "frx_dismiss_uf");
    public final C15h A0A = G7K.A01(this, ActionId.RTMP_CONNECTION_INTERCEPTED);
    public final C00i A0D = 1BQ.A00();
    public final C00i A07 = 1BQ.A02(98500);
    public final 1Gx A06 = new Fco(this, 2);

    public F6p(1BO r302) {
        this.A0B = 1BV.A01(this.A03, 98808);
        this.A0C = 1BV.A01(this.A03, 98443);
        this.A08 = 1BV.A01(this.A03, 98501);
        this.A0E = 1BV.A01(this.A03, 147959);
        this.A03 = 7zL.A0Q(r302);
        C1F6 c1f6 = (C1F6) 1Bn.A0B(988);
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            FKD fkd = new FKD(this);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A05 = fkd;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0374, code lost:
    
        if (r307 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(X.F6p r301, java.lang.Integer r302) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F6p.A00(X.F6p, java.lang.Integer):void");
    }
}
