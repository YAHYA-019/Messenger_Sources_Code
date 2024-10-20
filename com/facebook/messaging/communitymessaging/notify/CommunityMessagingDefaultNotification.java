package com.facebook.messaging.communitymessaging.notify;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zT;
import X.AbN;
import X.C5ap;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.push.constants.PushProperty;

/* loaded from: CommunityMessagingDefaultNotification.class */
public final class CommunityMessagingDefaultNotification extends CommunityMessagingNotification {
    public static final Parcelable.Creator CREATOR = CSW.A00(94);
    public final ThreadKey A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final C5ap A09;
    public final PushProperty A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommunityMessagingDefaultNotification(ThreadKey threadKey, C5ap c5ap, PushProperty pushProperty, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, boolean z2, boolean z3) {
        super(threadKey, c5ap, pushProperty, num, str7, null, false);
        7zT.A1T(str, str2, str4);
        4YV.A1M(str5, 6, str6);
        11T.A0F(c5ap, 12);
        this.A06 = str;
        this.A0H = str2;
        this.A0F = str3;
        this.A0D = str4;
        this.A00 = threadKey;
        this.A02 = str5;
        this.A03 = str6;
        this.A05 = str7;
        this.A0A = pushProperty;
        this.A0K = z;
        this.A0C = str8;
        this.A09 = c5ap;
        this.A07 = str9;
        this.A0B = str10;
        this.A0E = str11;
        this.A0I = z2;
        this.A0J = z3;
        this.A0G = str12;
        this.A08 = str13;
        this.A01 = num;
        this.A04 = str14;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public ThreadKey A04() {
        return this.A00;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public Integer A05() {
        return this.A01;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A06() {
        return this.A02;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A07() {
        return this.A0B;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A08() {
        return this.A03;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A09() {
        return this.A0C;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0A() {
        return this.A0D;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0B() {
        return this.A06;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0C() {
        return this.A0E;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0D() {
        return this.A0F;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0E() {
        return this.A0G;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0F() {
        return this.A0H;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public boolean A0H() {
        return this.A0J;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public boolean A0I() {
        return this.A0I;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0D);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeString(this.A0C);
        1BL.A12(parcel, this.A09);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A08);
        parcel.writeInt(AbN.A01(parcel, this.A01));
        parcel.writeString(this.A04);
    }
}
