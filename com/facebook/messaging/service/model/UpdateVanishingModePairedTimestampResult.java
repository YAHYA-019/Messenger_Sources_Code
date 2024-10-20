package com.facebook.messaging.service.model;

import X.1BL;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: UpdateVanishingModePairedTimestampResult.class */
public final class UpdateVanishingModePairedTimestampResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(26);
    public final ThreadSummary A00;

    public UpdateVanishingModePairedTimestampResult(Parcel parcel) {
        this.A00 = (ThreadSummary) 1BL.A0C(parcel, ThreadSummary.class);
    }

    public UpdateVanishingModePairedTimestampResult(ThreadSummary threadSummary) {
        this.A00 = threadSummary;
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
