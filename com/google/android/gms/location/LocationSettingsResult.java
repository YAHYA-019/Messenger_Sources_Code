package com.google.android.gms.location;

import X.28W;
import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: LocationSettingsResult.class */
public final class LocationSettingsResult extends AbstractSafeParcelable implements 28W {
    public static final Parcelable.Creator CREATOR = LGm.A00(38);
    public final Status A00;
    public final LocationSettingsStates A01;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.A00 = status;
        this.A01 = locationSettingsStates;
    }

    public final Status BCJ() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A07(parcel, this.A00, 1, i);
        AbstractC01153q8.A07(parcel, this.A01, 2, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
