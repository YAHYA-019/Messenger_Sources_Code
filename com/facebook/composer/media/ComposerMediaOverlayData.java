package com.facebook.composer.media;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.composer.model.ExternalSongOverlayInfo;

/* loaded from: ComposerMediaOverlayData.class */
public final class ComposerMediaOverlayData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(1);
    public final ExternalSongOverlayInfo A00;

    public ComposerMediaOverlayData(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : (ExternalSongOverlayInfo) ExternalSongOverlayInfo.CREATOR.createFromParcel(parcel);
    }

    public ComposerMediaOverlayData(ExternalSongOverlayInfo externalSongOverlayInfo) {
        this.A00 = externalSongOverlayInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ComposerMediaOverlayData) && 11T.A0O(this.A00, ((ComposerMediaOverlayData) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ExternalSongOverlayInfo externalSongOverlayInfo = this.A00;
        if (externalSongOverlayInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            externalSongOverlayInfo.writeToParcel(parcel, i);
        }
    }
}
