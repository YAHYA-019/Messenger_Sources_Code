package com.facebook.messaging.model.platformmetadata.types.quickreply;

import X.C7yy;
import X.CSa;
import android.os.Parcel;
import com.facebook.messaging.model.platformmetadata.common.PlatformMetadata;

/* loaded from: QuickReplyTypePlatformMetadata.class */
public final class QuickReplyTypePlatformMetadata extends PlatformMetadata {
    public static final C7yy CREATOR = new CSa(6);
    public final String A00;

    public QuickReplyTypePlatformMetadata(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public QuickReplyTypePlatformMetadata(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
