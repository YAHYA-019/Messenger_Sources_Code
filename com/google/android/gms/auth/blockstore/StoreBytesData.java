package com.google.android.gms.auth.blockstore;

import X.AbstractC01153q8;
import X.JQx;
import X.JQy;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: StoreBytesData.class */
public final class StoreBytesData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(77);
    public final String A00;
    public final boolean A01;
    public final byte[] A02;

    public StoreBytesData(String str, byte[] bArr, boolean z) {
        this.A02 = bArr;
        this.A01 = z;
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A0B(parcel, this.A02, 1);
        AbstractC01153q8.A06(parcel, 2, this.A01);
        JQy.A17(parcel, this.A00, A0E);
    }
}
