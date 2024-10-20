package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.7zU;
import X.C1pq;
import X.C3o5;
import X.EnumC3499Mfu;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXFBChannelMessageType;

/* loaded from: InspirationChannelMessageReshareInfo.class */
public final class InspirationChannelMessageReshareInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKc(5);
    public final int A00;
    public final EnumC3499Mfu A01;
    public final GraphQLXFBChannelMessageType A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public InspirationChannelMessageReshareInfo(EnumC3499Mfu enumC3499Mfu, GraphQLXFBChannelMessageType graphQLXFBChannelMessageType, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        C1pq.A08("channelImageUri", str);
        this.A03 = str;
        C1pq.A08("channelName", str2);
        this.A04 = str2;
        this.A01 = enumC3499Mfu;
        this.A00 = i;
        this.A05 = str3;
        C1pq.A08("messageAuthorProfilePicUrl", str4);
        this.A06 = str4;
        C1pq.A08("messageId", str5);
        this.A07 = str5;
        this.A08 = str6;
        this.A02 = graphQLXFBChannelMessageType;
        C1pq.A08("threadId", str7);
        this.A09 = str7;
    }

    public InspirationChannelMessageReshareInfo(Parcel parcel) {
        this.A03 = 7zU.A0l(parcel, this);
        this.A04 = parcel.readString();
        GraphQLXFBChannelMessageType graphQLXFBChannelMessageType = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = EnumC3499Mfu.values()[parcel.readInt()];
        }
        this.A00 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? GraphQLXFBChannelMessageType.values()[parcel.readInt()] : graphQLXFBChannelMessageType;
        this.A09 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationChannelMessageReshareInfo)) {
                return false;
            }
            InspirationChannelMessageReshareInfo inspirationChannelMessageReshareInfo = (InspirationChannelMessageReshareInfo) obj;
            if (!11T.A0O(this.A03, inspirationChannelMessageReshareInfo.A03) || !11T.A0O(this.A04, inspirationChannelMessageReshareInfo.A04) || this.A01 != inspirationChannelMessageReshareInfo.A01 || this.A00 != inspirationChannelMessageReshareInfo.A00 || !11T.A0O(this.A05, inspirationChannelMessageReshareInfo.A05) || !11T.A0O(this.A06, inspirationChannelMessageReshareInfo.A06) || !11T.A0O(this.A07, inspirationChannelMessageReshareInfo.A07) || !11T.A0O(this.A08, inspirationChannelMessageReshareInfo.A08) || this.A02 != inspirationChannelMessageReshareInfo.A02 || !11T.A0O(this.A09, inspirationChannelMessageReshareInfo.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, (((C1pq.A04(this.A04, C1pq.A03(this.A03)) * 31) + C3o5.A03(this.A01)) * 31) + this.A00))));
        GraphQLXFBChannelMessageType graphQLXFBChannelMessageType = this.A02;
        if (graphQLXFBChannelMessageType != null) {
            i = graphQLXFBChannelMessageType.ordinal();
        }
        return C1pq.A04(this.A09, (A04 * 31) + i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        C3o5.A0e(parcel, this.A01);
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        1BL.A13(parcel, this.A08);
        C3o5.A0e(parcel, this.A02);
        parcel.writeString(this.A09);
    }
}
