package com.facebook.messaging.video.fullscreen;

import X.11T;
import X.7zP;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.video.engine.api.VideoPlayerParams;

/* loaded from: FullScreenVideoLaunchParam.class */
public final class FullScreenVideoLaunchParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(88);
    public final double A00;
    public final double A01;
    public final double A02;
    public final int A03;
    public final CallerContext A04;
    public final VideoPlayerParams A05;

    public FullScreenVideoLaunchParam(CallerContext callerContext, VideoPlayerParams videoPlayerParams, double d, double d2, double d3, int i) {
        7zP.A1L(videoPlayerParams, 1, callerContext);
        this.A05 = videoPlayerParams;
        this.A02 = d;
        this.A01 = d2;
        this.A00 = d3;
        this.A03 = i;
        this.A04 = callerContext;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeDouble(this.A02);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeParcelable(this.A04, i);
    }
}
