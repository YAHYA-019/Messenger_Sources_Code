package X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.graphql.error.GraphQLError;
import com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter;
import com.facebook.messaging.business.informationidentify.activity.PIIActivity;
import com.facebook.messaging.professionalservices.booking.calendar.CalendarExportUpsellActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.p2p.phases.PaymentPhaseActivity;
import com.facebook.payments.paymentmethods.cardform.CardFormParams;
import com.facebook.zero.zerobalance.ZeroBalanceResultForPreFetchRecommendationsController;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

/* renamed from: X.Db8, reason: case insensitive filesystem */
/* loaded from: Db8.class */
public final class C2083Db8 extends 1RM {
    public final int A00;
    public final Object A01;

    public C2083Db8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C2083Db8 A00(Object obj, int i) {
        return new C2083Db8(obj, i);
    }

    public static Object A01(C2083Db8 c2083Db8, Object obj) {
        11T.A0F(obj, 0);
        return c2083Db8.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:422:0x12aa, code lost:
    
        if (r0 != null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x22fc, code lost:
    
        if (r309 != null) goto L688;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0c96  */
    /* JADX WARN: Type inference failed for: r0v1687, types: [X.E1z, androidx.fragment.app.Fragment, X.BJB, X.E1T] */
    /* JADX WARN: Type inference failed for: r0v1774, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2585, types: [X.Qwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v753, types: [androidx.fragment.app.Fragment, X.Da7] */
    /* JADX WARN: Type inference failed for: r0v757, types: [X.08f, X.08d] */
    /* JADX WARN: Type inference failed for: r316v14, types: [org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r316v9, types: [org.json.JSONArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 11700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2083Db8.A02(java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v388, types: [X.E1z, androidx.fragment.app.Fragment, X.BJB, X.E1T] */
    public void A03(Throwable th) {
        F8L A0R;
        String obj;
        String str;
        Context context;
        E5o e5o;
        FJB fjb;
        String str2;
        String str3;
        Context context2;
        EwN ewN;
        MigColorScheme migColorScheme;
        boolean z;
        DialogInterface.OnClickListener onClickListener;
        String str4;
        switch (this.A00) {
            case 0:
            case 14:
                return;
            case 1:
                PIIActivity pIIActivity = (PIIActivity) this.A01;
                DKF.A0R(pIIActivity.A0Z).A01("pii_single_page_query_failure", th.toString());
                pIIActivity.A3E(pIIActivity.A0U, pIIActivity.getResources().getString(2131960104), pIIActivity.getResources().getString(2131964571));
                return;
            case 2:
                PIIActivity pIIActivity2 = (PIIActivity) this.A01;
                DKF.A0R(pIIActivity2.A0Z).A01("pii_initial_query_failure", th.toString());
                pIIActivity2.A3E(pIIActivity2.A0T, pIIActivity2.getResources().getString(2131960104), pIIActivity2.getResources().getString(2131964571));
                1BK.A0U(pIIActivity2.A0d).markerEnd(508639163, (short) 3);
                return;
            case 3:
                A0R = DKF.A0R(((EnU) this.A01).A02);
                obj = th.toString();
                str = "pii_form_status_mutation_failure";
                A0R.A01(str, obj);
                return;
            case 4:
                A0R = DKF.A0R(((EnV) this.A01).A02);
                obj = th.toString();
                str = "pii_nux_mutation_failure";
                A0R.A01(str, obj);
                return;
            case 5:
                E1M e1m = (E1M) this.A01;
                e1m.A1d();
                context2 = e1m.getContext();
                if (context2 != null) {
                    ewN = (EwN) 1Br.A0B(e1m.A0A);
                    migColorScheme = ((BJB) e1m).A01;
                    11T.A0A(migColorScheme);
                    z = true;
                    onClickListener = e1m.A08;
                    str4 = "FxCalSettingsHomeQueryResponse failure";
                    ewN.A01(context2, onClickListener, migColorScheme, str4, z);
                    return;
                }
                return;
            case 6:
                E1R e1r = (E1R) this.A01;
                e1r.A1d();
                ewN = (EwN) e1r.A0A.get();
                context2 = e1r.getContext();
                migColorScheme = ((BJB) e1r).A01;
                onClickListener = e1r.A07;
                z = true;
                str4 = "FxCalSettingsDetailsQueryResponse failure";
                ewN.A01(context2, onClickListener, migColorScheme, str4, z);
                return;
            case 7:
                E1L e1l = (E1L) this.A01;
                e1l.A1d();
                context2 = e1l.getContext();
                if (context2 != null) {
                    ewN = (EwN) 1Br.A0B(e1l.A04);
                    migColorScheme = ((BJB) e1l).A01;
                    11T.A0A(migColorScheme);
                    z = true;
                    onClickListener = e1l.A03;
                    str4 = "FxCalSettingsAccountsQueryResponse failure";
                    ewN.A01(context2, onClickListener, migColorScheme, str4, z);
                    return;
                }
                return;
            case 8:
                ?? r0 = (E1T) this.A01;
                r0.A1d();
                ewN = DKG.A0a((E1T) r0);
                context2 = r0.getContext();
                migColorScheme = ((BJB) r0).A01;
                onClickListener = r0.A0C;
                z = true;
                str4 = "FxCalSettingsDetailsQueryResponse failure";
                ewN.A01(context2, onClickListener, migColorScheme, str4, z);
                return;
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                CalendarExportUpsellActivity calendarExportUpsellActivity = (CalendarExportUpsellActivity) this.A01;
                CalendarExportUpsellActivity.A1G(calendarExportUpsellActivity, false);
                CalendarExportUpsellActivity.A1D(calendarExportUpsellActivity);
                return;
            case 13:
                DZK dzk = (DZK) this.A01;
                DKG.A0d(dzk).A08(PaymentsFlowStep.A1b, dzk.A09, PaymentItemType.A0W, th);
                dzk.A0H = false;
                if (dzk.mView != null) {
                    FI9.A01(dzk.A00, ServiceException.A00(th), new E5o(dzk, 2));
                    return;
                }
                return;
            case 15:
                1BK.A1E(((FHw) this.A01).A0A).execute(new G0W(this));
                return;
            case 16:
                DS7 ds7 = (DS7) this.A01;
                DS7.A00(ds7, DKE.A12(th));
                C00i c00i = ds7.A09;
                DKF.A0J(c00i).A00(ds7.A04, 1BK.A0d());
                DKF.A0J(c00i).A00(ds7.A06, EL1.A01);
                return;
            case 17:
                Iterator it = ((FlA) this.A01).A01.A00.iterator();
                while (it.hasNext()) {
                    ((GK0) it.next()).BqM(th);
                }
                return;
            case 18:
                Iterator it2 = ((FlA) this.A01).A01.A00.iterator();
                while (it2.hasNext()) {
                    ((GK0) it2.next()).CJS(th);
                }
                return;
            case 19:
                0fH.A0H(E5t.class, "Failed to fetch P2P post actions", th);
                return;
            case 20:
                Ev0 ev0 = (Ev0) this.A01;
                ev0.A00.getClass();
                ev0.A00.A00.A05.A00();
                EfK efK = ev0.A00;
                context = efK.A00.A00;
                e5o = new E5o(efK, 3);
                FI9.A04(context, e5o, th);
                return;
            case 22:
                GraphQLError graphQLErrorFromException = GraphServicesExceptionMigrationAdapter.getGraphQLErrorFromException(th);
                if (graphQLErrorFromException != null && graphQLErrorFromException.apiErrorCode == 10121) {
                    PaymentPhaseActivity paymentPhaseActivity = (PaymentPhaseActivity) ((FFY) this.A01).A01;
                    paymentPhaseActivity.A02.setVisibility(8);
                    paymentPhaseActivity.A03.setVisibility(8);
                    paymentPhaseActivity.A01.setVisibility(0);
                    PaymentPhaseActivity.A12(paymentPhaseActivity);
                    e5o = FI9.A00;
                    context = paymentPhaseActivity;
                    FI9.A04(context, e5o, th);
                    return;
                }
                break;
            case 21:
                Context context3 = (Context) ((FFY) this.A01).A01;
                if (th == null) {
                    FI9.A03(context3, new E5o(context3, 4));
                    return;
                }
                e5o = new E5o(context3, 5);
                context = context3;
                FI9.A04(context, e5o, th);
                return;
            case 23:
                FIk fIk = (FIk) this.A01;
                CardFormParams.A04(fIk.A02, fIk);
                return;
            case 24:
                ((DZb) this.A01).A1X();
                return;
            case 25:
                Foe foe = (Foe) this.A01;
                foe.A04.setVisibility(8);
                foe.A00.setAlpha(1.0f);
                DKF.A0Z(foe.A0G).A08(PaymentsFlowStep.A1r, foe.A07, th);
                return;
            case 26:
                ((EsQ) A01(this, th)).A00(th);
                return;
            case 27:
                EjR ejR = (EjR) A01(this, th);
                fjb = ejR.A00;
                FJB.A00(fjb).A0I("javascript_interface_error", "Could not fetch context players.", th);
                str2 = ejR.A01;
                str3 = "Failed to fetch context players";
                FJB.A06(fjb, str2, str3, "NETWORK_FAILURE");
                return;
            case 28:
                ((EtN) A01(this, th)).A00();
                return;
            case 29:
                ((Fpn) A01(this, th)).onFailure(th);
                return;
            case 30:
                ((Fpo) A01(this, th)).onFailure(th);
                return;
            case 31:
                ((GIW) A01(this, th)).onFailure(th);
                return;
            case 32:
                ((Fpm) A01(this, th)).onFailure(th);
                return;
            case 33:
                EmC emC = (EmC) A01(this, th);
                FJ0.A05(emC.A01, emC.A02, emC.A00 + 1);
                return;
            case 34:
            case 36:
                11T.A0F(th, 0);
                return;
            case 35:
                FJ0 fj0 = ((EjX) A01(this, th)).A01;
                Context context4 = fj0.A01;
                if (context4 != null) {
                    FJ0.A08(fj0, context4.getResources().getString(2131964083));
                    return;
                }
                return;
            case 37:
                EjP ejP = (EjP) A01(this, th);
                fjb = ejP.A00;
                FJB.A00(fjb).A0I("javascript_interface_error", "Could not fetch connected players.", th);
                str2 = ejP.A01;
                str3 = "Failed to fetch connected players";
                FJB.A06(fjb, str2, str3, "NETWORK_FAILURE");
                return;
            case 38:
                EjQ ejQ = (EjQ) A01(this, th);
                FJB fjb2 = ejQ.A00;
                FJB.A00(fjb2).A0I("javascript_interface_error", "Could not retrieve signed player info.", th);
                FJB.A06(fjb2, ejQ.A01, "Could not retrieve signed player info.", "NETWORK_FAILURE");
                return;
            case 39:
                Efs efs = (Efs) A01(this, th);
                AbG.A0B(efs.A00.A0M).Ciz(new G0d(efs));
                return;
            case 40:
                Ew5 ew5 = ((FHD) this.A01).A06;
                if (ew5 != null) {
                    DZV.A03(ew5.A00, true);
                    return;
                }
                return;
            case 41:
                6wL.A00((6wL) A01(this, th), (ImmutableList) null, th);
                return;
            case 42:
                0fH.A0A(FIP.class, "Exception on FetchZeroNTUpgradeDialogFutures.addCallback onNonCancellationFailure ");
                FuW fuW = (FuW) this.A01;
                DKF.A0j(fuW.A02.A09).A02("dialog_nt_fetch_failure", fuW.A03);
                return;
            case 43:
                ZeroBalanceResultForPreFetchRecommendationsController.A00(((FuT) this.A01).A00, 3600);
                return;
        }
    }

    public void A04(CancellationException cancellationException) {
        switch (this.A00) {
            case 42:
                0fH.A0A(FIP.class, "Exception on FetchZeroNTUpgradeDialogFutures.addCallback onCancel ");
                FuW fuW = (FuW) this.A01;
                DKF.A0j(fuW.A02.A09).A02("dialog_nt_fetch_failure", fuW.A03);
                return;
            case 43:
                ZeroBalanceResultForPreFetchRecommendationsController.A00(((FuT) this.A01).A00, 3600);
                return;
            default:
                super.A04(cancellationException);
                return;
        }
    }
}
