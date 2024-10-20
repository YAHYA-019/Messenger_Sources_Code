package com.facebook.messaging.business.bizrtc.model;

import X.7zO;
import X.C53v;
import X.C5ap;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: PageMessageNotification.class */
public final class PageMessageNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CSW.A00(13);
    public boolean A00;
    public final String A01;
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
    public final Integer A0C;
    public final Long A0D;
    public final String A0E;

    public PageMessageNotification(C5ap c5ap, PushProperty pushProperty, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        super(c5ap, pushProperty);
        this.A02 = str2;
        this.A0B = str12;
        this.A08 = str9;
        this.A0A = str11;
        this.A09 = str10;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
        this.A01 = str;
        this.A0E = str3;
        this.A0C = num;
        this.A0D = null;
    }

    public PageMessageNotification(C5ap c5ap, PushProperty pushProperty, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        super(c5ap, pushProperty);
        this.A02 = str2;
        this.A0B = str11;
        this.A08 = str8;
        this.A0A = str10;
        this.A09 = str9;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A01 = str;
        this.A0E = null;
        this.A0C = null;
        this.A0D = null;
    }

    public PageMessageNotification(Parcel parcel) {
        super(parcel);
        this.A02 = parcel.readString();
        this.A0B = parcel.readString();
        this.A08 = parcel.readString();
        this.A0A = parcel.readString();
        this.A09 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A01 = parcel.readString();
        this.A0E = parcel.readString();
        this.A00 = C53v.A0S(parcel);
        this.A0C = C53v.A08(parcel);
        this.A0D = parcel.readInt() == 1 ? 7zO.A0j(parcel) : null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A01);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A00 ? 1 : 0);
        C53v.A0K(parcel, this.A0C);
        C53v.A0L(parcel, this.A0D);
    }
}
