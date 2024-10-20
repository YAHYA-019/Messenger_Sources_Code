package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.payments.logging.PaymentsFlowStep;

/* loaded from: G2a.class */
public final class G2a implements Runnable {
    public static final String __redex_internal_original_name = "SimplePaymentsPollingGraphQLMutator$5";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ FHw A01;

    public G2a(FbUserSession fbUserSession, FHw fHw) {
        this.A01 = fHw;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public void run() {
        FHw fHw = this.A01;
        FbUserSession fbUserSession = this.A00;
        if (fHw.A03 == null || !fHw.A06.A02.equals("IN_PROGRESS")) {
            return;
        }
        FHw.A03(fHw, PaymentsFlowStep.A1a, "payflows_api_init");
        C30G A0H = AbF.A0H(97);
        A0H.A03("input", fHw.A06.A01.A00);
        A0H.A03("data", DKG.A0j(fHw.A04).sessionId);
        5iG A0h = DKF.A0h(fHw.A0B);
        1Vd A0I = AbK.A0I(fHw.A02);
        C3sa A0L = AbK.A0L(A0H);
        A0L.A0B = false;
        4YU.A1J(A0L, 499241737444974L);
        A0h.A04(new C2069Dau(fbUserSession, fHw, 21), AeR.A01(A0I.A09(A0L)), "payments_session_status_polling_query");
    }
}
