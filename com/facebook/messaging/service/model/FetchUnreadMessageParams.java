package com.facebook.messaging.service.model;

import X.AbK;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.MoreObjects;

/* loaded from: FetchUnreadMessageParams.class */
public final class FetchUnreadMessageParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(0);
    public final int A00;
    public final ThreadKey A01;

    public FetchUnreadMessageParams(Parcel parcel) {
        this.A01 = AbK.A0X(parcel);
        this.A00 = parcel.readInt();
    }

    public FetchUnreadMessageParams(ThreadKey threadKey, int i) {
        this.A01 = threadKey;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(FetchThreadParams.class);
        Object obj = this.A01;
        if (obj == null) {
            obj = "null";
        }
        stringHelper.add("threadKey", obj);
        stringHelper.add("numToFetch", this.A00);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
    }
}
