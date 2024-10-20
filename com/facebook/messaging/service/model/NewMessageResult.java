package com.facebook.messaging.service.model;

import X.1BL;
import X.AbM;
import X.CSU;
import X.EnumC08284mf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.results.BaseResult;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: NewMessageResult.class */
public final class NewMessageResult extends BaseResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(7);
    public final Message A00;
    public final MessagesCollection A01;
    public final ThreadSummary A02;
    public final int A03;
    public final String A04;
    public final boolean A05;

    public NewMessageResult(EnumC08284mf enumC08284mf, Message message, MessagesCollection messagesCollection, ThreadSummary threadSummary, long j) {
        super(enumC08284mf, j);
        this.A00 = message;
        this.A01 = messagesCollection;
        this.A02 = threadSummary;
        this.A04 = "";
        this.A03 = -1;
        this.A05 = true;
    }

    public NewMessageResult(Parcel parcel) {
        super(parcel);
        boolean z = false;
        Parcelable A0C = 1BL.A0C(parcel, Message.class);
        A0C.getClass();
        this.A00 = (Message) A0C;
        this.A01 = (MessagesCollection) 1BL.A0C(parcel, MessagesCollection.class);
        this.A02 = (ThreadSummary) 1BL.A0C(parcel, ThreadSummary.class);
        this.A04 = AbM.A0t(parcel);
        this.A03 = parcel.readInt();
        this.A05 = parcel.readInt() == 1 ? true : z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.fbservice.results.BaseResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
    }
}
