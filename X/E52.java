package X;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.payments.auth.pin.model.PaymentPin;
import com.facebook.payments.auth.pin.newpin.PaymentPinParams;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: E52.class */
public final class E52 extends EKZ {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public E52(int r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r302
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L45;
                case 2: goto L4d;
                case 3: goto L55;
                case 4: goto L5d;
                case 5: goto L65;
                case 6: goto L6d;
                default: goto L30;
            }
        L30:
            java.lang.String r0 = "RESET_CVV_PAYPAL"
            r303 = r0
            r0 = 7
            r304 = r0
        L36:
            r0 = r301
            r1 = r303
            r2 = r304
            r0.<init>(r1, r2)
            return
        L3d:
            java.lang.String r0 = "ENTER_PIN"
            r303 = r0
            r0 = 0
            r304 = r0
            goto L36
        L45:
            java.lang.String r0 = "ENTER_PIN_V2"
            r303 = r0
            r0 = 1
            r304 = r0
            goto L36
        L4d:
            java.lang.String r0 = "ENTER_PASSWORD"
            r303 = r0
            r0 = 2
            r304 = r0
            goto L36
        L55:
            java.lang.String r0 = "ENTER_PASSWORD_V2"
            r303 = r0
            r0 = 3
            r304 = r0
            goto L36
        L5d:
            java.lang.String r0 = "ENTER_PASSWORD_V3"
            r303 = r0
            r0 = 4
            r304 = r0
            goto L36
        L65:
            java.lang.String r0 = "CONFIRMATION_V2"
            r303 = r0
            r0 = 5
            r304 = r0
            goto L36
        L6d:
            java.lang.String r0 = "PIN_LOCKED"
            r303 = r0
            r0 = 6
            r304 = r0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E52.<init>(int):void");
    }

    public static Bundle A00(String str, String str2, int i) {
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putInt("page_id", i);
        bundle.putString("savedTitleText", str);
        bundle.putString("savedSubtitleText", str2);
        return bundle;
    }

    public Fragment A01(Resources resources, PaymentPinParams paymentPinParams, ENy eNy, int i) {
        1pK r306;
        PaymentPinParams paymentPinParams2 = paymentPinParams;
        switch (this.A00) {
            case 0:
                String str = paymentPinParams.A0E;
                if (str == null) {
                    str = resources.getString(eNy.mHeaderTextResId);
                }
                float f = paymentPinParams2.A00;
                int i2 = eNy.mExplanationTextResId;
                String string = i2 != 0 ? resources.getString(i2) : null;
                boolean z = eNy.mShowForgotLink;
                boolean z2 = eNy.mShowSkipLink;
                Bundle A05 = 1BK.A05();
                A05.putString("savedHeaderText", str);
                A05.putFloat("savedHeaderTextSizePx", f);
                A05.putString("savedExplanationText", string);
                A05.putInt("savedTag", i);
                A05.putBoolean("forgetLink", z);
                A05.putBoolean("skipLink", z2);
                r306 = new Q4m();
                r306.setArguments(A05);
                break;
            case 1:
                int i3 = eNy.mPageId;
                String string2 = resources.getString(eNy.mActionBarTitleResId);
                String string3 = resources.getString(eNy.mHeaderTextResId);
                int i4 = eNy.mExplanationTextResId;
                String string4 = i4 != 0 ? resources.getString(i4) : null;
                boolean z3 = eNy.mShowForgotLink;
                boolean z4 = eNy.mShowSkipLink;
                boolean z5 = eNy.mIsNuxFlow;
                String str2 = eNy.mAuthFlowStepType;
                Bundle A052 = 1BK.A05();
                A052.putInt("page_id", i3);
                A052.putString("savedHeaderTitle", string2);
                A052.putString("savedHeaderSubtitle", string3);
                A052.putString("savedActionText", string4);
                A052.putBoolean("savedShowForgetPinButton", z3);
                A052.putBoolean("savedShowSkipButton", z4);
                A052.putBoolean("savedIsNuxFlow", z5);
                A052.putInt("savedTag", i);
                A052.putParcelable("savedPaymentParams", paymentPinParams2);
                if (!TextUtils.isEmpty(paymentPinParams2.A0B)) {
                    A052.putBundle("savedAuthContentParams", R2g.A00(paymentPinParams2, str2));
                }
                r306 = new DZp();
                r306.setArguments(A052);
                break;
            case 2:
                String str3 = paymentPinParams.A0E;
                if (str3 == null) {
                    str3 = resources.getString(eNy.mHeaderTextResId);
                }
                str3.getClass();
                Bundle A053 = 1BK.A05();
                A053.putString("savedHeaderText", str3);
                A053.putInt("savedTag", i);
                r306 = new 1pK();
                r306.setArguments(A053);
                break;
            case 3:
                int i5 = eNy.mPageId;
                String string5 = resources.getString(eNy.mActionBarTitleResId);
                String string6 = resources.getString(eNy.mHeaderTextResId);
                String string7 = resources.getString(eNy.mExplanationTextResId);
                Bundle A00 = A00(string5, string6, i5);
                A00.putString("savedActionButtonText", string7);
                A00.putInt("savedTag", i);
                A00.putParcelable("savedPaymentParams", paymentPinParams);
                r306 = new 1pK();
                r306.setArguments(A00);
                break;
            case 4:
                int i6 = eNy.mPageId;
                String string8 = resources.getString(eNy.mActionBarTitleResId);
                String string9 = resources.getString(eNy.mHeaderTextResId);
                String string10 = resources.getString(eNy.mExplanationTextResId);
                Bundle A002 = A00(string8, string9, i6);
                A002.putString("savedActionButtonText", string10);
                A002.putInt("savedTag", i);
                A002.putParcelable("savedPaymentParams", paymentPinParams);
                if (TextUtils.isEmpty(paymentPinParams.A0B)) {
                    EO0 eo0 = paymentPinParams.A06;
                    PaymentsDecoratorParams.A02();
                    PaymentsDecoratorParams paymentsDecoratorParams = paymentPinParams.A08;
                    PaymentPin paymentPin = paymentPinParams.A05;
                    Intent intent = paymentPinParams.A01;
                    String str4 = paymentPinParams.A0E;
                    boolean z6 = paymentPinParams.A0G;
                    boolean z7 = paymentPinParams.A0F;
                    float f2 = paymentPinParams.A00;
                    PaymentsLoggingSessionData paymentsLoggingSessionData = paymentPinParams.A09;
                    PaymentItemType paymentItemType = paymentPinParams.A0A;
                    Bundle bundle = paymentPinParams.A02;
                    String str5 = paymentPinParams.A0D;
                    paymentPinParams2 = new PaymentPinParams(intent, bundle, paymentPinParams.A03, paymentPinParams.A04, paymentPin, eo0, paymentPinParams.A07, paymentsDecoratorParams, paymentsLoggingSessionData, paymentItemType, "LOCKED_PIN_RECOVER_WITH_PASSWORD_HUB", paymentPinParams.A0C, str5, str4, f2, z7, z6);
                }
                A002.putBundle("savedAuthContentParams", R2g.A00(paymentPinParams2, "RECOVER_PIN"));
                r306 = new DZs();
                r306.setArguments(A002);
                break;
            case 5:
                int i7 = eNy.mPageId;
                String string11 = resources.getString(eNy.mActionBarTitleResId);
                String string12 = resources.getString(eNy.mHeaderTextResId);
                String string13 = resources.getString(eNy.mExplanationTextResId);
                Bundle A003 = A00(string11, string12, i7);
                A003.putString("savedConfirmationText", string13);
                A003.putInt("savedTag", i);
                A003.putParcelable("savedPaymentParams", paymentPinParams);
                r306 = new 1pK();
                r306.setArguments(A003);
                break;
            case 6:
                Bundle A004 = A00(resources.getString(eNy.mActionBarTitleResId), resources.getString(eNy.mHeaderTextResId), eNy.mPageId);
                A004.putInt("savedPinLockedFragment", i);
                r306 = new 1pK();
                r306.setArguments(A004);
                break;
            default:
                FAC A0B = C06014fk.A0B();
                Bundle A054 = 1BK.A05();
                A054.putString("AUTH_PURPOSE", "PIN_RECOVERY");
                A054.putString("PAYMENT_TYPE", paymentPinParams.A0A.mValue);
                EYG.A00(A054);
                r306 = A0B.A05.A00(A054, "PIN_RESET_BY_CVV_PAYPAL");
                break;
        }
        return (Fragment) r306;
    }
}
