package com.facebook.messaging.navigation.home.drawer.model;

import X.0Pz;
import X.11T;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityCreationDrawerFolderKey.class */
public final class CommunityCreationDrawerFolderKey extends DrawerFolderKey {
    public static final Parcelable.Creator CREATOR = new C4Ny(31);
    public final String A00;

    public CommunityCreationDrawerFolderKey(String str) {
        11T.A0F(str, 1);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CommunityCreationDrawerFolderKey) && 11T.A0O(this.A00, ((CommunityCreationDrawerFolderKey) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return 0Pz.A0X("CommunityCreationDrawerFolderKey(communityCreationDrawerFolderKey=", this.A00, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
    }
}
