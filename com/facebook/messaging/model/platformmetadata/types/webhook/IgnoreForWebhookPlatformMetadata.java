package com.facebook.messaging.model.platformmetadata.types.webhook;

import X.24X;
import X.4YW;
import X.C02053tt;
import X.C5qt;
import X.C7yy;
import X.CSZ;
import android.os.Parcel;
import com.facebook.messaging.model.platformmetadata.common.PlatformMetadata;

/* loaded from: IgnoreForWebhookPlatformMetadata.class */
public final class IgnoreForWebhookPlatformMetadata extends PlatformMetadata {
    public static final C7yy CREATOR = new CSZ(1);
    public final boolean A00;

    public IgnoreForWebhookPlatformMetadata(Parcel parcel) {
        this.A00 = 4YW.A0K(parcel);
    }

    public IgnoreForWebhookPlatformMetadata(boolean z) {
        this.A00 = z;
    }

    @Override // com.facebook.messaging.model.platformmetadata.common.PlatformMetadata
    public C5qt A00() {
        return C5qt.A07;
    }

    @Override // com.facebook.messaging.model.platformmetadata.common.PlatformMetadata
    public 24X A01() {
        return C02053tt.A00(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
    }
}
