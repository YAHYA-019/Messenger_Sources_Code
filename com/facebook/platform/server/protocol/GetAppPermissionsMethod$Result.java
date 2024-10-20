package com.facebook.platform.server.protocol;

import X.11T;
import X.4YV;
import X.AnonymousClass001;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: GetAppPermissionsMethod$Result.class */
public final class GetAppPermissionsMethod$Result implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(42);
    public final List A00;
    public final boolean A01;

    public GetAppPermissionsMethod$Result(Parcel parcel) {
        this.A01 = 4YV.A1U(parcel.readByte());
        ArrayList A0s = AnonymousClass001.A0s();
        this.A00 = A0s;
        parcel.readStringList(A0s);
    }

    public GetAppPermissionsMethod$Result(List list, boolean z) {
        this.A01 = z;
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.A00);
    }
}
