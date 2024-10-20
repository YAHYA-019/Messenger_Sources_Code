package com.facebook.audience.model.interfaces;

import X.11T;
import X.7zU;
import X.C1pq;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: GroupStoryData.class */
public final class GroupStoryData implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(6);
    public final String A00;

    public GroupStoryData(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
    }

    public GroupStoryData(String str) {
        C1pq.A08("groupId", str);
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GroupStoryData) && 11T.A0O(this.A00, ((GroupStoryData) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
