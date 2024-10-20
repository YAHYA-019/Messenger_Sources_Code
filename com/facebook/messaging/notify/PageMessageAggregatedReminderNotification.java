package com.facebook.messaging.notify;

import X.AbM;
import X.C53v;
import X.C5ap;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;

/* loaded from: PageMessageAggregatedReminderNotification.class */
public final class PageMessageAggregatedReminderNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(81);
    public boolean A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public PageMessageAggregatedReminderNotification(Parcel parcel) {
        super(parcel);
        this.A05 = parcel.readString();
        this.A04 = AbM.A0t(parcel);
        this.A03 = AbM.A0t(parcel);
        this.A01 = AbM.A0t(parcel);
        this.A02 = AbM.A0t(parcel);
        this.A06 = parcel.readString();
        this.A00 = C53v.A0S(parcel);
    }

    public PageMessageAggregatedReminderNotification(PushProperty pushProperty, String str, String str2, String str3, String str4, String str5, String str6) {
        super(C5ap.A2X, pushProperty);
        this.A05 = str;
        this.A04 = str6;
        this.A03 = str5;
        this.A01 = str3;
        this.A02 = str4;
        this.A06 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
