package com.facebook.messaging.service.model;

import X.1BL;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: UpdateVanishModeSelectionResult.class */
public final class UpdateVanishModeSelectionResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(24);
    public final ThreadSummary A00;

    public UpdateVanishModeSelectionResult(Parcel parcel) {
        this.A00 = (ThreadSummary) 1BL.A0C(parcel, ThreadSummary.class);
    }

    public UpdateVanishModeSelectionResult(ThreadSummary threadSummary) {
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
