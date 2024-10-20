package com.facebook.xapp.messaging.reactions.multi.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MessageReactionCount.class */
public final class MessageReactionCount implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(59);
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public MessageReactionCount(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A02 = parcel.readString();
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A01 = parcel.readLong();
        this.A04 = C3o5.A0O(parcel);
        this.A05 = 4YV.A1U(parcel.readInt());
    }

    public MessageReactionCount(String str, String str2, String str3, int i, long j, boolean z) {
        this.A00 = i;
        C1pq.A08("reaction", str);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = j;
        this.A04 = str3;
        this.A05 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessageReactionCount)) {
                return false;
            }
            MessageReactionCount messageReactionCount = (MessageReactionCount) obj;
            if (this.A00 != messageReactionCount.A00 || !11T.A0O(this.A02, messageReactionCount.A02) || !11T.A0O(this.A03, messageReactionCount.A03) || this.A01 != messageReactionCount.A01 || !11T.A0O(this.A04, messageReactionCount.A04) || this.A05 != messageReactionCount.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A04, C1pq.A01(C1pq.A04(this.A03, C1pq.A04(this.A02, this.A00 + 31)), this.A01)), this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        1BL.A13(parcel, this.A03);
        parcel.writeLong(this.A01);
        1BL.A13(parcel, this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
