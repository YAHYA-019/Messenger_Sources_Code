package com.google.android.gms.wearable.internal;

import X.AbM;
import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzb.class */
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(66);
    public final String A00;
    public final boolean A01;

    public zzb(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zzb)) {
                return false;
            }
            zzb zzbVar = (zzb) obj;
            if (!this.A00.equals(zzbVar.A00) || this.A01 != zzbVar.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AbM.A05(this.A00, Boolean.valueOf(this.A01));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A00, 1);
        AbstractC01153q8.A06(parcel, 2, this.A01);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
