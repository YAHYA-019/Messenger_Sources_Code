package com.google.android.gms.common.internal;

import X.AbstractC01153q8;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: RootTelemetryConfiguration.class */
public final class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(53);
    public final int A00;
    public final int A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public RootTelemetryConfiguration(int i, int i2, int i3, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A01 = AbstractC01153q8.A01(parcel, 20293);
        AbstractC01153q8.A04(parcel, 1, this.A00);
        AbstractC01153q8.A06(parcel, 2, this.A03);
        AbstractC01153q8.A06(parcel, 3, this.A04);
        AbstractC01153q8.A04(parcel, 4, this.A01);
        AbstractC01153q8.A04(parcel, 5, this.A02);
        AbstractC01153q8.A03(parcel, A01);
    }
}
