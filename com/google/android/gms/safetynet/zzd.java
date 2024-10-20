package com.google.android.gms.safetynet;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzd.class */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(42);
    public final int A00;
    public final long A01;
    public final HarmfulAppsData[] A02;
    public final boolean A03;

    public zzd(HarmfulAppsData[] harmfulAppsDataArr, int i, long j, boolean z) {
        this.A01 = j;
        this.A02 = harmfulAppsDataArr;
        this.A03 = z;
        this.A00 = z ? i : -1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A05(parcel, 2, this.A01);
        AbstractC01153q8.A0C(parcel, this.A02, 3, i);
        AbstractC01153q8.A04(parcel, 4, this.A00);
        AbstractC01153q8.A06(parcel, 5, this.A03);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
