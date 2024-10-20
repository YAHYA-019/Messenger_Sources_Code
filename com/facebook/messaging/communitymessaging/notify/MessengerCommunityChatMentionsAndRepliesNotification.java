package com.facebook.messaging.communitymessaging.notify;

import X.11T;
import X.1BL;
import X.7zR;
import X.7zT;
import X.C5ap;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerCommunityChatMentionsAndRepliesNotification.class */
public final class MessengerCommunityChatMentionsAndRepliesNotification extends CommunityMessagingNotification {
    public static final Parcelable.Creator CREATOR = CSW.A00(97);
    public final int A00;
    public final ThreadKey A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final PushProperty A06;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerCommunityChatMentionsAndRepliesNotification(ThreadKey threadKey, PushProperty pushProperty, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(threadKey, C5ap.A1O, pushProperty, null, str7, null, false);
        7zT.A1W(str, str2, str3, str4);
        1BL.A1G(threadKey, str5);
        7zR.A1P(str6, str7);
        this.A0A = str;
        this.A0E = str2;
        this.A0C = str3;
        this.A09 = str4;
        this.A01 = threadKey;
        this.A02 = str5;
        this.A03 = str6;
        this.A04 = str7;
        this.A06 = pushProperty;
        this.A0H = z;
        this.A08 = str8;
        this.A07 = str9;
        this.A0B = str10;
        this.A0F = z2;
        this.A0G = z3;
        this.A0D = str11;
        this.A05 = z4;
        this.A00 = i;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public ThreadKey A04() {
        return this.A01;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A06() {
        return this.A02;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A07() {
        return this.A07;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A08() {
        return this.A03;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A09() {
        return this.A08;
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
        return this.A0G;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public boolean A0I() {
        return this.A0F;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
