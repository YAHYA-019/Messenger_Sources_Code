package com.facebook.messaging.montage.model.previewvideo;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EffectVideoPreviewData.class */
public final class EffectVideoPreviewData implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(24);
    public final double A00;
    public final EffectVideoThumbnailData A01;
    public final String A02;
    public final String A03;

    public EffectVideoPreviewData(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = parcel.readDouble();
        this.A03 = parcel.readString();
        this.A01 = (EffectVideoThumbnailData) 1BL.A0C(parcel, EffectVideoThumbnailData.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EffectVideoPreviewData{videoId='");
        A0k.append(this.A02);
        A0k.append("', videoDuration=");
        A0k.append(this.A00);
        A0k.append(", videoUrl='");
        A0k.append(this.A03);
        A0k.append("', mEffectVideoThumbnailData=");
        A0k.append(this.A01);
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeDouble(this.A00);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
    }
}
