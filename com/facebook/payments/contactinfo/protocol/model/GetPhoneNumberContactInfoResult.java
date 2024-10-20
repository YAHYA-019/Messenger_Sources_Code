package com.facebook.payments.contactinfo.protocol.model;

import X.AbN;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.contactinfo.model.PhoneNumberContactInfo;
import com.google.common.collect.ImmutableList;

/* loaded from: GetPhoneNumberContactInfoResult.class */
public final class GetPhoneNumberContactInfoResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(44);
    public final ImmutableList A00;

    public GetPhoneNumberContactInfoResult(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, PhoneNumberContactInfo.class);
    }

    public GetPhoneNumberContactInfoResult(ImmutableList immutableList) {
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
