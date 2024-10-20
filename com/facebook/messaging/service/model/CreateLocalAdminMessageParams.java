package com.facebook.messaging.service.model;

import X.1BL;
import X.C53v;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.messages.Message;

/* loaded from: CreateLocalAdminMessageParams.class */
public final class CreateLocalAdminMessageParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(76);
    public final Message A00;
    public final boolean A01;

    public CreateLocalAdminMessageParams(Parcel parcel) {
        this.A00 = (Message) 1BL.A0C(parcel, Message.class);
        this.A01 = C53v.A0S(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
