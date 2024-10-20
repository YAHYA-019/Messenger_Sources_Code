package com.facebook.messaging.service.model;

import X.1BL;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AcceptMessageRequestParams.class */
public final class AcceptMessageRequestParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(71);
    public final ThreadKey A00;

    public AcceptMessageRequestParams(Parcel parcel) {
        this.A00 = (ThreadKey) 1BL.A0C(parcel, ThreadKey.class);
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
