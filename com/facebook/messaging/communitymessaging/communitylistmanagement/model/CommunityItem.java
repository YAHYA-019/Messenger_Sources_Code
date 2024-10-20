package com.facebook.messaging.communitymessaging.communitylistmanagement.model;

import X.11T;
import X.1BJ;
import X.1BL;
import X.4YU;
import X.7zR;
import X.AbstractC00603o4;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingCommunityType;

/* loaded from: CommunityItem.class */
public final class CommunityItem extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(66);
    public boolean A00;
    public final CommunityItemIcon A01;
    public final CommunityItemKey A02;
    public final CommunityMessagingCommunityType A03;
    public final String A04;

    public CommunityItem(CommunityItemIcon communityItemIcon, CommunityItemKey communityItemKey, CommunityMessagingCommunityType communityMessagingCommunityType, String str, boolean z) {
        7zR.A1N(communityItemKey, str);
        this.A02 = communityItemKey;
        this.A01 = communityItemIcon;
        this.A04 = str;
        this.A00 = z;
        this.A03 = communityMessagingCommunityType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityItem)) {
                return false;
            }
            CommunityItem communityItem = (CommunityItem) obj;
            if (!11T.A0O(this.A02, communityItem.A02) || !11T.A0O(this.A01, communityItem.A01) || !11T.A0O(this.A04, communityItem.A04) || this.A00 != communityItem.A00 || this.A03 != communityItem.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.A04, (1BL.A03(this.A02) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0)) * 31) + 4YU.A03(this.A03);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CommunityItem(key=");
        A0k.append(this.A02);
        A0k.append(", icon=");
        A0k.append(this.A01);
        A0k.append(", title=");
        A0k.append(this.A04);
        A0k.append(AbstractC00603o4.A00(93));
        A0k.append(this.A00);
        A0k.append(1BJ.A00(243));
        return AnonymousClass002.A0K(this.A03, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        this.A02.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeParcelable(this.A03, i);
    }
}
