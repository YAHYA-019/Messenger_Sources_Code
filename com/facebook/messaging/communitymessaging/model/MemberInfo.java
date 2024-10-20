package com.facebook.messaging.communitymessaging.model;

import X.11T;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MemberInfo.class */
public final class MemberInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(91);
    public final int A00;

    public MemberInfo(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
    }
}
