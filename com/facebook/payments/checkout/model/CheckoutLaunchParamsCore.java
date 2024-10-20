package com.facebook.payments.checkout.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zN;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.EMD;
import X.FKZ;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.ui.countdowntimer.model.PaymentsCountdownTimerParams;
import com.google.common.collect.ImmutableList;

/* loaded from: CheckoutLaunchParamsCore.class */
public final class CheckoutLaunchParamsCore implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(7);
    public final Intent A00;
    public final Intent A01;
    public final Intent A02;
    public final CheckoutEntryPointType A03;
    public final EMD A04;
    public final SelectedPaymentMethodInput A05;
    public final PaymentItemType A06;
    public final PaymentsCountdownTimerParams A07;
    public final ImmutableList A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public CheckoutLaunchParamsCore(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Intent intent = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Intent) parcel.readParcelable(A0e);
        }
        this.A04 = EMD.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Intent) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = CheckoutEntryPointType.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        this.A06 = DKG.A0l(parcel);
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (PaymentsCountdownTimerParams) PaymentsCountdownTimerParams.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            int readInt = parcel.readInt();
            CheckoutProduct[] checkoutProductArr = new CheckoutProduct[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, checkoutProductArr, i);
            }
            this.A08 = ImmutableList.copyOf(checkoutProductArr);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = (SelectedPaymentMethodInput) parcel.readParcelable(A0e);
        }
        this.A0C = DKH.A1W(parcel);
        this.A02 = parcel.readInt() != 0 ? (Intent) parcel.readParcelable(A0e) : intent;
    }

    public CheckoutLaunchParamsCore(CheckoutEntryPointType checkoutEntryPointType, EMD emd, SelectedPaymentMethodInput selectedPaymentMethodInput, PaymentItemType paymentItemType, String str, String str2) {
        this.A00 = null;
        C1pq.A08("checkoutStyle", emd);
        this.A04 = emd;
        this.A01 = null;
        this.A03 = checkoutEntryPointType;
        this.A09 = str;
        C1pq.A08("paymentItemType", paymentItemType);
        this.A06 = paymentItemType;
        this.A0A = null;
        this.A07 = null;
        this.A08 = null;
        this.A0B = str2;
        this.A05 = selectedPaymentMethodInput;
        this.A0C = true;
        this.A02 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutLaunchParamsCore)) {
                return false;
            }
            CheckoutLaunchParamsCore checkoutLaunchParamsCore = (CheckoutLaunchParamsCore) obj;
            if (!11T.A0O(this.A00, checkoutLaunchParamsCore.A00) || this.A04 != checkoutLaunchParamsCore.A04 || !11T.A0O(this.A01, checkoutLaunchParamsCore.A01) || this.A03 != checkoutLaunchParamsCore.A03 || !11T.A0O(this.A09, checkoutLaunchParamsCore.A09) || this.A06 != checkoutLaunchParamsCore.A06 || !11T.A0O(this.A0A, checkoutLaunchParamsCore.A0A) || !11T.A0O(this.A07, checkoutLaunchParamsCore.A07) || !11T.A0O(this.A08, checkoutLaunchParamsCore.A08) || !11T.A0O(this.A0B, checkoutLaunchParamsCore.A0B) || !11T.A0O(this.A05, checkoutLaunchParamsCore.A05) || this.A0C != checkoutLaunchParamsCore.A0C || !11T.A0O(this.A02, checkoutLaunchParamsCore.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A00);
        int A04 = C1pq.A04(this.A01, (A03 * 31) + C3o5.A03(this.A04));
        int A042 = C1pq.A04(this.A09, (A04 * 31) + C3o5.A03(this.A03));
        return C1pq.A04(this.A02, C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A0B, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A0A, (A042 * 31) + DKF.A04(this.A06)))))), this.A0C));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        7zN.A0z(parcel, this.A04);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0e(parcel, this.A03);
        1BL.A13(parcel, this.A09);
        7zN.A0z(parcel, this.A06);
        1BL.A13(parcel, this.A0A);
        PaymentsCountdownTimerParams paymentsCountdownTimerParams = this.A07;
        if (paymentsCountdownTimerParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentsCountdownTimerParams.writeToParcel(parcel, i);
        }
        ImmutableList immutableList = this.A08;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((CheckoutProduct) A0Y.next(), i);
            }
        }
        1BL.A13(parcel, this.A0B);
        C3o5.A0d(parcel, this.A05, i);
        parcel.writeInt(this.A0C ? 1 : 0);
        C3o5.A0d(parcel, this.A02, i);
    }
}
