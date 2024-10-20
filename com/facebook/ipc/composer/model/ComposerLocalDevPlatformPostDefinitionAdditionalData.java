package com.facebook.ipc.composer.model;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKI;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;

/* loaded from: ComposerLocalDevPlatformPostDefinitionAdditionalData.class */
public final class ComposerLocalDevPlatformPostDefinitionAdditionalData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(37);
    public final MediaData A00;

    public ComposerLocalDevPlatformPostDefinitionAdditionalData(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : DKG.A0Y(parcel);
    }

    public ComposerLocalDevPlatformPostDefinitionAdditionalData(MediaData mediaData) {
        this.A00 = mediaData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ComposerLocalDevPlatformPostDefinitionAdditionalData) && 11T.A0O(this.A00, ((ComposerLocalDevPlatformPostDefinitionAdditionalData) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKI.A0Q(parcel, this.A00, i);
    }
}
