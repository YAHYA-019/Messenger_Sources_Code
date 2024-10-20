package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.JQx;
import X.JR0;
import X.K6O;
import X.LGm;
import X.Lj7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzq.class */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(22);
    public final long A00;
    public final Lj7 A01;
    public final Lj7 A02;
    public final Lj7 A03;

    public zzq(byte[] bArr, byte[] bArr2, byte[] bArr3, long j) {
        K6O A0k = JR0.A0k(bArr);
        K6O A0k2 = JR0.A0k(bArr2);
        K6O A0k3 = JR0.A0k(bArr3);
        this.A00 = j;
        AbstractC00481b7.A02(A0k);
        this.A01 = A0k;
        AbstractC00481b7.A02(A0k2);
        this.A02 = A0k2;
        AbstractC00481b7.A02(A0k3);
        this.A03 = A0k3;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof zzq) {
            zzq zzqVar = (zzq) obj;
            if (this.A00 == zzqVar.A00 && AbstractC09524qc.A00(this.A01, zzqVar.A01) && AbstractC09524qc.A00(this.A02, zzqVar.A02)) {
                z = JR0.A1X(this.A03, zzqVar.A03);
            }
        }
        return z;
    }

    public final int hashCode() {
        return JR0.A0N(Long.valueOf(this.A00), this.A01, this.A02, this.A03);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.A00;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A05(parcel, 1, j);
        AbstractC01153q8.A0B(parcel, this.A01.A04(), 2);
        AbstractC01153q8.A0B(parcel, this.A02.A04(), 3);
        AbstractC01153q8.A0B(parcel, this.A03.A04(), 4);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
