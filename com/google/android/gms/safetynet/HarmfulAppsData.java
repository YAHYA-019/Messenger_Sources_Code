package com.google.android.gms.safetynet;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: HarmfulAppsData.class */
public final class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(41);
    public final int A00;
    public final String A01;
    public final byte[] A02;

    public HarmfulAppsData(byte[] bArr, int i, String str) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A01, 2);
        AbstractC01153q8.A0B(parcel, this.A02, 3);
        AbstractC01153q8.A04(parcel, 4, this.A00);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
