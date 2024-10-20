package com.facebook.messaging.communitymessaging.notify;

import X.11T;
import X.1BL;
import X.7zL;
import X.7zT;
import X.AbN;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerCommunityLevelDirectInviteNotification.class */
public final class MessengerCommunityLevelDirectInviteNotification extends CommunityMessagingNotification {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(0);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final PushProperty A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerCommunityLevelDirectInviteNotification(PushProperty pushProperty, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(null, C5ap.A1V, pushProperty, num, null, null, false);
        7zT.A1W(str, str2, str3, str4);
        1BL.A1G(str5, str6);
        this.A0A = str;
        this.A0E = str2;
        this.A0C = str3;
        this.A09 = str4;
        this.A00 = str5;
        this.A01 = str6;
        this.A04 = pushProperty;
        this.A0I = z;
        this.A07 = str7;
        this.A06 = str8;
        this.A0B = str9;
        this.A0F = z2;
        this.A08 = str10;
        this.A0G = z3;
        this.A0H = z4;
        this.A0D = str11;
        this.A05 = num;
        this.A02 = str12;
        this.A03 = z5;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public Integer A05() {
        return this.A05;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A06() {
        return this.A00;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A07() {
        return this.A06;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A08() {
        return this.A01;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A09() {
        return this.A07;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0A() {
        return this.A09;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0B() {
        return this.A0A;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0C() {
        return this.A0B;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0D() {
        return this.A0C;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0E() {
        return this.A0D;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0F() {
        return this.A0E;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public boolean A0H() {
        return this.A0H;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public boolean A0I() {
        return this.A0G;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeString(this.A0D);
        parcel.writeInt(AbN.A01(parcel, this.A05));
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
