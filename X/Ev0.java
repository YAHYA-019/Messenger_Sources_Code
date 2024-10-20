package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.payments.p2p.paypal.P2pPaypalFundingOptionsParams;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.TreeMap;

/* loaded from: Ev0.class */
public final class Ev0 {
    public EfK A00;
    public P2pPaypalFundingOptionsParams A01;
    public String A02;
    public final Elx A04 = (Elx) 1Bi.A03(98986);
    public final C00i A03 = DKG.A0T();

    public void A00(FbUserSession fbUserSession) {
        ListenableFuture A00;
        this.A00.getClass();
        this.A01.getClass();
        Elx elx = this.A04;
        String A0t = DKF.A0t(this.A01.A00);
        P2pPaypalFundingOptionsParams p2pPaypalFundingOptionsParams = this.A01;
        String str = p2pPaypalFundingOptionsParams.A00.A00;
        String str2 = p2pPaypalFundingOptionsParams.A01;
        2Jd A0Q = DKC.A0Q();
        A0Q.A09("amount", A0t);
        A0Q.A09("currency", str);
        DKF.A1O(A0Q, "MOR_P2P_TRANSFER");
        A0Q.A09("paypal_ba_id", str2);
        if (4DQ.A03(elx.A01) && elx.A00 != null) {
            TreeMap treeMap = new TreeMap();
            GraphQlCallInput.A02(A0Q.A00, A0Q, treeMap);
            2Jd r0 = elx.A00;
            TreeMap treeMap2 = new TreeMap();
            GraphQlCallInput.A02(r0.A00, r0, treeMap2);
            if (treeMap.equals(treeMap2)) {
                A00 = elx.A01;
                this.A00.A00.A05.A01();
                DKF.A0h(this.A03).A04(C2083Db8.A00(this, 20), A00, "fetch_paypal_funding_options_key");
            }
        }
        if (4DQ.A03(elx.A01)) {
            elx.A01.cancel(true);
        }
        C30G A0H = AbF.A0H(100);
        DKC.A1S(A0Q, A0H, "query_params");
        C3sa A002 = C3sa.A00(A0H);
        elx.A00 = A0Q;
        AbstractC05414dq A08 = 1VX.A08(elx.A02, fbUserSession);
        4YV.A1B(A002);
        A00 = Fvf.A00(A08.A03(A002), elx, 23);
        elx.A01 = A00;
        this.A00.A00.A05.A01();
        DKF.A0h(this.A03).A04(C2083Db8.A00(this, 20), A00, "fetch_paypal_funding_options_key");
    }
}
