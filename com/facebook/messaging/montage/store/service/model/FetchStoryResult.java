package com.facebook.messaging.montage.store.service.model;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.CST;
import X.RFt;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;

/* loaded from: FetchStoryResult.class */
public final class FetchStoryResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(30);
    public final Message A00;

    public FetchStoryResult(RFt rFt) {
        this.A00 = rFt.A00;
    }

    public FetchStoryResult(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) == 0 ? null : (Message) Message.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FetchStoryResult) && 11T.A0O(this.A00, ((FetchStoryResult) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Message message = this.A00;
        if (message == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            message.writeToParcel(parcel, i);
        }
    }
}
