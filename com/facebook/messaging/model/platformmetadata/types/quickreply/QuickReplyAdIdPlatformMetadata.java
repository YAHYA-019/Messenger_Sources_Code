package com.facebook.messaging.model.platformmetadata.types.quickreply;

import X.C7yy;
import X.CSa;
import android.os.Parcel;
import com.facebook.messaging.model.platformmetadata.common.PlatformMetadata;

/* loaded from: QuickReplyAdIdPlatformMetadata.class */
public final class QuickReplyAdIdPlatformMetadata extends PlatformMetadata {
    public static final C7yy CREATOR = new CSa(4);
    public final String A00;

    public QuickReplyAdIdPlatformMetadata(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public QuickReplyAdIdPlatformMetadata(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
