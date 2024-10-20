package com.facebook.payments.picker.model;

import X.1BL;
import X.C53v;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.logging.PaymentsLoggingSessionData;

/* loaded from: PickerScreenAnalyticsParams.class */
public class PickerScreenAnalyticsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(75);
    public final PaymentsFlowStep paymentsFlowStep;
    public final PaymentsLoggingSessionData paymentsLoggingSessionData;
    public final String trigger;

    public PickerScreenAnalyticsParams() {
        this.paymentsFlowStep = null;
        this.paymentsLoggingSessionData = null;
        this.trigger = "";
    }

    public PickerScreenAnalyticsParams(Parcel parcel) {
        this.paymentsFlowStep = (PaymentsFlowStep) C53v.A07(parcel, PaymentsFlowStep.class);
        this.paymentsLoggingSessionData = (PaymentsLoggingSessionData) 1BL.A0C(parcel, PaymentsLoggingSessionData.class);
        this.trigger = parcel.readString();
    }

    public PickerScreenAnalyticsParams(PaymentsFlowStep paymentsFlowStep, PaymentsLoggingSessionData paymentsLoggingSessionData, String str) {
        this.paymentsFlowStep = paymentsFlowStep;
        this.paymentsLoggingSessionData = paymentsLoggingSessionData;
        this.trigger = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.paymentsFlowStep);
        parcel.writeParcelable(this.paymentsLoggingSessionData, i);
        parcel.writeString(this.trigger);
    }
}
