package com.google.android.gms.location;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzay.class */
public final class zzay extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(36);
    public final String A00;
    public final String A01;
    public final String A02;

    public zzay(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A00, 1);
        AbstractC01153q8.A08(parcel, this.A01, 2);
        AbstractC01153q8.A08(parcel, this.A02, 5);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
