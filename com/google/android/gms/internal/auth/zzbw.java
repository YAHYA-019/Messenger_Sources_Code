package com.google.android.gms.internal.auth;

import X.AbstractC01153q8;
import X.JQx;
import X.JQy;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzbw.class */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(27);
    public String A00;
    public final int A01;

    public zzbw() {
        this.A01 = 1;
    }

    public zzbw(int i, String str) {
        this.A01 = i;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, i2);
        JQy.A16(parcel, this.A00, A0E);
    }
}
