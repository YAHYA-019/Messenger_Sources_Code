package com.facebook.mig.input.phonenumber.countrypicker;

import X.02W;
import X.11T;
import X.1BL;
import X.1Du;
import X.7zM;
import X.AbH;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: CountryIsoList.class */
public final class CountryIsoList implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(6);
    public final ImmutableList A00;

    public CountryIsoList(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        String[] strArr = new String[A01];
        int i = 0;
        while (i < A01) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A00 = ImmutableList.copyOf(strArr);
    }

    public CountryIsoList(ImmutableList immutableList) {
        this.A00 = immutableList;
        02W.A04(7zM.A1b(immutableList));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CountryIsoList) && 11T.A0O(this.A00, ((CountryIsoList) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
    }
}
