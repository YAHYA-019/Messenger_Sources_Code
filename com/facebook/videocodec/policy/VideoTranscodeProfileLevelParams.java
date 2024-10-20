package com.facebook.videocodec.policy;

import X.11T;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoTranscodeProfileLevelParams.class */
public final class VideoTranscodeProfileLevelParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(23);
    public final int A00;
    public final int A01;

    public VideoTranscodeProfileLevelParams(int i) {
        this.A01 = i;
        this.A00 = 256;
    }

    public VideoTranscodeProfileLevelParams(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
