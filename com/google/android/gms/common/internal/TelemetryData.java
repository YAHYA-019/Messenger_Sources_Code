package com.google.android.gms.common.internal;

import X.AbstractC01153q8;
import X.JQx;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: TelemetryData.class */
public final class TelemetryData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(82);
    public List A00;
    public final int A01;

    public TelemetryData(List list, int i) {
        this.A01 = i;
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A01);
        AbstractC01153q8.A0A(parcel, this.A00, 2);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
