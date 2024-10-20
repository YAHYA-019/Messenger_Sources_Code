package com.facebook.ipc.composer.model;

import X.C1pq;
import X.DKI;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MediaPickerSurveyData.class */
public final class MediaPickerSurveyData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(97);
    public final long A00;
    public final boolean A01;

    public MediaPickerSurveyData(Parcel parcel) {
        this.A01 = DKI.A0k(parcel, this);
        this.A00 = parcel.readLong();
    }

    public MediaPickerSurveyData(boolean z, long j) {
        this.A01 = z;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MediaPickerSurveyData)) {
                return false;
            }
            MediaPickerSurveyData mediaPickerSurveyData = (MediaPickerSurveyData) obj;
            if (this.A01 != mediaPickerSurveyData.A01 || this.A00 != mediaPickerSurveyData.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A05(this.A01), this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeLong(this.A00);
    }
}
