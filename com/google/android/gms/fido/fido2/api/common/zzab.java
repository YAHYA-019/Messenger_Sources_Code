package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.DKD;
import X.JQx;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzab.class */
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(89);
    public final long A00;

    public zzab(long j) {
        Long valueOf = Long.valueOf(j);
        AbstractC00481b7.A02(valueOf);
        this.A00 = valueOf.longValue();
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof zzab) && this.A00 == ((zzab) obj).A00) {
            z = true;
        }
        return z;
    }

    public final int hashCode() {
        return DKD.A04(Long.valueOf(this.A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.A00;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A05(parcel, 1, j);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
