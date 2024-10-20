package com.facebook.messaging.communitymessaging.notify;

import X.11T;
import X.1BL;
import X.7zL;
import X.7zT;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerCommunityReactionNotification.class */
public final class MessengerCommunityReactionNotification extends CommunityMessagingNotification {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(1);
    public final ThreadKey A00;
    public final PushProperty A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerCommunityReactionNotification(ThreadKey threadKey, PushProperty pushProperty, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, boolean z2, boolean z3) {
        super(threadKey, C5ap.A1d, pushProperty, null, null, null, false);
        7zT.A1W(str, str2, str3, str4);
        1BL.A1G(threadKey, str5);
        11T.A0F(str6, 7);
        this.A07 = str;
        this.A0B = str2;
        this.A09 = str3;
        this.A06 = str4;
        this.A00 = threadKey;
        this.A02 = str5;
        this.A04 = str6;
        this.A01 = pushProperty;
        this.A0E = z;
        this.A05 = str7;
        this.A03 = str8;
        this.A08 = str9;
        this.A0C = z2;
        this.A0D = z3;
        this.A0A = str10;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public ThreadKey A04() {
        return this.A00;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A06() {
        return this.A02;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A07() {
        return this.A03;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A08() {
        return this.A04;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A09() {
        return this.A05;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0A() {
        return this.A06;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0B() {
        return this.A07;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0C() {
        return this.A08;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0D() {
        return this.A09;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0E() {
        return this.A0A;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public String A0F() {
        return this.A0B;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public boolean A0H() {
        return this.A0D;
    }

    @Override // com.facebook.messaging.communitymessaging.notify.CommunityMessagingNotification
    public boolean A0I() {
        return this.A0C;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A0A);
    }
}
