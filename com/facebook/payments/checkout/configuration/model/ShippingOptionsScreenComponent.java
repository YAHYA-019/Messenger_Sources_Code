package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.shipping.model.ShippingOption;
import com.google.common.collect.ImmutableList;

/* loaded from: ShippingOptionsScreenComponent.class */
public final class ShippingOptionsScreenComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(92);
    public final ShippingOption A00;
    public final ImmutableList A01;
    public final boolean A02;
    public final String A03;

    public ShippingOptionsScreenComponent(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int i = 0;
        this.A02 = 4YV.A1U(parcel.readInt());
        this.A03 = parcel.readString();
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (ShippingOption) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            ShippingOption[] shippingOptionArr = new ShippingOption[readInt];
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, shippingOptionArr, i);
            }
            immutableList = ImmutableList.copyOf(shippingOptionArr);
        }
        this.A01 = immutableList;
    }

    public ShippingOptionsScreenComponent(ShippingOption shippingOption, ImmutableList immutableList, String str, boolean z) {
        this.A02 = z;
        this.A03 = str;
        this.A00 = shippingOption;
        this.A01 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ShippingOptionsScreenComponent)) {
                return false;
            }
            ShippingOptionsScreenComponent shippingOptionsScreenComponent = (ShippingOptionsScreenComponent) obj;
            if (this.A02 != shippingOptionsScreenComponent.A02 || !11T.A0O(this.A03, shippingOptionsScreenComponent.A03) || !11T.A0O(this.A00, shippingOptionsScreenComponent.A00) || !11T.A0O(this.A01, shippingOptionsScreenComponent.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A05(this.A02))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeString(this.A03);
        C3o5.A0d(parcel, this.A00, i);
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y = AbL.A0Y(parcel, immutableList);
        while (A0Y.hasNext()) {
            parcel.writeParcelable((Parcelable) A0Y.next(), i);
        }
    }
}
