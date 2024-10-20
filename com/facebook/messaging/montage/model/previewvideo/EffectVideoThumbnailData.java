package com.facebook.messaging.montage.model.previewvideo;

import X.0Pz;
import X.11T;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EffectVideoThumbnailData.class */
public final class EffectVideoThumbnailData implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(25);
    public final String A00;
    public final String A01;

    public EffectVideoThumbnailData(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 0Pz.A0z("EffectVideoThumbnailData{imageId='", this.A00, "', imageUrl='", this.A01, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
