package com.facebook.messaging.service.model;

import X.4YV;
import X.AbK;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.MoreObjects;

/* loaded from: FetchMessageParams.class */
public final class FetchMessageParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(88);
    public final ThreadKey A00;
    public final String A01;

    public FetchMessageParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = AbK.A0X(parcel);
    }

    public FetchMessageParams(ThreadKey threadKey, String str) {
        this.A01 = str;
        this.A00 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return 4YV.A0s(MoreObjects.toStringHelper(this), this.A01, "mid");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
