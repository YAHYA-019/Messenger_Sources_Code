package com.facebook.messaging.model.platformmetadata.types.marketplace;

import X.11T;
import X.4YW;
import X.C7yy;
import X.RqX;
import android.os.Parcel;
import com.facebook.messaging.model.platformmetadata.common.PlatformMetadata;

/* loaded from: MarketplaceTabPlatformMetadata.class */
public final class MarketplaceTabPlatformMetadata extends PlatformMetadata {
    public static final C7yy CREATOR = new RqX();
    public final boolean A00;

    public MarketplaceTabPlatformMetadata(Parcel parcel) {
        this.A00 = 4YW.A0K(parcel);
    }

    public MarketplaceTabPlatformMetadata(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
    }
}
