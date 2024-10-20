package com.facebook.payments.paymentmethods.cardform;

import X.1BL;
import X.C53v;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;

/* loaded from: CardFormAnalyticsParams.class */
public final class CardFormAnalyticsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(43);
    public final String A00;
    public final PaymentsFlowStep paymentsFlowStep;
    public final PaymentsLoggingSessionData paymentsLoggingSessionData;

    public CardFormAnalyticsParams() {
        this.A00 = "";
        this.paymentsLoggingSessionData = null;
        this.paymentsFlowStep = null;
    }

    public CardFormAnalyticsParams(Parcel parcel) {
        this.A00 = parcel.readString();
        this.paymentsLoggingSessionData = (PaymentsLoggingSessionData) 1BL.A0C(parcel, PaymentsLoggingSessionData.class);
        this.paymentsFlowStep = (PaymentsFlowStep) C53v.A07(parcel, PaymentsFlowStep.class);
    }

    public CardFormAnalyticsParams(PaymentsFlowStep paymentsFlowStep, PaymentsLoggingSessionData paymentsLoggingSessionData, String str) {
        this.A00 = str;
        this.paymentsLoggingSessionData = paymentsLoggingSessionData;
        this.paymentsFlowStep = paymentsFlowStep;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeParcelable(this.paymentsLoggingSessionData, i);
        C53v.A0J(parcel, this.paymentsFlowStep);
    }
}
