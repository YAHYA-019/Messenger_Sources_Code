package com.facebook.messaging.communitymessaging.events.creation;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zM;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityMessagingEventCreationViewData$CommunityInfo.class */
public final class CommunityMessagingEventCreationViewData$CommunityInfo extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(71);
    public final String A00;
    public final String A01;

    public CommunityMessagingEventCreationViewData$CommunityInfo(String str, String str2) {
        1BL.A1F(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityMessagingEventCreationViewData$CommunityInfo)) {
                return false;
            }
            CommunityMessagingEventCreationViewData$CommunityInfo communityMessagingEventCreationViewData$CommunityInfo = (CommunityMessagingEventCreationViewData$CommunityInfo) obj;
            if (!11T.A0O(this.A01, communityMessagingEventCreationViewData$CommunityInfo.A01) || !11T.A0O(this.A00, communityMessagingEventCreationViewData$CommunityInfo.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A00, 4YV.A02(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
