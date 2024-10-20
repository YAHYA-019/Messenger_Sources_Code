package com.facebook.messaging.sms.defaultapp.send;

import X.1BK;
import X.AnonymousClass001;
import X.C53v;
import X.CSU;
import X.HAn;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PendingSendMessage.class */
public final class PendingSendMessage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(68);
    public int A00;
    public int A01;
    public int A02;
    public HAn A03;
    public boolean A04;
    public final long A05;
    public final long A06;
    public final String A07;

    public PendingSendMessage(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A05 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A04 = C53v.A0S(parcel);
        this.A00 = parcel.readInt();
        this.A03 = HAn.valueOf(parcel.readString());
        this.A02 = parcel.readInt();
    }

    public static void A00(Intent intent, PendingSendMessage pendingSendMessage) {
        Bundle bundleExtra = intent.getBundleExtra("mmssms_custom_bundle");
        if (bundleExtra == null) {
            bundleExtra = 1BK.A05();
            intent.putExtra("mmssms_custom_bundle", bundleExtra);
        }
        bundleExtra.putParcelable("pending_send_message", pendingSendMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PendingSendMessage{mMessageId='");
        A0k.append(this.A07);
        A0k.append('\'');
        A0k.append(", mThreadId=");
        A0k.append(this.A05);
        A0k.append(", mTimestampMs=");
        A0k.append(this.A06);
        A0k.append(", mRetryCount=");
        A0k.append(this.A01);
        A0k.append(", mIsExpired=");
        A0k.append(this.A04);
        A0k.append(", mMessageSize=");
        A0k.append(this.A00);
        A0k.append(", mLastErrorType=");
        A0k.append(this.A03);
        A0k.append(", mSubId =");
        A0k.append(this.A02);
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03.name());
        parcel.writeInt(this.A02);
    }
}
