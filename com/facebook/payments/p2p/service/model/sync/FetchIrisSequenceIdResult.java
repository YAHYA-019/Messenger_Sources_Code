package com.facebook.payments.p2p.service.model.sync;

import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchIrisSequenceIdResult.class */
public class FetchIrisSequenceIdResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(23);
    public final String mIrisSequenceId;

    public FetchIrisSequenceIdResult() {
        this.mIrisSequenceId = null;
    }

    public FetchIrisSequenceIdResult(Parcel parcel) {
        this.mIrisSequenceId = parcel.readString();
    }

    public FetchIrisSequenceIdResult(String str) {
        this.mIrisSequenceId = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mIrisSequenceId);
    }
}
