package com.facebook.messaging.service.model;

import X.1BL;
import X.1He;
import X.82M;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.ThreadCriteria;
import com.facebook.user.model.User;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;

/* loaded from: FetchThreadParams.class */
public final class FetchThreadParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(85);
    public boolean A00;
    public final int A01;
    public final long A02;
    public final 1He A03;
    public final 1He A04;
    public final ThreadCriteria A05;
    public final ImmutableList A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public FetchThreadParams(1He r302, 1He r303, ThreadCriteria threadCriteria, ImmutableList immutableList, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A05 = threadCriteria;
        this.A03 = r302;
        this.A04 = r303 == null ? r302 : r303;
        this.A06 = immutableList;
        this.A01 = i;
        this.A0A = z5;
        this.A08 = z2;
        this.A07 = z;
        this.A00 = z3;
        this.A09 = z4;
        this.A02 = j;
    }

    public FetchThreadParams(Parcel parcel) {
        this.A05 = (ThreadCriteria) 1BL.A0C(parcel, ThreadCriteria.class);
        this.A03 = 1He.valueOf(parcel.readString());
        this.A04 = 1He.valueOf(parcel.readString());
        this.A06 = C53v.A02(parcel, User.CREATOR);
        this.A01 = parcel.readInt();
        this.A0A = C53v.A0S(parcel);
        this.A08 = C53v.A0S(parcel);
        this.A07 = C53v.A0S(parcel);
        this.A00 = C53v.A0S(parcel);
        this.A09 = C53v.A0S(parcel);
        this.A02 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(FetchThreadParams.class);
        stringHelper.add("threadCriteria", this.A05);
        stringHelper.add("dataFreshness", this.A03);
        stringHelper.add("originalDataFreshness", this.A04);
        stringHelper.add("numToFetch", this.A01);
        stringHelper.add("shouldTraceFetch", this.A0A);
        stringHelper.add("isFromPrefetch", this.A08);
        stringHelper.add("isFromNotification", this.A07);
        stringHelper.add("shouldFetchUsersSeparately", this.A09);
        stringHelper.add("taskId", this.A02);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A03.toString());
        parcel.writeString(this.A04.toString());
        C53v.A0D(parcel, this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeLong(this.A02);
    }
}
