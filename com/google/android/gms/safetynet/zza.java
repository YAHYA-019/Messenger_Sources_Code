package com.google.android.gms.safetynet;

import X.JQx;
import X.JQy;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zza.class */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(40);
    public final String A00;

    public zza(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JQy.A16(parcel, this.A00, JQx.A0E(parcel));
    }
}
