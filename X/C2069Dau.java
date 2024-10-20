package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.businessintegrity.gdpr.consents.GDPRConsentsActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.graphql.error.GraphQLError;
import com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter;
import com.facebook.payments.auth.pin.newpin.PaymentPinParams;
import com.facebook.payments.checkout.errors.dialog.PaymentsErrorActionDialog;
import com.facebook.payments.checkout.model.CheckoutCommonParams;
import com.facebook.payments.checkout.model.CheckoutCommonParamsCore;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.checkout.model.SimpleCheckoutData;
import com.facebook.payments.contactinfo.form.ContactInfoCommonFormParams;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.paymentmethods.cardform.CardFormParams;
import com.facebook.payments.paymentmethods.picker.PaymentMethodsPickerScreenConfig;
import com.facebook.payments.picker.model.SimplePickerRunTimeData;
import com.facebook.payments.ui.PaymentsErrorView;
import com.google.common.collect.ImmutableList;
import java.util.LinkedList;

/* renamed from: X.Dau, reason: case insensitive filesystem */
/* loaded from: Dau.class */
public final class C2069Dau extends 1RM {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C2069Dau(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0c4a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0c62  */
    /* JADX WARN: Type inference failed for: r0v846, types: [X.ETD, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void A02(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 7443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2069Dau.A02(java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r0v271, types: [X.ETD, java.lang.Object] */
    public void A03(Throwable th) {
        FlC flC;
        FIQ fiq;
        CheckoutCommonParams checkoutCommonParams;
        PaymentsLoggingSessionData paymentsLoggingSessionData;
        PaymentsFlowStep paymentsFlowStep;
        ImmutableList of;
        switch (this.A00) {
            case 0:
                1BK.A09(((FAM) this.A01).A05).softReport("Loading GDPR CONSENTS", th);
                GDPRConsentsActivity gDPRConsentsActivity = ((EcJ) this.A02).A00;
                ImmutableList immutableList = GDPRConsentsActivity.A0K;
                ((Evo) 4YU.A0p(gDPRConsentsActivity.A03)).A01(gDPRConsentsActivity.A06, "fail_loaded");
                GDPRConsentsActivity.A1D(gDPRConsentsActivity);
                return;
            case 1:
            case 2:
                11T.A0F(th, 0);
                ((0DR) this.A01).resumeWith(new 0DV(th));
                return;
            case 3:
                11T.A0F(th, 0);
                3zH r0 = (3zH) 1Br.A0B(((EKR) this.A02).A0C);
                String str = ((CallerContext) this.A01).A03;
                11T.A0A(str);
                r0.A01("fx_company_identity_switcher_linking_cache", str, th.getMessage());
                return;
            case 4:
                ((ElC) this.A02).A01.setVisibility(8);
                return;
            case 5:
                11T.A0F(th, 0);
                1Br.A04(((Bre) this.A02).A01).softReport("ComposerShortcutsInteractionGQLController", 0Pz.A0W("Can't get request mutation result for: ", ((ENj) this.A01).tag), th);
                return;
            case 6:
            case 7:
                return;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                ((1K9) this.A02).onFailure(th);
                return;
            case 13:
                FIe fIe = (FIe) this.A01;
                FHO fho = fIe.A08;
                Epd epd = fIe.A01;
                fho.A08(PaymentsFlowStep.A1K, epd.A03, epd.A04, th);
                epd.A01.A01(ServiceException.A00(th));
                return;
            case 14:
                EqO eqO = (EqO) this.A01;
                FHO fho2 = (FHO) eqO.A04.get();
                PaymentPinParams paymentPinParams = (PaymentPinParams) this.A02;
                fho2.A08(PaymentsFlowStep.A1K, paymentPinParams.A09, paymentPinParams.A0A, th);
                Eek eek = eqO.A01;
                if (eek != null) {
                    eek.A00.A02.setVisibility(8);
                    Eek eek2 = eqO.A01;
                    FI9.A01(eek2.A00.A01, ServiceException.A00(th), new E5o(eek2, 1));
                    return;
                }
                return;
            case 15:
                DZv dZv = (DZv) this.A01;
                dZv.A0B.A08(PaymentsFlowStep.A27, dZv.A04.paymentsLoggingSessionData, th);
                return;
            case 16:
                flC = (FlC) this.A01;
                fiq = flC.A07;
                checkoutCommonParams = ((SimpleCheckoutData) ((CheckoutData) this.A02)).A07;
                paymentsLoggingSessionData = checkoutCommonParams.A02.A0D.A00;
                paymentsFlowStep = PaymentsFlowStep.A0G;
                break;
            case 17:
                flC = (FlC) this.A01;
                fiq = flC.A07;
                checkoutCommonParams = ((SimpleCheckoutData) ((CheckoutData) this.A02)).A07;
                paymentsLoggingSessionData = checkoutCommonParams.A02.A0D.A00;
                paymentsFlowStep = PaymentsFlowStep.A0A;
                break;
            case 18:
                Eeu eeu = (Eeu) this.A02;
                GraphQLError graphQLErrorFromException = GraphServicesExceptionMigrationAdapter.getGraphQLErrorFromException(th);
                if (graphQLErrorFromException != null && graphQLErrorFromException.code == 2078111) {
                    FIt fIt = eeu.A00;
                    Ex2 ex2 = fIt.A0E;
                    CheckoutCommonParamsCore A0X = DKF.A0X(fIt.A04);
                    PaymentsErrorActionDialog A01 = ex2.A01(A0X.A0D.A00, A0X.A0M, th);
                    A01.A03 = new Flh(eeu);
                    fIt.A05.A09(A01);
                }
                eeu.A00.A08();
                return;
            case 19:
                FHw fHw = (FHw) this.A01;
                GK2 gk2 = fHw.A03;
                if (gk2 != null) {
                    gk2.C0Q(th);
                }
                fHw.A04();
                return;
            case 20:
                FHw fHw2 = (FHw) this.A01;
                GK2 gk22 = fHw2.A03;
                if (gk22 != null) {
                    gk22.C0Q(th);
                }
                fHw2.A04();
                FHw.A03(fHw2, PaymentsFlowStep.A1Y, "payflows_fail");
                return;
            case 21:
                FHw fHw3 = (FHw) this.A01;
                FHw.A03(fHw3, PaymentsFlowStep.A1a, "payflows_fail");
                FHw.A01((FbUserSession) this.A02, fHw3, fHw3.A05.A00);
                return;
            case 22:
                FmB fmB = (FmB) this.A01;
                FmA fmA = fmB.A04;
                fmB.A01.getString(2131954832);
                fmA.A01((ContactInfoCommonFormParams) this.A02, th, true);
                return;
            case 23:
                DYy dYy = ((EfB) this.A02).A00;
                DKF.A0Z(dYy.A07).A08(PaymentsFlowStep.A1T, dYy.A01, th);
                return;
            case 24:
                Elz elz = (Elz) this.A01;
                if (elz.A01) {
                    LinkedList linkedList = elz.A00;
                    1K9 r02 = (1K9) this.A02;
                    ?? obj = new Object();
                    ((ETD) obj).A01 = null;
                    ((ETD) obj).A02 = th;
                    ((ETD) obj).A00 = r02;
                    linkedList.add(obj);
                    return;
                }
                ((1K9) this.A02).onFailure(th);
                return;
            case 25:
                FIk fIk = (FIk) this.A01;
                CardFormParams cardFormParams = fIk.A02;
                CardFormParams.A04(cardFormParams, fIk);
                0fH.A0r("CardFormMutatorFragment", "Card failed to update card", th);
                1BK.A09(fIk.A07).softReport(cardFormParams.Abq().cardFormAnalyticsParams.A00, "Attempted to submit card form, but received a response with an error", th);
                2L0 A02 = 0G8.A02(2L0.class, th);
                if (A02 != null) {
                    DZd dZd = fIk.A03;
                    switch (A02.A00().mErrorSubCode) {
                        case 2078020:
                        case 2078021:
                            of = ImmutableList.of((Object) EL3.A02, (Object) EL3.A03);
                            break;
                        case 2078024:
                            of = ImmutableList.of((Object) EL3.A01);
                            break;
                        default:
                            of = ImmutableList.of();
                            break;
                    }
                    dZd.A1d();
                    1Du it = of.iterator();
                    CharSequence charSequence = null;
                    CharSequence charSequence2 = null;
                    while (it.hasNext()) {
                        EL3 el3 = (EL3) it.next();
                        if (charSequence != null || charSequence2 != null) {
                            DZd.A07(dZd);
                            return;
                        }
                        int ordinal = el3.ordinal();
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 0 && dZd.A0O.getVisibility() == 0) {
                                    dZd.A0O.A0m();
                                    charSequence = 7zO.A0D(dZd).getString(2131964022);
                                }
                            } else if (dZd.A0K.getVisibility() == 0) {
                                dZd.A0P.A0m();
                                dZd.A0K.A0m();
                                charSequence2 = 4YU.A0u(7zO.A0D(dZd), Integer.valueOf(7zQ.A05(AbM.A0u(dZd.A0K.A03))), 2131964021);
                            }
                        } else if (dZd.A0P.getVisibility() == 0) {
                            dZd.A0P.A0m();
                            charSequence = 4YU.A0u(7zO.A0D(dZd), Integer.valueOf(7zQ.A05(AbM.A0u(dZd.A0P.A03))), 2131964023);
                        }
                    }
                    if (charSequence != null) {
                        EBe eBe = dZd.A0T;
                        if (eBe != null) {
                            eBe.setVisibility(0);
                            dZd.A0i = true;
                        }
                        PaymentsErrorView paymentsErrorView = dZd.A0T;
                        paymentsErrorView.A00.setVisibility(0);
                        paymentsErrorView.A00.setText(charSequence);
                        return;
                    }
                    if (charSequence2 != null) {
                        EBe eBe2 = dZd.A0U;
                        if (eBe2 != null) {
                            eBe2.setVisibility(0);
                            dZd.A0i = true;
                        }
                        PaymentsErrorView paymentsErrorView2 = dZd.A0U;
                        paymentsErrorView2.A00.setVisibility(0);
                        paymentsErrorView2.A00.setText(charSequence2);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Fo0 fo0 = (Fo0) this.A01;
                fo0.A01.A00();
                fo0.A05.A07(PaymentsFlowStep.A06, ((PaymentMethodsPickerScreenConfig) ((SimplePickerRunTimeData) this.A02).A01).A00.analyticsParams.paymentsLoggingSessionData, "payflows_fail");
                return;
            case 27:
            case 28:
                ((GIT) this.A02).onFailure(th);
                return;
        }
        fiq.A07(paymentsFlowStep, paymentsLoggingSessionData, "payflows_fail");
        FlC.A01(flC, checkoutCommonParams, th);
    }
}
