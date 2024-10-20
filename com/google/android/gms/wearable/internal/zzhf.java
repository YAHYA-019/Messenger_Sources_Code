package com.google.android.gms.wearable.internal;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzhf.class */
public final class zzhf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(70);
    public final DataHolder A00;
    public final String A01;

    public zzhf(DataHolder dataHolder, String str) {
        this.A01 = str;
        this.A00 = dataHolder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A01, 1);
        AbstractC01153q8.A07(parcel, this.A00, 2, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
