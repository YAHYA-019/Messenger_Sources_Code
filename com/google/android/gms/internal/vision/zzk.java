package com.google.android.gms.internal.vision;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzk.class */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(32);
    public int A00;
    public boolean A01;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 2, this.A00);
        AbstractC01153q8.A06(parcel, 3, this.A01);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
