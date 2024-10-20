package com.facebook.messaging.model.platformmetadata.types.automation;

import X.1BL;
import X.24X;
import X.2DM;
import X.4YU;
import X.C5qt;
import X.C7yy;
import X.CSa;
import android.os.Parcel;
import com.facebook.messaging.model.platformmetadata.common.PlatformMetadata;

/* loaded from: AutomationSupportPlatformMetadata.class */
public final class AutomationSupportPlatformMetadata extends PlatformMetadata {
    public static final C7yy CREATOR = new CSa(0);
    public final AutomationSupportData A00;

    public AutomationSupportPlatformMetadata(Parcel parcel) {
        this.A00 = (AutomationSupportData) 1BL.A0C(parcel, AutomationSupportData.class);
    }

    public AutomationSupportPlatformMetadata(AutomationSupportData automationSupportData) {
        this.A00 = automationSupportData;
    }

    @Override // com.facebook.messaging.model.platformmetadata.common.PlatformMetadata
    public C5qt A00() {
        return C5qt.A04;
    }

    @Override // com.facebook.messaging.model.platformmetadata.common.PlatformMetadata
    public 24X A01() {
        AutomationSupportData automationSupportData = this.A00;
        2DM A0f = 4YU.A0f();
        A0f.A0o("ad_id", automationSupportData.A00);
        return A0f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
