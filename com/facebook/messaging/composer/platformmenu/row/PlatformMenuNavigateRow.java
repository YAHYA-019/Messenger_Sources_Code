package com.facebook.messaging.composer.platformmenu.row;

import X.11T;
import X.7zL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PlatformMenuNavigateRow.class */
public final class PlatformMenuNavigateRow implements PlatformMenuRow {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(16);
    public final String A00;
    public final String A01;

    public PlatformMenuNavigateRow(String str) {
        this.A00 = str;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
    }
}
