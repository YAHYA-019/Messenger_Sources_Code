package com.facebook.messaging.communitymessaging.communitylistmanagement.model;

import X.0Pz;
import X.11T;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityItemUriIcon.class */
public final class CommunityItemUriIcon extends CommunityItemIcon {
    public static final Parcelable.Creator CREATOR = CSW.A00(68);
    public final String A00;

    public CommunityItemUriIcon(String str) {
        11T.A0F(str, 1);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CommunityItemUriIcon) && 11T.A0O(this.A00, ((CommunityItemUriIcon) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return 0Pz.A0X("CommunityItemUriIcon(uri=", this.A00, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
    }
}
