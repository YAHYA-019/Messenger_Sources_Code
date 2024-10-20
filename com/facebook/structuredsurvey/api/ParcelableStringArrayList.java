package com.facebook.structuredsurvey.api;

import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: ParcelableStringArrayList.class */
public final class ParcelableStringArrayList extends ArrayList implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(70);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this);
    }
}
