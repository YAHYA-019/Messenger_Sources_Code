package com.facebook.messaging.navigation.home.drawer.model;

import X.0Pz;
import X.11T;
import X.1BL;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TakenDownCommunityDrawerFolderKey.class */
public final class TakenDownCommunityDrawerFolderKey extends DisableStateDrawerFolderKey {
    public static final Parcelable.Creator CREATOR = CST.A00(54);
    public final long A00;

    public TakenDownCommunityDrawerFolderKey(long j) {
        0Pz.A0W("DisableState:", 0Pz.A0U("TakenDownCommunity:", j));
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TakenDownCommunityDrawerFolderKey) && this.A00 == ((TakenDownCommunityDrawerFolderKey) obj).A00);
    }

    public int hashCode() {
        return 1BL.A01(this.A00);
    }

    public String toString() {
        return 0Pz.A0Q("TakenDownCommunityDrawerFolderKey(communityId=", ')', this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
    }
}
