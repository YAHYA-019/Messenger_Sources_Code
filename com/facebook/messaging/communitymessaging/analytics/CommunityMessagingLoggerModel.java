package com.facebook.messaging.communitymessaging.analytics;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zN;
import X.AbG;
import X.AbL;
import X.AnonymousClass001;
import X.BOr;
import X.C04v;
import X.CSW;
import X.EnumC3499Mfu;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: CommunityMessagingLoggerModel.class */
public final class CommunityMessagingLoggerModel extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(56);
    public BOr A00;
    public EnumC3499Mfu A01;
    public Map A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public CommunityMessagingLoggerModel() {
        this(null, null, null, null, null, null, null, "messenger", null, null, null, null);
    }

    public CommunityMessagingLoggerModel(BOr bOr, EnumC3499Mfu enumC3499Mfu, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map map) {
        this.A03 = str;
        this.A05 = str2;
        this.A0B = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A04 = str7;
        this.A02 = map;
        this.A07 = str8;
        this.A00 = bOr;
        this.A01 = enumC3499Mfu;
        this.A06 = str9;
        this.A01 = enumC3499Mfu == null ? EnumC3499Mfu.A0v : enumC3499Mfu;
        this.A00 = bOr == null ? BOr.A0p : bOr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityMessagingLoggerModel)) {
                return false;
            }
            CommunityMessagingLoggerModel communityMessagingLoggerModel = (CommunityMessagingLoggerModel) obj;
            if (!11T.A0O(this.A03, communityMessagingLoggerModel.A03) || !11T.A0O(this.A05, communityMessagingLoggerModel.A05) || !11T.A0O(this.A0B, communityMessagingLoggerModel.A0B) || !11T.A0O(this.A08, communityMessagingLoggerModel.A08) || !11T.A0O(this.A09, communityMessagingLoggerModel.A09) || !11T.A0O(this.A0A, communityMessagingLoggerModel.A0A) || !11T.A0O(this.A04, communityMessagingLoggerModel.A04) || !11T.A0O(this.A02, communityMessagingLoggerModel.A02) || !11T.A0O(this.A07, communityMessagingLoggerModel.A07) || this.A00 != communityMessagingLoggerModel.A00 || this.A01 != communityMessagingLoggerModel.A01 || !11T.A0O(this.A06, communityMessagingLoggerModel.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((((((1BL.A05(this.A03) * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A0B)) * 31) + 1BL.A05(this.A08)) * 31) + 1BL.A05(this.A09)) * 31) + 1BL.A05(this.A0A)) * 31) + 1BL.A05(this.A04)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + 1BL.A05(this.A07)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 7zN.A05(this.A06);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CommunityMessagingLoggerModel(communityId=");
        A0k.append(this.A03);
        A0k.append(", groupId=");
        A0k.append(this.A05);
        A0k.append(", threadId=");
        A0k.append(this.A0B);
        A0k.append(", recipientId=");
        A0k.append(this.A08);
        A0k.append(", source=");
        A0k.append(this.A09);
        A0k.append(", surface=");
        A0k.append(this.A0A);
        A0k.append(", eventType=");
        A0k.append(this.A04);
        A0k.append(", extrasMap=");
        A0k.append(this.A02);
        A0k.append(", parentSurface=");
        A0k.append(this.A07);
        A0k.append(", parentSurfaceEnum=");
        A0k.append(this.A00);
        A0k.append(", entrypoint=");
        A0k.append(this.A01);
        A0k.append(", messageId=");
        A0k.append(this.A06);
        return 4YV.A0x(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A04);
        Map map = this.A02;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            AbG.A1G(parcel, map);
            Iterator A0y = AnonymousClass001.A0y(map);
            while (A0y.hasNext()) {
                AbL.A0n(parcel, A0y);
            }
        }
        parcel.writeString(this.A07);
        BOr bOr = this.A00;
        if (bOr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, bOr);
        }
        EnumC3499Mfu enumC3499Mfu = this.A01;
        if (enumC3499Mfu == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, enumC3499Mfu);
        }
        parcel.writeString(this.A06);
    }
}
