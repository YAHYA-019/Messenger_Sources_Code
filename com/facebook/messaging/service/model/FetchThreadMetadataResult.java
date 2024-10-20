package com.facebook.messaging.service.model;

import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadMetadata;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* loaded from: FetchThreadMetadataResult.class */
public final class FetchThreadMetadataResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(99);
    public final ImmutableList A00;

    public FetchThreadMetadataResult(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ThreadMetadata.class.getClassLoader());
        this.A00 = ImmutableList.copyOf(Arrays.copyOf(readParcelableArray, readParcelableArray.length, ThreadMetadata[].class));
    }

    public FetchThreadMetadataResult(ImmutableList immutableList) {
        immutableList.getClass();
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray((ThreadMetadata[]) this.A00.toArray(new ThreadMetadata[0]), i);
    }
}
