package com.facebook.messaging.communitymessaging.communitylistmanagement.model;

import X.11T;
import X.4YV;
import X.7zM;
import X.7zQ;
import X.AnonymousClass001;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityItemKey.class */
public final class CommunityItemKey extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(67);
    public final long A00;
    public final String A01;

    public CommunityItemKey(long j, String str) {
        11T.A0F(str, 2);
        this.A00 = j;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityItemKey)) {
                return false;
            }
            CommunityItemKey communityItemKey = (CommunityItemKey) obj;
            if (this.A00 != communityItemKey.A00 || !11T.A0O(this.A01, communityItemKey.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, 7zQ.A02(this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CommunityItemKey(communityId=");
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
