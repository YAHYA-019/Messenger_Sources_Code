package com.facebook.messaging.model.threads;

import X.11T;
import X.1BL;
import X.4YV;
import X.82M;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: ThreadUpdate.class */
public final class ThreadUpdate implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(52);
    public final long A00;
    public final MessagesCollection A01;
    public final ThreadSummary A02;
    public final ImmutableList A03;
    public final String A04;

    public ThreadUpdate(Parcel parcel) {
        this.A02 = (ThreadSummary) 1BL.A0C(parcel, ThreadSummary.class);
        this.A01 = (MessagesCollection) 1BL.A0C(parcel, MessagesCollection.class);
        ArrayList A0y = 4YV.A0y(parcel, User.class);
        11T.A0I(A0y, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.user.model.User>");
        this.A03 = 1BL.A0a(A0y);
        this.A00 = parcel.readLong();
        this.A04 = parcel.readString();
    }

    public ThreadUpdate(MessagesCollection messagesCollection, ThreadSummary threadSummary, ImmutableList immutableList, String str, long j) {
        11T.A0F(immutableList, 3);
        this.A02 = threadSummary;
        this.A01 = messagesCollection;
        this.A03 = immutableList;
        this.A00 = j;
        this.A04 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeList(this.A03);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
    }
}
