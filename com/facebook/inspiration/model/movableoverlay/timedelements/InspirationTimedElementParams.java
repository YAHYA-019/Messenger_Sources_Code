package com.facebook.inspiration.model.movableoverlay.timedelements;

import X.0Pz;
import X.AnonymousClass001;
import X.C3o5;
import X.FKc;
import X.RIT;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationTimedElementParams.class */
public final class InspirationTimedElementParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(65);
    public final int A00;
    public final int A01;

    public InspirationTimedElementParams(RIT rit) {
        int i = rit.A00;
        this.A00 = i;
        int i2 = rit.A01;
        this.A01 = i2;
        if (i2 >= i) {
            throw AnonymousClass001.A0N(0Pz.A0b("Start time (", ") is after end time (", ')', i2, i));
        }
    }

    public InspirationTimedElementParams(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationTimedElementParams)) {
                return false;
            }
            InspirationTimedElementParams inspirationTimedElementParams = (InspirationTimedElementParams) obj;
            if (this.A00 != inspirationTimedElementParams.A00 || this.A01 != inspirationTimedElementParams.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00 + 31) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
