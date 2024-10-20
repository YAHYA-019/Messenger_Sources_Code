package com.facebook.messaging.livelocation.params;

import X.AbK;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: LiveLocationParams.class */
public final class LiveLocationParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(6);
    public final ThreadKey A00;
    public final String A01;

    public LiveLocationParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = AbK.A0X(parcel);
    }

    public LiveLocationParams(ThreadKey threadKey, String str) {
        this.A01 = str;
        this.A00 = threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
