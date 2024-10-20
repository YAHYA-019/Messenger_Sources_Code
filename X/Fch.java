package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.locale.Country;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.graphql.executor.GraphQLResult;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.inject.FbInjector;
import com.facebook.payments.p2p.service.model.request.FetchPaymentRequestsParams;
import com.facebook.payments.p2p.service.model.transactions.DeclinePaymentParams;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: Fch.class */
public final class Fch implements CallerContextable {
    public static final 1G2 A0H = 1G0.A0B.A0F("fetch_clean_config/");
    public static final String __redex_internal_original_name = "PaymentProtocolUtil";
    public ListenableFuture A00;
    public ListenableFuture A01;
    public ListenableFuture A02;
    public ListenableFuture A04;
    public ListenableFuture A05;
    public String A06;
    public String A07;
    public final BlueServiceOperationFactory A08;
    public final Executor A0E;
    public final 1GU A0F;
    public final HashMap A0G = AnonymousClass001.A0u();
    public String A03 = null;
    public final C00i A0A = AbH.A0E();
    public final C00i A09 = 1BQ.A02(84635);
    public final C00i A0D = 1BV.A00(99134);
    public final C00i A0B = AbH.A0S();
    public final C00i A0C = FbInjector.A00;

    public Fch() {
        BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 1Bn.A0A(33031);
        1GU A0A = AbI.A0A();
        Executor A1D = AbJ.A1D();
        this.A08 = blueServiceOperationFactory;
        this.A0F = A0A;
        this.A0E = A1D;
    }

    public static Country A00(GraphQLResult graphQLResult) {
        Object obj;
        2JX A1h;
        2JX A1c;
        2JX A1b;
        String A0r;
        if (graphQLResult == null || (obj = ((AbstractC08294mh) graphQLResult).A03) == null || (A1h = ((2JX) obj).A1h()) == null || (A1c = A1h.A1c()) == null || (A1b = A1c.A1b()) == null || (A0r = A1b.A0r(1481071862)) == null) {
            return null;
        }
        return Country.A00(null, A0r);
    }

    public static 1IB A01(Bundle bundle, Fch fch, String str) {
        return AbK.A0H(bundle, CallerContext.A06(Fch.class), fch.A08, str);
    }

    public static ListenableFuture A02(FbUserSession fbUserSession, Fch fch, String str, String str2) {
        if (4DQ.A03(fch.A04) && str2 != null && str2.equals(fch.A06) && str.equals(fch.A07)) {
            return fch.A04;
        }
        if (4DQ.A03(fch.A04)) {
            fch.A04.cancel(true);
        }
        fch.A07 = str;
        fch.A06 = str2;
        C30G A0H2 = AbF.A0H(98);
        A0H2.A03("recipient_id", str);
        A0H2.A03("payment_method_credential_id", str2);
        C3sa A00 = C3sa.A00(A0H2);
        long j = ActionId.VIDEO_SET_RENDERER_CONTEXT;
        A00.A0A(j);
        A00.A09(j);
        AbstractC05414dq A09 = 1VX.A09(1BK.A04(fch.A0C), fbUserSession);
        4YV.A1B(A00);
        C03713yu A03 = A09.A03(A00);
        fch.A04 = A03;
        return A03;
    }

    public 1IB A03(Context context, String str, String str2, String str3) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable("declinePaymentParams", new DeclinePaymentParams(str, str2));
        return 1Ho.A00(this.A08.newInstance_DEPRECATED("decline_payment", A05, 0, AbH.A0B(this)).A06(new CfG(context, str3)), true);
    }

    public 2FT A04(EKm eKm) {
        FetchPaymentRequestsParams fetchPaymentRequestsParams = new FetchPaymentRequestsParams(eKm);
        Bundle A05 = 1BK.A05();
        A05.putParcelable("FetchPaymentRequestsParams", fetchPaymentRequestsParams);
        return Fvf.A00(A01(A05, this, 1BJ.A00(1311)), this, 36);
    }

    public ListenableFuture A05(FbUserSession fbUserSession) {
        if (!4DQ.A03(this.A05)) {
            AbstractC05414dq A09 = 1VX.A09(1BK.A04(this.A0C), fbUserSession);
            GraphQlQueryParamSet A0M = 7zL.A0M();
            A0M.A03("log_exposure_for_qe", true);
            C00i c00i = this.A0B;
            1Ql A0V = 1BL.A0V(c00i);
            1G2 r0 = A0H;
            1Ql.A01(A0V, r0, false);
            C3sa A0L = 7zM.A0L(A0M, new 2Jf(2JX.class, (Class) null, "P2pPaymentConfigQuery", (String) null, "fbandroid", 2098310970, 0, 2404697532L, 2404697532L, false, true));
            A0L.A0A(86400L);
            if (!1BK.A0R(c00i).AZn(r0, false)) {
                A0L.A09(86400L);
            }
            4YV.A1B(A0L);
            C03713yu A03 = A09.A03(A0L);
            this.A05 = A03;
            1Kd.A0E(FwJ.A00(fbUserSession, this, 32), A03);
        }
        return this.A05;
    }
}
