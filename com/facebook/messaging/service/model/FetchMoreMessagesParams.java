package com.facebook.messaging.service.model;

import X.AbK;
import X.C53v;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.base.MoreObjects;

/* loaded from: FetchMoreMessagesParams.class */
public final class FetchMoreMessagesParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(92);
    public final int A00;
    public final long A01;
    public final ThreadKey A02;
    public final boolean A03;
    public final boolean A04;

    public FetchMoreMessagesParams(Parcel parcel) {
        this.A02 = AbK.A0X(parcel);
        this.A01 = parcel.readLong();
        this.A00 = parcel.readInt();
        this.A03 = C53v.A0S(parcel);
        this.A04 = C53v.A0S(parcel);
    }

    public FetchMoreMessagesParams(ThreadKey threadKey, int i, long j, boolean z, boolean z2) {
        this.A02 = threadKey;
        this.A01 = j;
        this.A00 = i;
        this.A03 = z;
        this.A04 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(FetchMoreMessagesParams.class);
        stringHelper.add("threadKey", this.A02);
        stringHelper.add("endTimeMs", this.A01);
        stringHelper.add("maxToFetch", this.A00);
        stringHelper.add("hitServerIfNeeded", this.A03);
        stringHelper.add("isLoadingMoreMessagesContext", this.A04);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
