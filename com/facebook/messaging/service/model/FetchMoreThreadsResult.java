package com.facebook.messaging.service.model;

import X.1BL;
import X.1F9;
import X.4YV;
import X.82M;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.results.DataFetchDisposition;
import com.facebook.messaging.model.messages.MessagesCollection;
import com.facebook.messaging.model.threads.ThreadMetadata;
import com.facebook.messaging.model.threads.ThreadsCollection;
import com.facebook.user.model.User;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: FetchMoreThreadsResult.class */
public final class FetchMoreThreadsResult implements Parcelable {
    public static final FetchMoreThreadsResult A07 = new FetchMoreThreadsResult(DataFetchDisposition.A0I, 1F9.A0I, ThreadsCollection.A03, null, null, null, -1);
    public static final Parcelable.Creator CREATOR = new 82M(84);
    public final long A00;
    public final DataFetchDisposition A01;
    public final 1F9 A02;
    public final ThreadsCollection A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final ImmutableList A06;

    public FetchMoreThreadsResult(Parcel parcel) {
        Parcelable A0C = 1BL.A0C(parcel, DataFetchDisposition.class);
        A0C.getClass();
        this.A01 = (DataFetchDisposition) A0C;
        String readString = parcel.readString();
        readString.getClass();
        this.A02 = 1F9.A00(readString);
        Parcelable A0C2 = 1BL.A0C(parcel, ThreadsCollection.class);
        A0C2.getClass();
        this.A03 = (ThreadsCollection) A0C2;
        ArrayList A0y = 4YV.A0y(parcel, ThreadMetadata.class);
        A0y.getClass();
        this.A05 = ImmutableList.copyOf((Collection) A0y);
        ArrayList A0y2 = 4YV.A0y(parcel, User.class);
        A0y2.getClass();
        this.A06 = ImmutableList.copyOf((Collection) A0y2);
        this.A00 = parcel.readLong();
        ArrayList A0y3 = 4YV.A0y(parcel, MessagesCollection.class);
        A0y3.getClass();
        this.A04 = ImmutableList.copyOf((Collection) A0y3);
    }

    public FetchMoreThreadsResult(DataFetchDisposition dataFetchDisposition, 1F9 r303, ThreadsCollection threadsCollection, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, long j) {
        this.A01 = dataFetchDisposition;
        this.A02 = r303;
        this.A03 = threadsCollection;
        this.A05 = immutableList == null ? ImmutableList.of() : immutableList;
        this.A06 = immutableList2 == null ? ImmutableList.of() : immutableList2;
        this.A00 = j;
        this.A04 = immutableList3 == null ? ImmutableList.of() : immutableList3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof FetchMoreThreadsResult)) {
                return false;
            }
            FetchMoreThreadsResult fetchMoreThreadsResult = (FetchMoreThreadsResult) obj;
            if (Objects.equal(Long.valueOf(this.A00), Long.valueOf(fetchMoreThreadsResult.A00)) && Objects.equal(this.A02, fetchMoreThreadsResult.A02) && Objects.equal(this.A01, fetchMoreThreadsResult.A01) && Objects.equal(this.A04, fetchMoreThreadsResult.A04) && Objects.equal(this.A03, fetchMoreThreadsResult.A03) && Objects.equal(this.A05, fetchMoreThreadsResult.A05) && Objects.equal(this.A06, fetchMoreThreadsResult.A06)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), this.A02, this.A01, this.A04, this.A03, this.A05, this.A06});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02.dbName);
        parcel.writeParcelable(this.A03, i);
        parcel.writeList(this.A05);
        parcel.writeList(this.A06);
        parcel.writeLong(this.A00);
        parcel.writeList(this.A04);
    }
}
