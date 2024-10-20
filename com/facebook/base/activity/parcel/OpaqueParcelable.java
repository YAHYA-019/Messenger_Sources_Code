package com.facebook.base.activity.parcel;

import X.0qB;
import X.11T;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: OpaqueParcelable.class */
public final class OpaqueParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 0qB(3);
    public final byte[] A00;

    public OpaqueParcelable(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        this.A00 = bArr;
        parcel.readByteArray(bArr);
    }

    public OpaqueParcelable(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        11T.A0A(obtain);
        try {
            parcelable.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            11T.A0A(marshall);
            this.A00 = marshall;
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        byte[] bArr = this.A00;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
    }
}
