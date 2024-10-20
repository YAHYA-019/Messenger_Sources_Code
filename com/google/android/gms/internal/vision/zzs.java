package com.google.android.gms.internal.vision;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzs.class */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(33);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 2, this.A00);
        AbstractC01153q8.A04(parcel, 3, this.A01);
        AbstractC01153q8.A04(parcel, 4, this.A02);
        AbstractC01153q8.A05(parcel, 5, this.A04);
        AbstractC01153q8.A04(parcel, 6, this.A03);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
