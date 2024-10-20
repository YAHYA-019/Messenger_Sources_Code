package com.facebook.media.transcode.video;

import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.videocodec.policy.VideoTranscodeProfileLevelParams;

/* loaded from: VideoTranscodeParameters.class */
public final class VideoTranscodeParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(79);
    public int A00;
    public int A01;
    public VideoEditConfig A02;
    public VideoTranscodeProfileLevelParams A03;
    public boolean A04;
    public boolean A05;

    public VideoTranscodeParameters() {
    }

    public VideoTranscodeParameters(int i) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A02, 0);
        parcel.writeParcelable(this.A03, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
