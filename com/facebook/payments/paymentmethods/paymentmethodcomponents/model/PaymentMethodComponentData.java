package com.facebook.payments.paymentmethods.paymentmethodcomponents.model;

import X.11T;
import X.4YV;
import X.AbN;
import X.C1pq;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.checkout.configuration.model.bubble.BubbleComponent;
import com.facebook.payments.paymentmethods.model.PaymentMethodEligibleOffer;
import com.facebook.payments.paymentmethods.model.PaymentMethodGreyedOutOptionConfig;
import com.facebook.payments.paymentmethods.model.PaymentOption;

/* loaded from: PaymentMethodComponentData.class */
public final class PaymentMethodComponentData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(69);
    public final BubbleComponent A00;
    public final PaymentMethodEligibleOffer A01;
    public final PaymentMethodGreyedOutOptionConfig A02;
    public final PaymentOption A03;
    public final boolean A04;

    public PaymentMethodComponentData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        PaymentMethodGreyedOutOptionConfig paymentMethodGreyedOutOptionConfig = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (BubbleComponent) BubbleComponent.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (PaymentMethodEligibleOffer) PaymentMethodEligibleOffer.CREATOR.createFromParcel(parcel);
        }
        this.A02 = parcel.readInt() != 0 ? (PaymentMethodGreyedOutOptionConfig) PaymentMethodGreyedOutOptionConfig.CREATOR.createFromParcel(parcel) : paymentMethodGreyedOutOptionConfig;
        this.A04 = AbN.A1U(parcel);
        this.A03 = (PaymentOption) parcel.readParcelable(A0e);
    }

    public PaymentMethodComponentData(BubbleComponent bubbleComponent, PaymentMethodEligibleOffer paymentMethodEligibleOffer, PaymentMethodGreyedOutOptionConfig paymentMethodGreyedOutOptionConfig, PaymentOption paymentOption, boolean z) {
        this.A00 = bubbleComponent;
        this.A01 = paymentMethodEligibleOffer;
        this.A02 = paymentMethodGreyedOutOptionConfig;
        this.A04 = z;
        C1pq.A08("paymentOption", paymentOption);
        this.A03 = paymentOption;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentMethodComponentData)) {
                return false;
            }
            PaymentMethodComponentData paymentMethodComponentData = (PaymentMethodComponentData) obj;
            if (!11T.A0O(this.A00, paymentMethodComponentData.A00) || !11T.A0O(this.A01, paymentMethodComponentData.A01) || !11T.A0O(this.A02, paymentMethodComponentData.A02) || this.A04 != paymentMethodComponentData.A04 || !11T.A0O(this.A03, paymentMethodComponentData.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))), this.A04));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        BubbleComponent bubbleComponent = this.A00;
        if (bubbleComponent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bubbleComponent.writeToParcel(parcel, i);
        }
        PaymentMethodEligibleOffer paymentMethodEligibleOffer = this.A01;
        if (paymentMethodEligibleOffer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodEligibleOffer.writeToParcel(parcel, i);
        }
        PaymentMethodGreyedOutOptionConfig paymentMethodGreyedOutOptionConfig = this.A02;
        if (paymentMethodGreyedOutOptionConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodGreyedOutOptionConfig.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeParcelable(this.A03, i);
    }
}
