package com.facebook.xapp.messaging.reactions.reactors.model;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MessageReactor.class */
public final class MessageReactor implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(60);
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final String A07;

    public MessageReactor(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A07 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readLong();
        this.A03 = parcel.readString();
        this.A05 = parcel.readLong();
        this.A00 = parcel.readLong();
        this.A06 = parcel.readLong();
    }

    public MessageReactor(String str, String str2, String str3, String str4, long j, long j2, long j3, long j4) {
        C1pq.A08("fullName", str);
        this.A01 = str;
        this.A07 = str2;
        this.A02 = str3;
        this.A04 = j;
        this.A03 = str4;
        this.A05 = j2;
        this.A00 = j3;
        this.A06 = j4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessageReactor)) {
                return false;
            }
            MessageReactor messageReactor = (MessageReactor) obj;
            if (!11T.A0O(this.A01, messageReactor.A01) || !11T.A0O(this.A07, messageReactor.A07) || !11T.A0O(this.A02, messageReactor.A02) || this.A04 != messageReactor.A04 || !11T.A0O(this.A03, messageReactor.A03) || this.A05 != messageReactor.A05 || this.A00 != messageReactor.A00 || this.A06 != messageReactor.A06) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A01(C1pq.A01(C1pq.A04(this.A03, C1pq.A01(C1pq.A04(this.A02, C1pq.A04(this.A07, C1pq.A03(this.A01))), this.A04)), this.A05), this.A00), this.A06);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A04);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A06);
    }
}
