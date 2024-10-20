package com.facebook.video.events;

import X.11T;
import X.82N;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoCacheStatus.class */
public final class VideoCacheStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(18);
    public final String A00;
    public final boolean A01;

    public VideoCacheStatus(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
