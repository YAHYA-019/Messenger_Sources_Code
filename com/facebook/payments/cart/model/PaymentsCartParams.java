package com.facebook.payments.cart.model;

import X.1BL;
import X.C53v;
import X.DKG;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.invoice.protocol.InvoiceCartScreenConfigFetchParams;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: PaymentsCartParams.class */
public final class PaymentsCartParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(47);
    public final PaymentsDecoratorParams A00;
    public final InvoiceCartScreenConfigFetchParams A01;
    public final PaymentsLoggingSessionData A02;
    public final PaymentItemType A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public PaymentsCartParams(Parcel parcel) {
        this.A03 = DKG.A0k(parcel);
        this.A02 = (PaymentsLoggingSessionData) 1BL.A0C(parcel, PaymentsLoggingSessionData.class);
        this.A01 = (InvoiceCartScreenConfigFetchParams) 1BL.A0C(parcel, InvoiceCartScreenConfigFetchParams.class);
        this.A06 = parcel.readString();
        this.A00 = (PaymentsDecoratorParams) 1BL.A0C(parcel, PaymentsDecoratorParams.class);
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
    }

    public PaymentsCartParams(PaymentsDecoratorParams paymentsDecoratorParams, InvoiceCartScreenConfigFetchParams invoiceCartScreenConfigFetchParams, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType) {
        this.A03 = paymentItemType;
        this.A02 = paymentsLoggingSessionData;
        this.A01 = invoiceCartScreenConfigFetchParams;
        this.A06 = null;
        this.A00 = paymentsDecoratorParams;
        this.A05 = null;
        this.A04 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.A03);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
    }
}
