package com.google.android.gms.wearable.internal;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzhu.class */
public final class zzhu extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(72);
    public final String A00;

    public zzhu(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A00, 1);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
