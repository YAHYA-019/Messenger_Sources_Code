package com.facebook.messaging.notify.type;

import X.1BL;
import X.82M;
import X.C53v;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.push.constants.PushProperty;

/* loaded from: MessageReactionNotification.class */
public final class MessageReactionNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = new 82M(74);
    public boolean A00;
    public final ThreadKey A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public MessageReactionNotification(Parcel parcel) {
        super(parcel);
        this.A01 = (ThreadKey) 1BL.A0C(parcel, ThreadKey.class);
        this.A03 = parcel.readString();
        this.A00 = C53v.A0S(parcel);
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
        this.A04 = parcel.readString();
        this.A06 = parcel.readString();
        this.A02 = null;
        this.A05 = null;
    }

    public MessageReactionNotification(ThreadKey threadKey, PushProperty pushProperty, String str) {
        super(C5ap.A15, pushProperty);
        this.A01 = threadKey;
        this.A03 = str;
        this.A02 = null;
        this.A05 = null;
        this.A08 = null;
        this.A07 = null;
        this.A04 = null;
        this.A06 = null;
    }

    public MessageReactionNotification(ThreadKey threadKey, PushProperty pushProperty, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(C5ap.A15, pushProperty);
        this.A02 = str;
        this.A05 = str2;
        this.A01 = threadKey;
        this.A03 = str3;
        this.A08 = str4;
        this.A07 = str5;
        this.A04 = str6;
        this.A06 = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
    }
}
