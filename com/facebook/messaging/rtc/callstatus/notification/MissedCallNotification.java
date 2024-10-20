package com.facebook.messaging.rtc.callstatus.notification;

import X.0S2;
import X.11T;
import X.1BL;
import X.82M;
import X.AnonymousClass001;
import X.C50c;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.accountswitch.model.MessengerAccountType;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;
import java.util.ArrayList;

/* loaded from: MissedCallNotification.class */
public final class MissedCallNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = new 82M(80);
    public final long A00;
    public final MessengerAccountType A01;
    public final ThreadKey A02;
    public final C50c A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final ArrayList A0E;
    public final boolean A0F;

    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, X.50c] */
    public MissedCallNotification(Parcel parcel) {
        super(parcel);
        this.A0D = parcel.readString();
        this.A0C = parcel.readString();
        this.A07 = parcel.readString();
        this.A0B = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A06 = parcel.readString();
        this.A0A = parcel.readString();
        ArrayList A0s = AnonymousClass001.A0s();
        this.A0E = A0s;
        parcel.readStringList(A0s);
        this.A00 = parcel.readLong();
        this.A0F = parcel.readInt() == 0 ? false : true;
        this.A05 = parcel.readString();
        this.A03 = new Object();
        this.A04 = 0S2.A00(3)[parcel.readInt()];
        this.A02 = (ThreadKey) 1BL.A0C(parcel, ThreadKey.class);
        this.A01 = (MessengerAccountType) 1BL.A0C(parcel, MessengerAccountType.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissedCallNotification(MessengerAccountType messengerAccountType, ThreadKey threadKey, C50c c50c, PushProperty pushProperty, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList, long j, boolean z) {
        super(C5ap.A2C, pushProperty);
        11T.A0F(num, 14);
        this.A0D = str;
        this.A0C = str2;
        this.A07 = str3;
        this.A0B = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A06 = null;
        this.A0A = str7;
        this.A0E = arrayList;
        this.A00 = j;
        this.A0F = z;
        this.A05 = str8;
        this.A03 = c50c;
        this.A04 = num;
        this.A02 = threadKey;
        this.A01 = messengerAccountType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0A);
        parcel.writeStringList(this.A0E);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A04.intValue());
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
    }
}
