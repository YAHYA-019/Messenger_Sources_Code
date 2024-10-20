package com.facebook.messaging.notify;

import X.C53v;
import X.C5ap;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.messaging.notify.type.MessagingNotification;
import java.util.HashMap;

/* loaded from: MultipleAccountsNewMessagesNotification.class */
public final class MultipleAccountsNewMessagesNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(79);
    public boolean A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public MultipleAccountsNewMessagesNotification(Parcel parcel) {
        super(parcel);
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = C53v.A0S(parcel);
    }

    public MultipleAccountsNewMessagesNotification(String str, String str2, int i) {
        super(C5ap.A2Q, null);
        this.A05 = str;
        this.A04 = "";
        this.A02 = str2;
        this.A03 = "";
        this.A01 = i;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification
    public HashMap A03() {
        HashMap A03 = super.A03();
        A03.put(ErrorReportingConstants.USER_ID_KEY, this.A05);
        A03.put("unseen_count", String.valueOf(this.A01));
        return A03;
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
