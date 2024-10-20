package com.facebook.messaging.communitymessaging.adminactions.mutememberoptions.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityRule.class */
public final class CommunityRule extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(52);
    public final long A00;
    public final String A01;
    public final String A02;

    public CommunityRule(String str, String str2, long j) {
        11T.A0F(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityRule)) {
                return false;
            }
            CommunityRule communityRule = (CommunityRule) obj;
            if (!11T.A0O(this.A02, communityRule.A02) || !11T.A0O(this.A01, communityRule.A01) || this.A00 != communityRule.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((4YV.A02(this.A02) + 1BL.A05(this.A01)) * 31) + 1BL.A01(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
    }
}
