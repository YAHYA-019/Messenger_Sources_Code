package com.facebook.payments.simplescreen.model;

import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.paymentmethods.model.PayPalBillingAgreement;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: EditPayPalScreenExtraData.class */
public final class EditPayPalScreenExtraData implements Parcelable, SimpleScreenExtraData {
    public static final Parcelable.Creator CREATOR = FKW.A00(2);
    public final boolean A00;
    public final PayPalBillingAgreement A01;
    public final Set A02;

    public EditPayPalScreenExtraData(Parcel parcel) {
        int i = 0;
        this.A00 = 4YV.A1U(C3o5.A01(parcel, this));
        this.A01 = parcel.readInt() == 0 ? null : (PayPalBillingAgreement) PayPalBillingAgreement.CREATOR.createFromParcel(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public EditPayPalScreenExtraData(PayPalBillingAgreement payPalBillingAgreement, Set set) {
        this.A00 = true;
        this.A01 = payPalBillingAgreement;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public PayPalBillingAgreement A00() {
        if (this.A02.contains("paypal_billing_agreement")) {
            return this.A01;
        }
        synchronized (this) {
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EditPayPalScreenExtraData)) {
                return false;
            }
            EditPayPalScreenExtraData editPayPalScreenExtraData = (EditPayPalScreenExtraData) obj;
            if (this.A00 != editPayPalScreenExtraData.A00 || !11T.A0O(A00(), editPayPalScreenExtraData.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C1pq.A05(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        PayPalBillingAgreement payPalBillingAgreement = this.A01;
        if (payPalBillingAgreement == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            payPalBillingAgreement.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
