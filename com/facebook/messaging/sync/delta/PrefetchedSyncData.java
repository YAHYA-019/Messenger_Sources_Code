package com.facebook.messaging.sync.delta;

import X.4YV;
import X.AbN;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import java.util.Map;

/* loaded from: PrefetchedSyncData.class */
public final class PrefetchedSyncData implements Parcelable {
    public static final PrefetchedSyncData A03 = new PrefetchedSyncData(ImmutableList.of(), RegularImmutableMap.A03, RegularImmutableSet.A05);
    public static final Parcelable.Creator CREATOR = CSU.A00(73);
    public final ImmutableList A00;
    public final ImmutableMap A01;
    public final ImmutableSet A02;

    public PrefetchedSyncData(Parcel parcel) {
        this.A01 = ImmutableMap.copyOf((Map) parcel.readHashMap(PrefetchedSyncData.class.getClassLoader()));
        this.A00 = AbN.A0e(parcel, PrefetchedSyncData.class);
        this.A02 = ImmutableSet.A07(4YV.A0y(parcel, PrefetchedSyncData.class));
    }

    public PrefetchedSyncData(ImmutableList immutableList, ImmutableMap immutableMap, ImmutableSet immutableSet) {
        this.A01 = immutableMap;
        this.A00 = immutableList;
        this.A02 = immutableSet;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(PrefetchedSyncData.class);
        stringHelper.add("threadSummariesByThreadKey", this.A01);
        return 4YV.A0s(stringHelper, this.A00, "threadsFetchedFromServer");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A01);
        parcel.writeList(this.A00);
        parcel.writeList(this.A02.asList());
    }
}
