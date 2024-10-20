package com.google.android.gms.safetynet;

import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: SafeBrowsingData.class */
public final class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(45);
    public String A03 = null;
    public DataHolder A02 = null;
    public ParcelFileDescriptor A01 = null;
    public long A00 = 0;
    public byte[] A04 = null;

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A03, 2);
        AbstractC01153q8.A07(parcel, this.A02, 3, i);
        AbstractC01153q8.A07(parcel, this.A01, 4, i);
        AbstractC01153q8.A05(parcel, 5, this.A00);
        AbstractC01153q8.A0B(parcel, this.A04, 6);
        AbstractC01153q8.A03(parcel, A0E);
        this.A01 = null;
    }
}
