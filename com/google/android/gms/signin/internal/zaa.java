package com.google.android.gms.signin.internal;

import X.28W;
import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zaa.class */
public final class zaa extends AbstractSafeParcelable implements 28W {
    public static final Parcelable.Creator CREATOR = LGm.A00(46);
    public int A00;
    public Intent A01;
    public final int A02;

    public zaa() {
        this(2, 0, null);
    }

    public zaa(int i, int i2, Intent intent) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = intent;
    }

    public final Status BCJ() {
        return this.A00 == 0 ? Status.A08 : Status.A04;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A02;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, i2);
        AbstractC01153q8.A04(parcel, 2, this.A00);
        AbstractC01153q8.A07(parcel, this.A01, 3, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
