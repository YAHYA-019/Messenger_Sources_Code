package com.facebook.messaging.notify;

import X.1BL;
import X.4YT;
import X.4YV;
import X.AbM;
import X.AnonymousClass002;
import X.BMx;
import X.C53v;
import X.C5ap;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;
import java.util.HashMap;

/* loaded from: MessengerMessageReminderNotification.class */
public final class MessengerMessageReminderNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(76);
    public boolean A00;
    public final ThreadKey A01;
    public final BMx A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public MessengerMessageReminderNotification(Parcel parcel) {
        super(parcel);
        this.A05 = AbM.A0t(parcel);
        this.A03 = AbM.A0t(parcel);
        Parcelable A0C = 1BL.A0C(parcel, ThreadKey.class);
        A0C.getClass();
        this.A01 = (ThreadKey) A0C;
        BMx A07 = C53v.A07(parcel, BMx.class);
        A07.getClass();
        this.A02 = A07;
        this.A06 = C53v.A0S(parcel);
        this.A04 = AbM.A0t(parcel);
        this.A00 = C53v.A0S(parcel);
    }

    public MessengerMessageReminderNotification(ThreadKey threadKey, BMx bMx, PushProperty pushProperty, String str, String str2, String str3, boolean z) {
        super(C5ap.A1r, pushProperty);
        this.A05 = str;
        this.A03 = str2;
        this.A01 = threadKey;
        this.A02 = bMx;
        this.A06 = z;
        this.A04 = str3;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification
    public HashMap A03() {
        HashMap A03 = super.A03();
        A03.put(4YT.A00(1092), Boolean.toString(this.A06));
        return A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessengerMessageReminderNotification)) {
            return false;
        }
        MessengerMessageReminderNotification messengerMessageReminderNotification = (MessengerMessageReminderNotification) obj;
        if (this.A00 == messengerMessageReminderNotification.A00 && this.A05.equals(messengerMessageReminderNotification.A05) && this.A03.equals(messengerMessageReminderNotification.A03) && this.A02 == messengerMessageReminderNotification.A02 && this.A06 == messengerMessageReminderNotification.A06 && this.A04.equals(messengerMessageReminderNotification.A04)) {
            return this.A01.equals(messengerMessageReminderNotification.A01);
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A04, (AnonymousClass002.A05(this.A01, AnonymousClass002.A07(this.A03, 4YV.A02(this.A05))) + (this.A06 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0);
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        C53v.A0J(parcel, this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
