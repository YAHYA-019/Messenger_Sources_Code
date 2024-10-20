package com.facebook.payments.checkout.model;

import X.11T;
import X.4YV;
import X.7zN;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.EMD;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.payments.checkout.configuration.model.CheckoutInformation;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: PaymentMethodPickerParams.class */
public final class PaymentMethodPickerParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(9);
    public final CheckoutInformation A00;
    public final EMD A01;
    public final PaymentsLoggingSessionData A02;
    public final PaymentItemType A03;
    public final String A04;

    public PaymentMethodPickerParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        PaymentsLoggingSessionData paymentsLoggingSessionData = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (CheckoutInformation) CheckoutInformation.CREATOR.createFromParcel(parcel);
        }
        this.A01 = EMD.values()[parcel.readInt()];
        this.A03 = DKG.A0l(parcel);
        this.A02 = parcel.readInt() != 0 ? (PaymentsLoggingSessionData) parcel.readParcelable(A0e) : paymentsLoggingSessionData;
        this.A04 = parcel.readString();
    }

    public PaymentMethodPickerParams(CheckoutInformation checkoutInformation, EMD emd, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, String str) {
        this.A00 = checkoutInformation;
        C1pq.A08("checkoutStyle", emd);
        this.A01 = emd;
        C1pq.A08("paymentItemType", paymentItemType);
        this.A03 = paymentItemType;
        this.A02 = paymentsLoggingSessionData;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        this.A04 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentMethodPickerParams)) {
                return false;
            }
            PaymentMethodPickerParams paymentMethodPickerParams = (PaymentMethodPickerParams) obj;
            if (!11T.A0O(this.A00, paymentMethodPickerParams.A00) || this.A01 != paymentMethodPickerParams.A01 || this.A03 != paymentMethodPickerParams.A03 || !11T.A0O(this.A02, paymentMethodPickerParams.A02) || !11T.A0O(this.A04, paymentMethodPickerParams.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A00);
        int A032 = (A03 * 31) + C3o5.A03(this.A01);
        return C1pq.A04(this.A04, C1pq.A04(this.A02, (A032 * 31) + DKF.A04(this.A03)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        CheckoutInformation checkoutInformation = this.A00;
        if (checkoutInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            checkoutInformation.writeToParcel(parcel, i);
        }
        7zN.A0z(parcel, this.A01);
        7zN.A0z(parcel, this.A03);
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeString(this.A04);
    }
}
