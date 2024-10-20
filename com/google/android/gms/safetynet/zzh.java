package com.google.android.gms.safetynet;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzh.class */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(44);
    public final int A00;
    public final boolean A01;

    public zzh(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 2, this.A00);
        AbstractC01153q8.A06(parcel, 3, this.A01);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
