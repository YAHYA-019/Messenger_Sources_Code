package com.google.android.gms.internal.location;

import X.28W;
import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzac.class */
public final class zzac extends AbstractSafeParcelable implements 28W {
    public static final zzac A01 = new zzac(Status.A08);
    public static final Parcelable.Creator CREATOR = LGm.A00(29);
    public final Status A00;

    public zzac(Status status) {
        this.A00 = status;
    }

    public final Status BCJ() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A07(parcel, this.A00, 1, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
