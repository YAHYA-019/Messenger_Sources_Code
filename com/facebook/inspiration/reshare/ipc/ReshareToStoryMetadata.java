package com.facebook.inspiration.reshare.ipc;

import X.0Pz;
import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ReshareToStoryMetadata.class */
public final class ReshareToStoryMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKc(69);
    public final String A00;
    public final String A01;

    public ReshareToStoryMetadata(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = C3o5.A0O(parcel);
    }

    public ReshareToStoryMetadata(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReshareToStoryMetadata)) {
                return false;
            }
            ReshareToStoryMetadata reshareToStoryMetadata = (ReshareToStoryMetadata) obj;
            if (!11T.A0O(this.A00, reshareToStoryMetadata.A00) || !11T.A0O(this.A01, reshareToStoryMetadata.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    public String toString() {
        return 0Pz.A0z("ReshareToStoryMetadata{shareSource=", this.A00, ", trackingCode=", this.A01, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
    }
}
