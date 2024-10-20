package com.facebook.messaging.service.model;

import X.1BL;
import X.AbN;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbtrace.FbTraceNode;
import com.facebook.messaging.model.messages.Message;
import com.facebook.user.model.UserIdentifier;
import com.google.common.collect.ImmutableList;

/* loaded from: SendMessageToPendingThreadParams.class */
public final class SendMessageToPendingThreadParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(17);
    public final FbTraceNode A00;
    public final Message A01;
    public final ImmutableList A02;

    public SendMessageToPendingThreadParams(Parcel parcel) {
        this.A01 = (Message) 1BL.A0C(parcel, Message.class);
        this.A02 = AbN.A0e(parcel, UserIdentifier.class);
        this.A00 = (FbTraceNode) 1BL.A0C(parcel, FbTraceNode.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeList(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
