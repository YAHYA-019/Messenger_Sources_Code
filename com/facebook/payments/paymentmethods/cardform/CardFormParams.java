package com.facebook.payments.paymentmethods.cardform;

import X.C00i;
import X.DZd;
import X.EuD;
import X.FIk;
import X.GKW;
import android.os.Parcelable;

/* loaded from: CardFormParams.class */
public interface CardFormParams extends Parcelable {
    static CardFormCommonParams A00(DZd dZd) {
        return dZd.A0F.A02.Abq();
    }

    static CardFormCommonParams A01(FIk fIk) {
        return fIk.A02.Abq();
    }

    static CardFormCommonParams A02(FIk fIk) {
        fIk.A02.Abq().getClass();
        return fIk.A02.Abq();
    }

    static GKW A03(C00i c00i, FIk fIk) {
        return ((EuD) c00i.get()).A00(fIk.A02.Abq().cardFormStyle);
    }

    static void A04(CardFormParams cardFormParams, FIk fIk) {
        if (cardFormParams.Abq().cardFormStyleParams.hideLoadingState) {
            return;
        }
        fIk.A03.A1X();
    }

    CardFormCommonParams Abq();
}
