package com.facebook.messaging.service.model;

import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;

/* loaded from: FetchThreadByParticipantsResult.class */
public final class FetchThreadByParticipantsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(96);
    public final ImmutableList A00;

    public FetchThreadByParticipantsResult(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ThreadSummary.class.getClassLoader());
        this.A00 = ImmutableList.copyOf(Arrays.copyOf(readParcelableArray, readParcelableArray.length, ThreadSummary[].class));
    }

    public FetchThreadByParticipantsResult(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        parcel.writeParcelableArray((ThreadSummary[]) immutableList.toArray(new ThreadSummary[immutableList.size()]), i);
    }
}
