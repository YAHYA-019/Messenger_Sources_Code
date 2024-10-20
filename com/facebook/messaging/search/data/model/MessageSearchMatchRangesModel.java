package com.facebook.messaging.search.data.model;

import X.11T;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MessageSearchMatchRangesModel.class */
public final class MessageSearchMatchRangesModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(66);
    public int A00;
    public int A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
