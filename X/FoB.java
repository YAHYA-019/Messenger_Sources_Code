package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebook.payments.decorator.PaymentsDecoratorAnimation;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.p2p.util.P2pCardFormParams;
import com.facebook.payments.paymentmethods.cardform.CardFormActivity;
import com.facebook.payments.paymentmethods.cardform.CardFormAnalyticsParams;
import com.facebook.payments.paymentmethods.cardform.CardFormCommonParams;
import com.facebook.payments.paymentmethods.cardform.CardFormParams;
import com.facebook.payments.paymentmethods.cardform.CardFormStyle;
import com.facebook.payments.paymentmethods.cardform.CardFormStyleParams;
import com.facebook.payments.paymentmethods.model.NewCreditCardOption;
import com.facebook.payments.paymentmethods.model.NewPayPalOption;
import com.facebook.payments.paymentmethods.model.NewPaymentOption;
import com.facebook.payments.paymentmethods.model.PaymentMethodsInfo;
import com.facebook.payments.paymentmethods.picker.PaymentMethodsPickerScreenConfig;
import com.facebook.payments.paymentmethods.picker.model.PaymentMethodsCoreClientData;
import com.facebook.payments.paymentmethods.picker.model.PaymentMethodsPickerRunTimeData;
import com.facebook.payments.picker.model.PickerRunTimeData;
import com.facebook.payments.picker.model.PickerScreenAnalyticsParams;
import com.facebook.payments.picker.model.PickerScreenCommonConfig;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarStyle;
import com.facebook.payments.ui.titlebar.model.PaymentsTitleBarTitleStyle;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

/* loaded from: FoB.class */
public final class FoB implements GFr {
    public 1BY A00;
    public final Context A01 = AbF.A04((1BY) null);
    public final FoC A03 = (FoC) 1Bn.A0E((Context) null, (1BY) null, 98942);
    public final C00i A02 = 1BV.A01((1BY) null, 67860);

    public FoB(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.GFr
    public /* bridge */ /* synthetic */ ImmutableList B8M(PickerRunTimeData pickerRunTimeData, ImmutableList immutableList) {
        Ruz rv5;
        PaymentMethodsPickerRunTimeData paymentMethodsPickerRunTimeData = (PaymentMethodsPickerRunTimeData) pickerRunTimeData;
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            Qv0 qv0 = (Qv0) it.next();
            if (qv0.ordinal() != 4) {
                this.A03.A02(paymentMethodsPickerRunTimeData, qv0, A0h);
            } else {
                PaymentMethodsInfo paymentMethodsInfo = ((PaymentMethodsCoreClientData) paymentMethodsPickerRunTimeData.A00).A00;
                PaymentMethodsPickerScreenConfig paymentMethodsPickerScreenConfig = (PaymentMethodsPickerScreenConfig) paymentMethodsPickerRunTimeData.A01;
                1Du it2 = paymentMethodsInfo.A02.iterator();
                while (it2.hasNext()) {
                    NewPayPalOption newPayPalOption = (NewPaymentOption) it2.next();
                    ImmutableList immutableList2 = paymentMethodsPickerScreenConfig.A01;
                    ERH A01 = newPayPalOption.A01();
                    if (!immutableList2.contains(A01)) {
                        PickerScreenCommonConfig pickerScreenCommonConfig = paymentMethodsPickerScreenConfig.A00;
                        int ordinal = A01.ordinal();
                        if (ordinal == 3) {
                            NewCreditCardOption newCreditCardOption = (NewCreditCardOption) newPayPalOption;
                            String str = null;
                            PaymentsDecoratorParams paymentsDecoratorParams = pickerScreenCommonConfig.styleParams.paymentsDecoratorParams;
                            PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle = paymentsDecoratorParams.paymentsTitleBarTitleStyle;
                            String str2 = paymentsDecoratorParams.paymentsTitleBarButtonText;
                            Optional optional = paymentsDecoratorParams.A00;
                            boolean z = paymentsDecoratorParams.isFullScreenModal;
                            String str3 = paymentsDecoratorParams.paymentsPayBarButtonText;
                            if (str3 != null) {
                                str = str3;
                            }
                            PaymentsDecoratorParams paymentsDecoratorParams2 = new PaymentsDecoratorParams(PaymentsDecoratorAnimation.A01, PaymentsTitleBarStyle.A04, paymentsTitleBarTitleStyle, optional, str, str2, z);
                            PaymentsDecoratorParams.A02();
                            CardFormStyleParams cardFormStyleParams = new CardFormStyleParams(paymentsDecoratorParams2, null, newCreditCardOption.mTitle, false, false, false, false, false, false);
                            CardFormStyle cardFormStyle = CardFormStyle.P2P_PAY_ADD;
                            PaymentsFlowStep paymentsFlowStep = PaymentsFlowStep.A03;
                            PickerScreenAnalyticsParams pickerScreenAnalyticsParams = pickerScreenCommonConfig.analyticsParams;
                            CardFormAnalyticsParams cardFormAnalyticsParams = new CardFormAnalyticsParams(paymentsFlowStep, pickerScreenAnalyticsParams.paymentsLoggingSessionData, pickerScreenAnalyticsParams.trigger);
                            PaymentItemType paymentItemType = pickerScreenCommonConfig.paymentItemType;
                            PaymentsDecoratorParams.A02();
                            Parcelable.Creator creator = Country.CREATOR;
                            Country country = paymentMethodsInfo.A00;
                            if (country == null) {
                                country = Country.A01;
                            }
                            Intent A12 = CardFormActivity.A12(this.A01, (CardFormParams) new P2pCardFormParams(new CardFormCommonParams(country, paymentItemType, cardFormAnalyticsParams, cardFormStyle, cardFormStyleParams, null, newCreditCardOption, true, false, false), (String) null, false, false, false, false));
                            String str4 = newCreditCardOption.mTitle;
                            C00i c00i = this.A02;
                            c00i.get();
                            A0h.m11011add((Object) new Rv2(A12, newCreditCardOption.mAvailableFbPaymentCardTypes, str4));
                            if (2yD.A03(DKH.A0T(c00i), 36312870456398939L)) {
                                rv5 = new Ruz(A12, newCreditCardOption.mAvailableFbPaymentCardTypes);
                                A0h.m11011add((Object) rv5);
                            }
                        } else if (ordinal != 6) {
                            this.A03.A01(newPayPalOption, paymentMethodsInfo, pickerScreenCommonConfig, A0h);
                        } else {
                            NewPayPalOption newPayPalOption2 = newPayPalOption;
                            String str5 = newPayPalOption2.A02;
                            this.A02.get();
                            rv5 = new Rv5(this.A03.A00(newPayPalOption2, pickerScreenCommonConfig), pickerScreenCommonConfig.analyticsParams.paymentsLoggingSessionData, pickerScreenCommonConfig.paymentItemType, str5);
                            A0h.m11011add((Object) rv5);
                        }
                    }
                }
            }
        }
        return A0h.build();
    }
}
