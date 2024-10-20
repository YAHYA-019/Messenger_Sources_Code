package com.facebook.payments.form.model;

import X.1BL;
import X.C53v;
import X.DKG;
import X.FKZ;
import X.QpL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: PaymentsFormParams.class */
public final class PaymentsFormParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(54);
    public final PaymentsDecoratorParams A00;
    public final QpL A01;
    public final PaymentsFormData A02;
    public final PaymentsLoggingSessionData A03;
    public final PaymentItemType A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public PaymentsFormParams(Parcel parcel) {
        this.A01 = C53v.A07(parcel, QpL.class);
        this.A05 = parcel.readString();
        this.A00 = (PaymentsDecoratorParams) 1BL.A0C(parcel, PaymentsDecoratorParams.class);
        this.A07 = C53v.A0S(parcel);
        this.A02 = (PaymentsFormData) 1BL.A0C(parcel, PaymentsFormData.class);
        this.A06 = parcel.readString();
        this.A03 = (PaymentsLoggingSessionData) 1BL.A0C(parcel, PaymentsLoggingSessionData.class);
        this.A04 = DKG.A0k(parcel);
    }

    public PaymentsFormParams(PaymentsDecoratorParams paymentsDecoratorParams, QpL qpL, PaymentsFormData paymentsFormData, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, String str, String str2) {
        this.A01 = qpL;
        this.A05 = str;
        this.A00 = paymentsDecoratorParams;
        this.A07 = true;
        this.A02 = paymentsFormData;
        this.A06 = str2;
        this.A03 = paymentsLoggingSessionData;
        this.A04 = paymentItemType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.A01);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A03, i);
        C53v.A0J(parcel, this.A04);
    }
}
