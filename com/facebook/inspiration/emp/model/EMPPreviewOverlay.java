package com.facebook.inspiration.emp.model;

import X.11T;
import X.4YU;
import X.AnonymousClass001;
import X.C04v;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.InspirationOverlayParamsHolder;
import com.facebook.ipc.inspiration.config.rms.InspirationRMSPlaceholderModel;

/* loaded from: EMPPreviewOverlay.class */
public final class EMPPreviewOverlay extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(32);
    public final InspirationOverlayParamsHolder A00;
    public final InspirationRMSPlaceholderModel A01;

    public EMPPreviewOverlay(InspirationOverlayParamsHolder inspirationOverlayParamsHolder, InspirationRMSPlaceholderModel inspirationRMSPlaceholderModel) {
        this.A00 = inspirationOverlayParamsHolder;
        this.A01 = inspirationRMSPlaceholderModel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EMPPreviewOverlay)) {
                return false;
            }
            EMPPreviewOverlay eMPPreviewOverlay = (EMPPreviewOverlay) obj;
            if (!11T.A0O(this.A00, eMPPreviewOverlay.A00) || !11T.A0O(this.A01, eMPPreviewOverlay.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass001.A02(this.A00) * 31) + 4YU.A03(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
