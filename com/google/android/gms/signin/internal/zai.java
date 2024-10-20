package com.google.android.gms.signin.internal;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zat;

/* loaded from: zai.class */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(48);
    public final int A00;
    public final zat A01;

    public zai(zat zatVar, int i) {
        this.A00 = i;
        this.A01 = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A00);
        AbstractC01153q8.A07(parcel, this.A01, 2, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
