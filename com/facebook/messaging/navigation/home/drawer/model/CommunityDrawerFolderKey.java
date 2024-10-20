package com.facebook.messaging.navigation.home.drawer.model;

import X.0Pz;
import X.11T;
import X.4YV;
import X.82M;
import X.AnonymousClass001;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityDrawerFolderKey.class */
public final class CommunityDrawerFolderKey extends DrawerFolderKey {
    public static final Parcelable.Creator CREATOR = new 82M(73);
    public final long A00;
    public final String A01;

    public CommunityDrawerFolderKey(long j, String str) {
        11T.A0F(str, 2);
        0Pz.A0t("Community:", ";Group:", str, j);
        this.A00 = j;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityDrawerFolderKey)) {
                return false;
            }
            CommunityDrawerFolderKey communityDrawerFolderKey = (CommunityDrawerFolderKey) obj;
            if (this.A00 != communityDrawerFolderKey.A00 || !11T.A0O(this.A01, communityDrawerFolderKey.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        return (((int) (j ^ (j >>> 32))) * 31) + this.A01.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CommunityDrawerFolderKey(communityId=");
        A0k.append(this.A00);
        A0k.append(", groupId=");
        A0k.append(this.A01);
        return 4YV.A0x(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
    }
}
