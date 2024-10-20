package com.facebook.messaging.communitymessaging.notify;

import X.11T;
import X.7zT;
import X.C3o5;
import X.C5ap;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerCommunityChannelCreationNotification.class */
public final class MessengerCommunityChannelCreationNotification extends CommunityMessagingNotification {
    public static final Parcelable.Creator CREATOR = CSW.A00(95);
    public final ThreadKey A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final PushProperty A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerCommunityChannelCreationNotification(ThreadKey threadKey, PushProperty pushProperty, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, boolean z2, boolean z3) {
        super(threadKey, C5ap.A1F, pushProperty, num, str7, null, false);
        11T.A0F(str, 1);
        7zT.A11(2, str2, str4, threadKey, str5);
        11T.A0F(str6, 7);
        this.A0B = str;
        this.A0F = str2;
        this.A0D = str3;
        this.A0A = str4;
        this.A00 = threadKey;
        this.A03 = str5;
        this.A04 = str6;
        this.A06 = str7;
        this.A07 = pushProperty;
        this.A0I = z;
        this.A09 = str8;
        this.A08 = str9;
        this.A0C = str10;
        this.A01 = num;
        this.A02 = num2;
        this.A0G = z2;
        this.A0H = z3;
        this.A0E = str11;
        this.A05 = str12;
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
        return this.A03;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A07() {
        return this.A08;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A08() {
        return this.A04;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A09() {
        return this.A09;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0A() {
        return this.A0A;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0B() {
        return this.A0B;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0C() {
        return this.A0C;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0D() {
        return this.A0D;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0E() {
        return this.A0E;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0F() {
        return this.A0F;
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
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A07, i);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0C);
        C3o5.A0f(parcel, this.A01);
        C3o5.A0f(parcel, this.A02);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A05);
    }
}
