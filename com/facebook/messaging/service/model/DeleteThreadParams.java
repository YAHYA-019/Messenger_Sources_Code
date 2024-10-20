package com.facebook.messaging.service.model;

import X.AbK;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: DeleteThreadParams.class */
public final class DeleteThreadParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(79);
    public final ThreadKey A00;

    public DeleteThreadParams(Parcel parcel) {
        this.A00 = AbK.A0X(parcel);
    }

    public DeleteThreadParams(ThreadKey threadKey) {
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
