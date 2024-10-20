package com.facebook.messaging.model.platformmetadata.types.broadcastunitid;

import X.11T;
import X.C7yy;
import X.CSa;
import android.os.Parcel;
import com.facebook.messaging.model.platformmetadata.common.PlatformMetadata;

/* loaded from: BroadcastUnitIDPlatformMetadata.class */
public final class BroadcastUnitIDPlatformMetadata extends PlatformMetadata {
    public static final C7yy CREATOR = new CSa(1);
    public final String A00;

    public BroadcastUnitIDPlatformMetadata(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public BroadcastUnitIDPlatformMetadata(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
    }
}
