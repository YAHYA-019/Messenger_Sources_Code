package com.facebook.messaging.notify;

import X.AbK;
import X.AbM;
import X.C53v;
import X.C5ap;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: RoomsSpeakeasyGenericNotification.class */
public final class RoomsSpeakeasyGenericNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(83);
    public int A00;
    public ThreadKey A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public String A0E;
    public final boolean A0F;

    public RoomsSpeakeasyGenericNotification(Parcel parcel) {
        super(parcel);
        this.A0C = AbM.A0t(parcel);
        this.A07 = AbM.A0t(parcel);
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
        this.A05 = AbM.A0t(parcel);
        this.A0A = parcel.readString();
        this.A00 = parcel.readInt();
        this.A0D = C53v.A0S(parcel);
        this.A01 = AbK.A0X(parcel);
        this.A06 = parcel.readString();
        this.A0F = C53v.A0S(parcel);
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A0B = parcel.readString();
        this.A0E = parcel.readString();
    }

    public RoomsSpeakeasyGenericNotification(ThreadKey threadKey, PushProperty pushProperty, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, boolean z) {
        super(C5ap.A2a, pushProperty);
        this.A0C = str;
        this.A07 = str2;
        this.A09 = str3;
        this.A08 = str4;
        this.A05 = str5;
        this.A0A = str6;
        this.A00 = i;
        this.A0D = false;
        this.A01 = threadKey;
        this.A06 = str7;
        this.A0F = z;
        this.A02 = str8;
        this.A04 = str9;
        this.A03 = str10;
        this.A0B = str11;
        this.A0E = str12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0E);
    }
}
