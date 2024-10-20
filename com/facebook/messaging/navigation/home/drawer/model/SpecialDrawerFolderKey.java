package com.facebook.messaging.navigation.home.drawer.model;

import X.0Pz;
import X.11T;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SpecialDrawerFolderKey.class */
public final class SpecialDrawerFolderKey extends DrawerFolderKey {
    public static final Parcelable.Creator CREATOR = new C4Ny(33);

    public SpecialDrawerFolderKey(Integer num) {
        11T.A0F(num, 1);
        0Pz.A0W("Special:", "MARKETPLACE");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof SpecialDrawerFolderKey);
    }

    public int hashCode() {
        return -1841095125;
    }

    public String toString() {
        return 0Pz.A0X("SpecialDrawerFolderKey(folderType=", "MARKETPLACE", ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString("MARKETPLACE");
    }
}
