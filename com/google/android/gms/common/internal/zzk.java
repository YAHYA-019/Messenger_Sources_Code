package com.google.android.gms.common.internal;

import X.AbstractC01153q8;
import X.C4Ny;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzk.class */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(54);
    public int A00;
    public Bundle A01;
    public ConnectionTelemetryConfiguration A02;
    public Feature[] A03;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A01 = AbstractC01153q8.A01(parcel, 20293);
        AbstractC01153q8.A02(this.A01, parcel, 1);
        AbstractC01153q8.A0C(parcel, this.A03, 2, i);
        AbstractC01153q8.A04(parcel, 3, this.A00);
        AbstractC01153q8.A07(parcel, this.A02, 4, i);
        AbstractC01153q8.A03(parcel, A01);
    }
}
