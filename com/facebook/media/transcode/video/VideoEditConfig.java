package com.facebook.media.transcode.video;

import X.AnonymousClass001;
import X.CSR;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: VideoEditConfig.class */
public final class VideoEditConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(78);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public RectF A04;
    public List A05 = AnonymousClass001.A0s();
    public boolean A06;
    public boolean A07;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeTypedList(this.A05);
        parcel.writeFloat(this.A00);
    }
}
