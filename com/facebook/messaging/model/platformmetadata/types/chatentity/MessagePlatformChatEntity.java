package com.facebook.messaging.model.platformmetadata.types.chatentity;

import X.11T;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MessagePlatformChatEntity.class */
public final class MessagePlatformChatEntity implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(53);
    public final String A00;
    public final String A01;

    public MessagePlatformChatEntity(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public MessagePlatformChatEntity(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
