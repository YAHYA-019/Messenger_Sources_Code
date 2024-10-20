package com.facebook.audience.model.interfaces;

import X.11T;
import X.7zU;
import X.C1pq;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MomentsStoryData.class */
public final class MomentsStoryData implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(7);
    public final String A00;

    public MomentsStoryData(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
    }

    public MomentsStoryData(String str) {
        C1pq.A08("momentsBucketId", str);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MomentsStoryData) && 11T.A0O(this.A00, ((MomentsStoryData) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
