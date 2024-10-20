package com.facebook.messaging.composer.platformmenu.row;

import X.11T;
import X.7zL;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: PlatformMenuRowList.class */
public final class PlatformMenuRowList implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(18);
    public final List A00;

    public PlatformMenuRowList(List list) {
        11T.A0F(list, 1);
        this.A00 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeList(this.A00);
    }
}
