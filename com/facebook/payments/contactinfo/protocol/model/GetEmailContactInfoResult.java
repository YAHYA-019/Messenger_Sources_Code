package com.facebook.payments.contactinfo.protocol.model;

import X.AbN;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.contactinfo.model.EmailContactInfo;
import com.google.common.collect.ImmutableList;

/* loaded from: GetEmailContactInfoResult.class */
public final class GetEmailContactInfoResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(43);
    public final ImmutableList A00;

    public GetEmailContactInfoResult(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, EmailContactInfo.class);
    }

    public GetEmailContactInfoResult(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
    }
}
