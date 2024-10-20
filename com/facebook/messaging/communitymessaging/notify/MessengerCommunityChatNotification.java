package com.facebook.messaging.communitymessaging.notify;

import X.11T;
import X.1BL;
import X.82M;
import X.C1q8;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessengerCommunityChatNotification.class */
public final class MessengerCommunityChatNotification extends CommunityMessagingNotification {
    public static final Parcelable.Creator CREATOR = new 82M(24);
    public final int A00;
    public final Message A01;
    public final C1q8 A02;
    public final ThreadKey A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
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
    public final boolean A0L;
    public final boolean A0M;
    public final PushProperty A0N;
    public final boolean A0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerCommunityChatNotification(Message message, C1q8 c1q8, ThreadKey threadKey, PushProperty pushProperty, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(threadKey, C5ap.A1G, pushProperty, null, str7, str11, z4);
        11T.A0F(str, 1);
        11T.A0F(str2, 2);
        11T.A0F(str3, 3);
        11T.A0F(str4, 4);
        11T.A0F(threadKey, 5);
        11T.A0F(str5, 6);
        11T.A0F(str6, 7);
        11T.A0F(str7, 8);
        11T.A0F(c1q8, 22);
        this.A0A = str;
        this.A0H = str2;
        this.A0F = str3;
        this.A08 = str4;
        this.A03 = threadKey;
        this.A04 = str5;
        this.A06 = str6;
        this.A09 = str7;
        this.A0N = pushProperty;
        this.A0O = z;
        this.A07 = str8;
        this.A05 = str9;
        this.A0D = str10;
        this.A0B = str11;
        this.A0K = z2;
        this.A0M = z3;
        this.A0G = str12;
        this.A0C = str13;
        this.A0E = str14;
        this.A0I = z4;
        this.A0J = z5;
        this.A02 = c1q8;
        this.A01 = message;
        this.A0L = z6;
        this.A00 = i;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A0N, i);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        1BL.A12(parcel, this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
