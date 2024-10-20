package com.facebook.messaging.chatheads.ipc;

import X.11T;
import X.1BK;
import X.1BL;
import X.7zS;
import X.AbM;
import X.AnonymousClass001;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;

/* loaded from: ChatHeadMessageNotification.class */
public final class ChatHeadMessageNotification implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(50);
    public final long A00;
    public final Message A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public ChatHeadMessageNotification(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, Message.class);
        if (A0C == null) {
            throw 1BK.A0h();
        }
        this.A01 = (Message) A0C;
        parcel.readString();
        this.A03 = AnonymousClass001.A1N(parcel.readInt());
        this.A04 = 7zS.A1Z(parcel);
        this.A02 = AbM.A1V(parcel);
        this.A00 = parcel.readLong();
    }

    public ChatHeadMessageNotification(Message message, boolean z, boolean z2, boolean z3) {
        this.A01 = message;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = z3;
        this.A00 = -1;
    }

    public final Message A00() {
        return this.A01;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Message message = this.A01;
        parcel.writeParcelable(message, i);
        parcel.writeString(String.valueOf(message.A0V));
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeLong(this.A00);
    }
}
