package com.facebook.messaging.service.model;

import X.1BL;
import X.AbN;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.ParticipantInfo;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: SendMessageByRecipientsParams.class */
public final class SendMessageByRecipientsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(14);
    public boolean A00;
    public final Message A01;
    public final ImmutableList A02;
    public final String A03;

    public SendMessageByRecipientsParams(Parcel parcel) {
        this.A00 = false;
        this.A03 = parcel.readString();
        this.A01 = (Message) 1BL.A0C(parcel, Message.class);
        this.A02 = AbN.A0e(parcel, ParticipantInfo.class);
    }

    public SendMessageByRecipientsParams(Message message, List list) {
        this.A00 = false;
        this.A03 = null;
        this.A01 = message;
        this.A02 = ImmutableList.copyOf((Collection) list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeList(this.A02);
    }
}
