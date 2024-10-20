package com.facebook.messaging.navigation.home.drawer.model;

import X.0Pz;
import X.11T;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TravelDrawerFolderKey.class */
public final class TravelDrawerFolderKey extends DrawerFolderKey {
    public static final Parcelable.Creator CREATOR = CST.A00(55);
    public final String A00;

    public TravelDrawerFolderKey(String str) {
        11T.A0F(str, 1);
        0Pz.A0W("Play:", str);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TravelDrawerFolderKey) && 11T.A0O(this.A00, ((TravelDrawerFolderKey) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return 0Pz.A0X("TravelDrawerFolderKey(appId=", this.A00, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
    }
}
