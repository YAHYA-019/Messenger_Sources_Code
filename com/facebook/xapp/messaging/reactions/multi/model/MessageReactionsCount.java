package com.facebook.xapp.messaging.reactions.multi.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.5PP;
import X.82N;
import X.C1pq;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: MessageReactionsCount.class */
public final class MessageReactionsCount implements Parcelable, 5PP {
    public static final Parcelable.Creator CREATOR = new 82N(25);
    public final long A00;
    public final ImmutableList A01;
    public final boolean A02;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageReactionsCount(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A02 = 4YV.A1U(parcel.readInt());
        int readInt = parcel.readInt();
        MessageReactionCount[] messageReactionCountArr = new MessageReactionCount[readInt];
        for (int i = 0; i < readInt; i++) {
            messageReactionCountArr[i] = parcel.readParcelable(A0e);
        }
        this.A01 = ImmutableList.copyOf(messageReactionCountArr);
        this.A00 = parcel.readLong();
    }

    public MessageReactionsCount(ImmutableList immutableList, long j, boolean z) {
        this.A02 = z;
        C1pq.A08("reactions", immutableList);
        this.A01 = immutableList;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessageReactionsCount)) {
                return false;
            }
            MessageReactionsCount messageReactionsCount = (MessageReactionsCount) obj;
            if (this.A02 != messageReactionsCount.A02 || !11T.A0O(this.A01, messageReactionsCount.A01) || this.A00 != messageReactionsCount.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        return C1pq.A01(C1pq.A04(this.A01, i + 31), this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((MessageReactionCount) A0b.next(), i);
        }
        parcel.writeLong(this.A00);
    }
}
