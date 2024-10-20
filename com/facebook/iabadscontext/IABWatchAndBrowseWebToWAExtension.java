package com.facebook.iabadscontext;

import X.11T;
import X.C04v;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: IABWatchAndBrowseWebToWAExtension.class */
public final class IABWatchAndBrowseWebToWAExtension extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(4);
    public final MessagingExtensionType A00;

    public IABWatchAndBrowseWebToWAExtension(MessagingExtensionType messagingExtensionType) {
        11T.A0F(messagingExtensionType, 1);
        this.A00 = messagingExtensionType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof IABWatchAndBrowseWebToWAExtension) && this.A00 == ((IABWatchAndBrowseWebToWAExtension) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }
}
