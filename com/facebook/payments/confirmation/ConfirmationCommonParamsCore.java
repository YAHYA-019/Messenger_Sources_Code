package com.facebook.payments.confirmation;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zN;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.EM1;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.decorator.PaymentsDecoratorParams;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: ConfirmationCommonParamsCore.class */
public final class ConfirmationCommonParamsCore implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(24);
    public final int A00;
    public final EM1 A01;
    public final ConfirmationViewParams A02;
    public final SubscriptionConfirmationViewParam A03;
    public final PaymentsDecoratorParams A04;
    public final PaymentsLoggingSessionData A05;
    public final PaymentItemType A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public ConfirmationCommonParamsCore(EM1 em1, ConfirmationViewParams confirmationViewParams, SubscriptionConfirmationViewParam subscriptionConfirmationViewParam, PaymentsDecoratorParams paymentsDecoratorParams, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, String str, boolean z) {
        this.A01 = em1;
        this.A02 = confirmationViewParams;
        C1pq.A08("paymentItemType", paymentItemType);
        this.A06 = paymentItemType;
        this.A07 = null;
        this.A08 = str;
        this.A04 = paymentsDecoratorParams;
        this.A05 = paymentsLoggingSessionData;
        this.A0A = z;
        this.A03 = subscriptionConfirmationViewParam;
        this.A00 = -1;
        this.A09 = null;
    }

    public ConfirmationCommonParamsCore(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A01 = EM1.values()[parcel.readInt()];
        SubscriptionConfirmationViewParam subscriptionConfirmationViewParam = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (ConfirmationViewParams) parcel.readParcelable(A0e);
        }
        this.A06 = DKG.A0l(parcel);
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A04 = (PaymentsDecoratorParams) parcel.readParcelable(A0e);
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (PaymentsLoggingSessionData) parcel.readParcelable(A0e);
        }
        this.A0A = AbN.A1U(parcel);
        this.A03 = parcel.readInt() != 0 ? (SubscriptionConfirmationViewParam) parcel.readParcelable(A0e) : subscriptionConfirmationViewParam;
        this.A00 = parcel.readInt();
        this.A09 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ConfirmationCommonParamsCore)) {
                return false;
            }
            ConfirmationCommonParamsCore confirmationCommonParamsCore = (ConfirmationCommonParamsCore) obj;
            if (this.A01 != confirmationCommonParamsCore.A01 || !11T.A0O(this.A02, confirmationCommonParamsCore.A02) || this.A06 != confirmationCommonParamsCore.A06 || !11T.A0O(this.A07, confirmationCommonParamsCore.A07) || !11T.A0O(this.A08, confirmationCommonParamsCore.A08) || !11T.A0O(this.A04, confirmationCommonParamsCore.A04) || !11T.A0O(this.A05, confirmationCommonParamsCore.A05) || this.A0A != confirmationCommonParamsCore.A0A || !11T.A0O(this.A03, confirmationCommonParamsCore.A03) || this.A00 != confirmationCommonParamsCore.A00 || !11T.A0O(this.A09, confirmationCommonParamsCore.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A02, C3o5.A03(this.A01) + 31);
        return C1pq.A04(this.A09, (C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A08, C1pq.A04(this.A07, (A04 * 31) + DKF.A04(this.A06))))), this.A0A)) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zN.A0z(parcel, this.A01);
        C3o5.A0d(parcel, this.A02, i);
        7zN.A0z(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        parcel.writeParcelable(this.A04, i);
        C3o5.A0d(parcel, this.A05, i);
        parcel.writeInt(this.A0A ? 1 : 0);
        C3o5.A0d(parcel, this.A03, i);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A09);
    }
}
