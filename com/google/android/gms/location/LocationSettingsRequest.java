package com.google.android.gms.location;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

/* loaded from: LocationSettingsRequest.class */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(37);
    public zzay A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public LocationSettingsRequest(zzay zzayVar, List list, boolean z, boolean z2) {
        this.A01 = list;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = zzayVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A0A(parcel, Collections.unmodifiableList(this.A01), 1);
        AbstractC01153q8.A06(parcel, 2, this.A02);
        AbstractC01153q8.A06(parcel, 3, this.A03);
        AbstractC01153q8.A07(parcel, this.A00, 5, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
