package com.facebook.payments.shipping.model;

import X.11T;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: AddressFormFieldList.class */
public final class AddressFormFieldList implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(93);
    public final ImmutableList A00;

    public AddressFormFieldList(Parcel parcel) {
        ImmutableList copyOf;
        ClassLoader A0e = 4YV.A0e(this);
        if (parcel.readInt() == 0) {
            copyOf = null;
        } else {
            int readInt = parcel.readInt();
            AddressFormField[] addressFormFieldArr = new AddressFormField[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, addressFormFieldArr, i);
            }
            copyOf = ImmutableList.copyOf(addressFormFieldArr);
        }
        this.A00 = copyOf;
    }

    public AddressFormFieldList(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AddressFormFieldList) && 11T.A0O(this.A00, ((AddressFormFieldList) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y = AbL.A0Y(parcel, immutableList);
        while (A0Y.hasNext()) {
            parcel.writeParcelable((AddressFormField) A0Y.next(), i);
        }
    }
}
