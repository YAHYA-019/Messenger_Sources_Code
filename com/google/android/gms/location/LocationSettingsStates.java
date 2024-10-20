package com.google.android.gms.location;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: LocationSettingsStates.class */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(39);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A03 = z4;
        this.A04 = z5;
        this.A05 = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A06(parcel, 1, this.A00);
        AbstractC01153q8.A06(parcel, 2, this.A01);
        AbstractC01153q8.A06(parcel, 3, this.A02);
        AbstractC01153q8.A06(parcel, 4, this.A03);
        AbstractC01153q8.A06(parcel, 5, this.A04);
        AbstractC01153q8.A06(parcel, 6, this.A05);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
