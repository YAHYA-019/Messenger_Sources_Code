package com.facebook.fbservice.results;

import X.EnumC08284mf;
import android.os.Parcel;

/* loaded from: BaseResult.class */
public class BaseResult {
    public final long clientTimeMs;
    public final EnumC08284mf freshness;

    public BaseResult() {
        this(null, 0L);
    }

    public BaseResult(EnumC08284mf enumC08284mf, long j) {
        this.freshness = enumC08284mf;
        this.clientTimeMs = j;
    }

    public BaseResult(Parcel parcel) {
        this.freshness = (EnumC08284mf) parcel.readSerializable();
        this.clientTimeMs = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.freshness);
        parcel.writeLong(this.clientTimeMs);
    }
}
