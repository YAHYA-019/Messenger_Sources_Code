package com.facebook.messaging.service.model;

import X.1BL;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;

/* loaded from: SendMessageMethodParams.class */
public final class SendMessageMethodParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(15);
    public final Message A00;
    public final String A01;
    public final String A02;

    public SendMessageMethodParams(Parcel parcel) {
        this.A00 = (Message) 1BL.A0C(parcel, Message.class);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public SendMessageMethodParams(Message message, String str, String str2) {
        this.A00 = message;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
