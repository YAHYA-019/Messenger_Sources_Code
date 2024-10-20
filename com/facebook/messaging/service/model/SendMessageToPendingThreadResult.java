package com.facebook.messaging.service.model;

import X.AbK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: SendMessageToPendingThreadResult.class */
public final class SendMessageToPendingThreadResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(18);
    public final ThreadKey A00;

    public SendMessageToPendingThreadResult(Parcel parcel) {
        this.A00 = AbK.A0X(parcel);
    }

    public SendMessageToPendingThreadResult(ThreadKey threadKey) {
        this.A00 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
