package com.facebook.graphql.executor.cachekey;

import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: JsonPathValue.class */
public class JsonPathValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(83);
    public String mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.mValue;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mValue);
    }
}
