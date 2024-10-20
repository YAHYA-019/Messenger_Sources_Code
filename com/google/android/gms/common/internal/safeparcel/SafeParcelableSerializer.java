package com.google.android.gms.common.internal.safeparcel;

import X.AbstractC00481b7;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SafeParcelableSerializer.class */
public abstract class SafeParcelableSerializer {
    public static SafeParcelable A00(Parcelable.Creator creator, byte[] bArr) {
        AbstractC00481b7.A02(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }
}
