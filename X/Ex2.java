package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.graphql.error.GraphQLError;
import com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.payments.checkout.errors.dialog.PaymentsErrorActionDialog;
import com.facebook.payments.checkout.errors.model.CallToAction;
import com.facebook.payments.checkout.errors.model.PaymentsError;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import java.io.IOException;
import java.util.HashSet;

/* loaded from: Ex2.class */
public final class Ex2 {
    public 1BY A00;
    public final Ewl A02 = (Ewl) 1Bn.A0B(99327);
    public final Context A01 = 7zP.A0J();
    public final FIQ A03 = DKG.A0i();

    public Ex2(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.fragment.app.Fragment, com.facebook.payments.checkout.errors.dialog.PaymentsErrorActionDialog] */
    public PaymentsErrorActionDialog A00(2JX r302, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType) {
        PaymentsError A01 = this.A02.A01(r302, paymentItemType);
        Bundle A05 = 1BK.A05();
        A05.putParcelable("extra_payment_error_model", A01);
        A05.putParcelable("extra_payment_logging_session_data", paymentsLoggingSessionData);
        ?? paymentsErrorActionDialog = new PaymentsErrorActionDialog();
        paymentsErrorActionDialog.setArguments(A05);
        return paymentsErrorActionDialog;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.fragment.app.Fragment, com.facebook.payments.checkout.errors.dialog.PaymentsErrorActionDialog] */
    public PaymentsErrorActionDialog A01(PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, Throwable th) {
        PaymentsError A00;
        2L0 A02 = 0G8.A02(2L0.class, th);
        if (A02 != null) {
            try {
                24X A0I = new AnonymousClass244().A0I(A02.A00().A02());
                Ewl ewl = this.A02;
                String A002 = MRk.A00(70);
                0RZ.A04(A0I.A0Z(A002));
                PaymentsError paymentsError = (PaymentsError) ewl.A00.A0T(PaymentsError.class, A0I.A0C(A002));
                paymentsError.getClass();
                int i = paymentsError.A00;
                String str = paymentsError.A05;
                String str2 = paymentsError.A06;
                String str3 = paymentsError.A07;
                String str4 = paymentsError.A08;
                Qug qug = paymentsError.A03;
                CallToAction callToAction = paymentsError.A01;
                CallToAction callToAction2 = paymentsError.A02;
                HashSet A1E = AbF.A1E(paymentsError.A09);
                new PaymentsError(callToAction, callToAction2, qug, paymentItemType, str, str2, str3, str4, C1pq.A07(paymentItemType, "paymentItemType", A1E, A1E), i);
            } catch (IOException | IllegalArgumentException | NullPointerException e) {
                if (e instanceof IllegalArgumentException) {
                    this.A03.A08(PaymentsFlowStep.A2X, paymentsLoggingSessionData, th);
                }
                ApiErrorResult apiErrorResult = A02.result;
                String str5 = apiErrorResult.mErrorUserTitle;
                String A04 = apiErrorResult.A04();
                GraphQLError graphQLErrorFromException = GraphServicesExceptionMigrationAdapter.getGraphQLErrorFromException(A02);
                if (str5 == null && graphQLErrorFromException != null) {
                    str5 = graphQLErrorFromException.summary;
                }
                if (A04 == null && graphQLErrorFromException != null) {
                    A04 = graphQLErrorFromException.description;
                }
                HashSet A0v = AnonymousClass001.A0v();
                if (str5 == null) {
                    str5 = this.A01.getResources().getString(2131954182);
                }
                C1pq.A08("errorTitle", str5);
                if (A04 == null) {
                    A04 = this.A01.getResources().getString(2131954181);
                }
                C1pq.A08("errorDescription", A04);
                A00 = new PaymentsError(new CallToAction(new RRA()), null, null, null, A04, str5, null, "", 4YV.A0z("primaryCta", A0v, A0v), 0);
            }
        } else {
            A00 = this.A02.A00();
        }
        Bundle A05 = 1BK.A05();
        A05.putParcelable("extra_payment_error_model", A00);
        A05.putParcelable("extra_payment_logging_session_data", paymentsLoggingSessionData);
        ?? paymentsErrorActionDialog = new PaymentsErrorActionDialog();
        paymentsErrorActionDialog.setArguments(A05);
        return paymentsErrorActionDialog;
    }
}
