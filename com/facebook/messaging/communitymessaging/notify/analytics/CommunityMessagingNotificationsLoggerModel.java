package com.facebook.messaging.communitymessaging.notify.analytics;

import X.11T;
import X.1BJ;
import X.1BL;
import X.AbE;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BNr;
import X.BOA;
import X.C04v;
import X.C1237Abf;
import X.C4Ny;
import X.JQw;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* loaded from: CommunityMessagingNotificationsLoggerModel.class */
public final class CommunityMessagingNotificationsLoggerModel extends C04v implements Parcelable {
    public static final C1237Abf A0E = new Object();
    public static final Parcelable.Creator CREATOR = new C4Ny(6);
    public Map A00;
    public final BNr A01;
    public final BOA A02;
    public final Integer A03;
    public final Long A04;
    public final Long A05;
    public final Long A06;
    public final Long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public CommunityMessagingNotificationsLoggerModel() {
        this(BNr.A01, BOA.A01, null, null, null, null, null, null, "notification", null, null, null, null, null);
    }

    public CommunityMessagingNotificationsLoggerModel(BNr bNr, BOA boa, Integer num, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        11T.A0F(boa, 5);
        11T.A0F(bNr, 7);
        this.A04 = l;
        this.A07 = l2;
        this.A05 = l3;
        this.A09 = str;
        this.A02 = boa;
        this.A0D = str2;
        this.A01 = bNr;
        this.A0B = str3;
        this.A06 = l4;
        this.A08 = str4;
        this.A0C = str5;
        this.A0A = str6;
        this.A03 = num;
        this.A00 = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityMessagingNotificationsLoggerModel)) {
                return false;
            }
            CommunityMessagingNotificationsLoggerModel communityMessagingNotificationsLoggerModel = (CommunityMessagingNotificationsLoggerModel) obj;
            if (!11T.A0O(this.A04, communityMessagingNotificationsLoggerModel.A04) || !11T.A0O(this.A07, communityMessagingNotificationsLoggerModel.A07) || !11T.A0O(this.A05, communityMessagingNotificationsLoggerModel.A05) || !11T.A0O(this.A09, communityMessagingNotificationsLoggerModel.A09) || this.A02 != communityMessagingNotificationsLoggerModel.A02 || !11T.A0O(this.A0D, communityMessagingNotificationsLoggerModel.A0D) || this.A01 != communityMessagingNotificationsLoggerModel.A01 || !11T.A0O(this.A0B, communityMessagingNotificationsLoggerModel.A0B) || !11T.A0O(this.A06, communityMessagingNotificationsLoggerModel.A06) || !11T.A0O(this.A08, communityMessagingNotificationsLoggerModel.A08) || !11T.A0O(this.A0C, communityMessagingNotificationsLoggerModel.A0C) || !11T.A0O(this.A0A, communityMessagingNotificationsLoggerModel.A0A) || !11T.A0O(this.A03, communityMessagingNotificationsLoggerModel.A03) || !11T.A0O(this.A00, communityMessagingNotificationsLoggerModel.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A05 = (((((((((((AnonymousClass002.A05(this.A01, (AnonymousClass002.A05(this.A02, ((((((AnonymousClass001.A02(this.A04) * 31) + AnonymousClass001.A02(this.A07)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + 1BL.A05(this.A09)) * 31) + 1BL.A05(this.A0D)) * 31) + 1BL.A05(this.A0B)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + 1BL.A05(this.A08)) * 31) + 1BL.A05(this.A0C)) * 31) + 1BL.A05(this.A0A)) * 31) + AnonymousClass001.A02(this.A03)) * 31;
        Map map = this.A00;
        if (map != null) {
            i = map.hashCode();
        }
        return A05 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CommunityMessagingNotificationsLoggerModel(communityId=");
        A0k.append(this.A04);
        A0k.append(AbE.A00(100));
        A0k.append(this.A07);
        A0k.append(", groupId=");
        A0k.append(this.A05);
        A0k.append(", event=");
        A0k.append(this.A09);
        A0k.append(AbE.A00(99));
        A0k.append(this.A02);
        A0k.append(", source=");
        A0k.append(this.A0D);
        A0k.append(JQw.A00(4));
        A0k.append(this.A01);
        A0k.append(", notificationType=");
        A0k.append(this.A0B);
        A0k.append(", senderId=");
        A0k.append(this.A06);
        A0k.append(", communityNotifId=");
        A0k.append(this.A08);
        A0k.append(", pushNotifId=");
        A0k.append(this.A0C);
        A0k.append(AbE.A00(31));
        A0k.append(this.A0A);
        A0k.append(", joinBehavior=");
        A0k.append(this.A03);
        A0k.append(1BJ.A00(241));
        return AnonymousClass002.A0K(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Long l = this.A04;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.A07;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        Long l3 = this.A05;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        parcel.writeString(this.A09);
        parcel.writeString(this.A02.name());
        parcel.writeString(this.A0D);
        parcel.writeString(this.A01.name());
        parcel.writeString(this.A0B);
        Long l4 = this.A06;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        parcel.writeString(this.A08);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0A);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Map map = this.A00;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            parcel.writeString(AnonymousClass001.A0j(A0z));
            parcel.writeString((String) A0z.getValue());
        }
    }
}
