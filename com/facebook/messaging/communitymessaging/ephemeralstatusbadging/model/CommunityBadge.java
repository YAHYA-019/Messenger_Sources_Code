package com.facebook.messaging.communitymessaging.ephemeralstatusbadging.model;

import X.11T;
import X.1BL;
import X.7zO;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityBadge.class */
public final class CommunityBadge implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(70);
    public final int A00;
    public final long A01;
    public final Long A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final String A06;

    public CommunityBadge(long j, String str, int i) {
        this.A05 = null;
        this.A01 = j;
        this.A06 = str;
        this.A00 = i;
        this.A02 = null;
        this.A03 = null;
        this.A04 = null;
    }

    public CommunityBadge(Parcel parcel) {
        Long l = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A01 = parcel.readLong();
        this.A06 = parcel.readString();
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = 7zO.A0j(parcel);
        }
        this.A03 = parcel.readInt() != 0 ? 7zO.A0j(parcel) : l;
        this.A04 = AbN.A0h(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityBadge)) {
                return false;
            }
            CommunityBadge communityBadge = (CommunityBadge) obj;
            if (!11T.A0O(this.A05, communityBadge.A05) || this.A01 != communityBadge.A01 || !11T.A0O(this.A06, communityBadge.A06) || this.A00 != communityBadge.A00 || !11T.A0O(this.A02, communityBadge.A02) || !11T.A0O(this.A03, communityBadge.A03) || !11T.A0O(this.A04, communityBadge.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, (C1pq.A04(this.A06, C1pq.A01(C1pq.A03(this.A05), this.A01)) * 31) + this.A00)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CommunityBadge{badgeDescription=");
        A0k.append(this.A05);
        A0k.append(", badgeId=");
        A0k.append(this.A01);
        A0k.append(", badgeTitle=");
        A0k.append(this.A06);
        A0k.append(", badgeType=");
        A0k.append(this.A00);
        A0k.append(", expirationTimestamp=");
        A0k.append(this.A02);
        A0k.append(", latestAwardTimestamp=");
        A0k.append(this.A03);
        A0k.append(", latestBadgeSeenTimestamp=");
        A0k.append(this.A04);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A05);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        C3o5.A0g(parcel, this.A02);
        C3o5.A0g(parcel, this.A03);
        C3o5.A0g(parcel, this.A04);
    }
}
