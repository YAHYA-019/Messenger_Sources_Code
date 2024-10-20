package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.C1pq;
import X.C2204Dgw;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.FJ8;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.paymentmethods.model.NewCreditCardOption;
import com.facebook.payments.paymentmethods.paymentmethodcomponents.model.PaymentMethodComponentData;
import com.google.common.collect.ImmutableList;

/* loaded from: PaymentCredentialsScreenComponent.class */
public final class PaymentCredentialsScreenComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(80);
    public final C2204Dgw A00;
    public final NewCreditCardOption A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;

    public PaymentCredentialsScreenComponent(C2204Dgw c2204Dgw, NewCreditCardOption newCreditCardOption, ImmutableList immutableList, String str, boolean z) {
        this.A00 = c2204Dgw;
        this.A01 = newCreditCardOption;
        C1pq.A08("paymentMethodComponentList", immutableList);
        this.A02 = immutableList;
        this.A04 = z;
        C1pq.A08("screenComponentType", str);
        this.A03 = str;
    }

    public PaymentCredentialsScreenComponent(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        NewCreditCardOption newCreditCardOption = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (C2204Dgw) FJ8.A01(parcel);
        }
        this.A01 = parcel.readInt() != 0 ? (NewCreditCardOption) parcel.readParcelable(A0e) : newCreditCardOption;
        int readInt = parcel.readInt();
        PaymentMethodComponentData[] paymentMethodComponentDataArr = new PaymentMethodComponentData[readInt];
        int i = 0;
        while (i < readInt) {
            i = DKG.A02(parcel, PaymentMethodComponentData.CREATOR, paymentMethodComponentDataArr, i);
        }
        this.A02 = ImmutableList.copyOf(paymentMethodComponentDataArr);
        this.A04 = DKH.A1W(parcel);
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentCredentialsScreenComponent)) {
                return false;
            }
            PaymentCredentialsScreenComponent paymentCredentialsScreenComponent = (PaymentCredentialsScreenComponent) obj;
            if (!11T.A0O(this.A00, paymentCredentialsScreenComponent.A00) || !11T.A0O(this.A01, paymentCredentialsScreenComponent.A01) || !11T.A0O(this.A02, paymentCredentialsScreenComponent.A02) || this.A04 != paymentCredentialsScreenComponent.A04 || !11T.A0O(this.A03, paymentCredentialsScreenComponent.A03)) {
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
        DKH.A0y(parcel, this.A00);
        C3o5.A0d(parcel, this.A01, i);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            DKF.A0b(A0b).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A03);
    }
}
