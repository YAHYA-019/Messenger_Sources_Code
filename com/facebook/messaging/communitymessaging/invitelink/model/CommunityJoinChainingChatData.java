package com.facebook.messaging.communitymessaging.invitelink.model;

import X.11T;
import X.1BL;
import X.AbG;
import X.C1pq;
import X.C3o5;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityJoinChainingChatData.class */
public final class CommunityJoinChainingChatData implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(77);
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final double A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final String A09;

    public CommunityJoinChainingChatData(Parcel parcel) {
        AbG.A1X(this);
        this.A08 = parcel.readLong();
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A05 = parcel.readDouble();
        this.A06 = parcel.readInt();
        this.A02 = C3o5.A0O(parcel);
        this.A09 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A07 = parcel.readInt();
    }

    public CommunityJoinChainingChatData(String str, String str2, String str3, String str4, String str5, double d, int i, int i2, long j, long j2) {
        this.A08 = j;
        this.A01 = str;
        this.A05 = d;
        this.A06 = i;
        this.A02 = str2;
        C1pq.A08("secondaryThreadPictureUrl", str3);
        this.A09 = str3;
        this.A00 = j2;
        C1pq.A08("threadName", str4);
        this.A03 = str4;
        C1pq.A08("threadPictureUrl", str5);
        this.A04 = str5;
        this.A07 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityJoinChainingChatData)) {
                return false;
            }
            CommunityJoinChainingChatData communityJoinChainingChatData = (CommunityJoinChainingChatData) obj;
            if (this.A08 != communityJoinChainingChatData.A08 || !11T.A0O(this.A01, communityJoinChainingChatData.A01) || this.A05 != communityJoinChainingChatData.A05 || this.A06 != communityJoinChainingChatData.A06 || !11T.A0O(this.A02, communityJoinChainingChatData.A02) || !11T.A0O(this.A09, communityJoinChainingChatData.A09) || this.A00 != communityJoinChainingChatData.A00 || !11T.A0O(this.A03, communityJoinChainingChatData.A03) || !11T.A0O(this.A04, communityJoinChainingChatData.A04) || this.A07 != communityJoinChainingChatData.A07) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A01(C1pq.A04(this.A09, C1pq.A04(this.A02, (C1pq.A00(this.A05, C1pq.A04(this.A01, 1BL.A01(this.A08) + 31)) * 31) + this.A06)), this.A00))) * 31) + this.A07;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A08);
        1BL.A13(parcel, this.A01);
        parcel.writeDouble(this.A05);
        parcel.writeInt(this.A06);
        1BL.A13(parcel, this.A02);
        parcel.writeString(this.A09);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A07);
    }
}
