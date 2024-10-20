package com.facebook.platform.opengraph.server;

import X.11T;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;

/* loaded from: UploadStagingResourcePhotosOperation$Params.class */
public final class UploadStagingResourcePhotosOperation$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(39);
    public final ImmutableMap A00;

    public UploadStagingResourcePhotosOperation$Params(Parcel parcel) {
        Serializable readSerializable = parcel.readSerializable();
        11T.A0I(readSerializable, "null cannot be cast to non-null type com.google.common.collect.ImmutableMap<android.net.Uri, android.graphics.Bitmap>");
        this.A00 = (ImmutableMap) readSerializable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeSerializable(this.A00);
    }
}
