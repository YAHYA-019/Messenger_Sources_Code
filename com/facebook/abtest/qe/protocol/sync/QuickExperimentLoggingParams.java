package com.facebook.abtest.qe.protocol.sync;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: QuickExperimentLoggingParams.class */
public final class QuickExperimentLoggingParams implements Parcelable {
    public static Parcelable.Creator CREATOR = new LGo(48);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public QuickExperimentLoggingParams(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
    }
}
