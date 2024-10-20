package com.facebook.messaging.service.model;

import X.1BL;
import X.CSS;
import X.EnumC08284mf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.results.BaseResult;
import com.facebook.messaging.model.messages.Message;

/* loaded from: FetchMessageResult.class */
public final class FetchMessageResult extends BaseResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(89);
    public final Message A00;

    public FetchMessageResult(EnumC08284mf enumC08284mf, Message message, long j) {
        super(enumC08284mf, j);
        this.A00 = message;
    }

    public FetchMessageResult(Parcel parcel) {
        super(parcel);
        this.A00 = (Message) 1BL.A0C(parcel, Message.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.fbservice.results.BaseResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
    }
}
