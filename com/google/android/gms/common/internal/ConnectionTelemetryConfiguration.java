package com.google.android.gms.common.internal;

import X.AbstractC01153q8;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: ConnectionTelemetryConfiguration.class */
public final class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(55);
    public final int A00;
    public final RootTelemetryConfiguration A01;
    public final boolean A02;
    public final boolean A03;
    public final int[] A04;
    public final int[] A05;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, int[] iArr, int[] iArr2, int i, boolean z, boolean z2) {
        this.A01 = rootTelemetryConfiguration;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = iArr;
        this.A00 = i;
        this.A05 = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A01 = AbstractC01153q8.A01(parcel, 20293);
        AbstractC01153q8.A07(parcel, this.A01, 1, i);
        AbstractC01153q8.A06(parcel, 2, this.A02);
        AbstractC01153q8.A06(parcel, 3, this.A03);
        int[] iArr = this.A04;
        if (iArr != null) {
            int A012 = AbstractC01153q8.A01(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC01153q8.A03(parcel, A012);
        }
        AbstractC01153q8.A04(parcel, 5, this.A00);
        int[] iArr2 = this.A05;
        if (iArr2 != null) {
            int A013 = AbstractC01153q8.A01(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC01153q8.A03(parcel, A013);
        }
        AbstractC01153q8.A03(parcel, A01);
    }
}
