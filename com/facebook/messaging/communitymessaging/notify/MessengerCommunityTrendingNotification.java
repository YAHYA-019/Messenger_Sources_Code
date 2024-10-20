package com.facebook.messaging.communitymessaging.notify;

import X.11T;
import X.7zL;
import X.7zT;
import X.C3o5;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerCommunityTrendingNotification.class */
public final class MessengerCommunityTrendingNotification extends CommunityMessagingNotification {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(2);
    public final ThreadKey A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final PushProperty A05;
    public final Integer A06;
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
    public MessengerCommunityTrendingNotification(ThreadKey threadKey, PushProperty pushProperty, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3) {
        super(threadKey, C5ap.A1f, pushProperty, num, str7, null, false);
        11T.A0F(str, 1);
        7zT.A11(2, str2, str4, threadKey, str5);
        11T.A0F(str6, 7);
        this.A0A = str;
        this.A0E = str2;
        this.A0C = str3;
        this.A09 = str4;
        this.A00 = threadKey;
        this.A02 = str5;
        this.A03 = str6;
        this.A04 = str7;
        this.A05 = pushProperty;
        this.A0H = z;
        this.A08 = str8;
        this.A07 = str9;
        this.A0B = str10;
        this.A06 = num;
        this.A01 = num2;
        this.A0F = z2;
        this.A0G = z3;
        this.A0D = str11;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public ThreadKey A04() {
        return this.A00;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public Integer A05() {
        return this.A06;
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
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0B);
        C3o5.A0f(parcel, this.A06);
        C3o5.A0f(parcel, this.A01);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeString(this.A0D);
    }
}
