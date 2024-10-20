package com.google.android.gms.fido.fido2.api.common;

import X.AbM;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.JQx;
import X.JR0;
import X.LGm;
import X.Lj7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzf.class */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(15);
    public final Lj7 A00;
    public final Lj7 A01;

    public zzf(Lj7 lj7, Lj7 lj72) {
        this.A00 = lj7;
        this.A01 = lj72;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof zzf) {
            zzf zzfVar = (zzf) obj;
            if (AbstractC09524qc.A00(this.A00, zzfVar.A00)) {
                z = JR0.A1X(this.A01, zzfVar.A01);
            }
        }
        return z;
    }

    public final int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Lj7 lj7 = this.A00;
        int A0E = JQx.A0E(parcel);
        byte[] bArr = null;
        AbstractC01153q8.A0B(parcel, lj7 == null ? null : lj7.A04(), 1);
        Lj7 lj72 = this.A01;
        if (lj72 != null) {
            bArr = lj72.A04();
        }
        AbstractC01153q8.A0B(parcel, bArr, 2);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
