package com.facebook.messaging.service.model;

import X.4YV;
import X.AbK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.MoreObjects;

/* loaded from: MarkThreadResult.class */
public final class MarkThreadResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(4);
    public final ThreadKey A00;

    public MarkThreadResult(Parcel parcel) {
        this.A00 = AbK.A0X(parcel);
    }

    public MarkThreadResult(ThreadKey threadKey) {
        this.A00 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 4YV.A0s(MoreObjects.toStringHelper((Class) getClass()), this.A00, "threadKey");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
