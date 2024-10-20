package com.facebookpay.incentives.model;

import X.11T;
import X.C0ty;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: IncentiveCredentialList.class */
public final class IncentiveCredentialList implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(97);
    public final List A00;

    public IncentiveCredentialList() {
        this(C0ty.A00);
    }

    public IncentiveCredentialList(List list) {
        11T.A0F(list, 1);
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeStringList(this.A00);
    }
}
