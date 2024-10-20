package com.facebook.payments.common.country;

import X.11T;
import X.4YV;
import X.4YW;
import X.7zN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebook.payments.model.PaymentItemType;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: PaymentsCountrySelectorViewParams.class */
public final class PaymentsCountrySelectorViewParams implements Parcelable {
    public static volatile Country A03;
    public static final Parcelable.Creator CREATOR = FKZ.A00(22);
    public final PaymentItemType A00;
    public final Country A01;
    public final Set A02;

    public PaymentsCountrySelectorViewParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = DKG.A0l(parcel);
        this.A01 = parcel.readInt() == 0 ? null : (Country) parcel.readParcelable(A0e);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public PaymentsCountrySelectorViewParams(Country country, PaymentItemType paymentItemType, Set set) {
        C1pq.A08("paymentItemType", paymentItemType);
        this.A00 = paymentItemType;
        this.A01 = country;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public Country A00() {
        if (this.A02.contains("selectedCountry")) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = Country.A01;
                }
            }
        }
        return A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PaymentsCountrySelectorViewParams)) {
                return false;
            }
            PaymentsCountrySelectorViewParams paymentsCountrySelectorViewParams = (PaymentsCountrySelectorViewParams) obj;
            if (this.A00 != paymentsCountrySelectorViewParams.A00 || !11T.A0O(A00(), paymentsCountrySelectorViewParams.A00())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A00(), C3o5.A03(this.A00) + 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zN.A0z(parcel, this.A00);
        4YW.A0D(parcel, this.A01, i);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
