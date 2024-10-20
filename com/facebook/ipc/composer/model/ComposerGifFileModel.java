package com.facebook.ipc.composer.model;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;

/* loaded from: ComposerGifFileModel.class */
public final class ComposerGifFileModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(22);
    public final MediaData A00;

    public ComposerGifFileModel(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : DKG.A0Y(parcel);
    }

    public ComposerGifFileModel(MediaData mediaData) {
        this.A00 = mediaData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ComposerGifFileModel) && 11T.A0O(this.A00, ((ComposerGifFileModel) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        MediaData mediaData = this.A00;
        if (mediaData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaData.writeToParcel(parcel, i);
        }
    }
}
